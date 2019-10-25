package com.accenture.usefultricks.printform;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Модель, которая описывает структуру
 * одного элемента из массива
 * метаданных в конфигурационном файле
 */
@Data
@NoArgsConstructor
public class PrintFormMeta {
    private String templateId;
    private String jasperTemplate;
    private String schema;
    private String templateMapping;
}
