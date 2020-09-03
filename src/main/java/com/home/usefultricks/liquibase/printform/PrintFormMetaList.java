package com.home.usefultricks.liquibase.printform;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Модель, которая описывает структуру
 * метаданных, содержащихся в виде массива,
 * в конфигурационном файле
 */
@Component
@ConfigurationProperties(prefix = "printform")
public class PrintFormMetaList {
    private List<PrintFormMeta> meta;

    public List<PrintFormMeta> getMeta() {
        return meta;
    }
}
