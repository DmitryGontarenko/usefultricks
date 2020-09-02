package com.home.usefultricks.liquibase.printform;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MetaFileDto {
    private String id;
    private byte[] content;
}
