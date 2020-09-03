package com.home.liquibase.printform;


/**
 * Модель, которая описывает структуру
 * одного элемента из массива
 * метаданных в конфигурационном файле (application.yml)
 */
public class PrintFormMeta {
    private String templateId;
    private String jasperTemplate;
    private String schema;
    private String templateMapping;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getJasperTemplate() {
        return jasperTemplate;
    }

    public void setJasperTemplate(String jasperTemplate) {
        this.jasperTemplate = jasperTemplate;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getTemplateMapping() {
        return templateMapping;
    }

    public void setTemplateMapping(String templateMapping) {
        this.templateMapping = templateMapping;
    }
}
