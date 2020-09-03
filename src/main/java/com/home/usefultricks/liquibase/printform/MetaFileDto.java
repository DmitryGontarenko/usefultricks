package com.home.usefultricks.liquibase.printform;


public class MetaFileDto {
    private String id;
    private byte[] content;

    public MetaFileDto() {
    }

    public MetaFileDto(String id, byte[] content) {
        this.id = id;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public byte[] getContent() {
        return content;
    }
}
