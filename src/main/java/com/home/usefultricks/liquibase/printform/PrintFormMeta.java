package com.home.usefultricks.liquibase.printform;


/**
 * Модель, которая описывает структуру
 * одного элемента из массива
 * метаданных в конфигурационном файле
 */
public class PrintFormMeta {
    private String templateId;
    private String jasperTemplate;
    private String schema;
    private String templateMapping;

    public String getTemplateId() {
        return templateId;
    }

    public String getJasperTemplate() {
        return jasperTemplate;
    }

    public String getSchema() {
        return schema;
    }

    public String getTemplateMapping() {
        return templateMapping;
    }
}
