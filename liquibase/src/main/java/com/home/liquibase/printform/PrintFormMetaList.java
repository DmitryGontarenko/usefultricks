package com.home.liquibase.printform;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Модель, которая описывает структуру
 * метаданных, содержащихся в виде массива,
 * в конфигурационном файле (application.yml)
 */
@Component
@ConfigurationProperties(prefix = "printform")
public class PrintFormMetaList {
    private List<PrintFormMeta> meta;

    public List<PrintFormMeta> getMeta() {
        return meta;
    }

    public void setMeta(List<PrintFormMeta> meta) {
        this.meta = meta;
    }
}
