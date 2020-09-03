package com.home.liquibase.printform;

import com.home.liquibase.repository.PrintFromMetaRepository;
import com.home.liquibase.entity.PrintFormMetaEntity;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class PrintFormMetaServiceImpl implements PrintFormMetaService {

    private Logger LOGGER = LoggerFactory.getLogger(PrintFormMetaServiceImpl.class);

    @Autowired
    private PrintFormMetaList printFormMetaList;

    @Autowired
    private PrintFromMetaRepository printFromMetaRepository;

    @Autowired
    private ResourceLoader resourceLoader;

    /**
     * Данный метод сохраняет данные в БД:
     * 1. Проходимя циклом foreach по листу PrintFormMetaList,
     * 2. каждый элемент листа типа PrintFormMeta передаем метод getMetaFiles.
     * 3. Метод getMetaFiles возвращает нам заполненный лист, проходимся по нему циклом foreach
     * 4. и передаем каждый элемент в метод savePrintFormMeta, который
     * в свою очередь будет записывать переданные ему данные в БД
     */
    @Override
    public void insertMasterData() {
        // если массив в конфигурационном файле пустой - выходим из метода
        if (CollectionUtils.isEmpty(printFormMetaList.getMeta())) {
            return;
        }
        printFormMetaList.getMeta()
                .stream()
                .filter(Objects::nonNull)
                .forEach(pfmeta -> {
                    getMetaFiles(pfmeta)
                            .forEach(pfmlist -> {
                                savePrintFormMeta(pfmlist.getId(), pfmlist.getContent());
                    });
                });

    }

    /**
     * Данный метод возвращает заполненный лист
     * типа MetaFileDto, который содержит данные в формате
     * имя_шаблона#имя_файла | доичные данные
     */
    private List<MetaFileDto> getMetaFiles(PrintFormMeta printFormMeta) {
        String templateId = printFormMeta.getTemplateId();

        List<MetaFileDto> result = new ArrayList<>();
        addMetaFile(templateId, printFormMeta.getJasperTemplate(), result);
        addMetaFile(templateId, printFormMeta.getSchema(), result);
        addMetaFile(templateId, printFormMeta.getTemplateMapping(), result);

        return result;
    }

    /**
     * Данный метод добавлят в лист типа MetaFileDto название
     * шаблона документа (печатной формы) и содержимое файла в byte-коде
     * @param templateId наименование шаблона документа
     * @param fileName наименование файла, который будет записан в лист
     */
    private void addMetaFile(String templateId, String fileName, List<MetaFileDto> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("forms")
                .append(File.separator)
                .append(templateId)
                .append(File.separator)
                .append(fileName);

        try {
            list.add(new MetaFileDto(
                    templateId + "#" + fileName,
                    FileUtils.readFileToByteArray(resourceLoader.getResource("classpath:" + sb.toString()).getFile())
            ));
        } catch (IOException ignore) {}
    }

    /**
     * Данный метод производит сохранения в БД
     * переднных ему параметров id, content
     */
    private void savePrintFormMeta(String id, byte[] content) {
        printFromMetaRepository.save(new PrintFormMetaEntity(id, content));
    }
}
