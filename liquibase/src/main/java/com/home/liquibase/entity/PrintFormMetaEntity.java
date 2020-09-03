package com.home.liquibase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "print_form_meta")
public class PrintFormMetaEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "meta_file")
    private byte[] metaFile;

    public PrintFormMetaEntity() {
    }

    public PrintFormMetaEntity(String id, byte[] metaFile) {
        this.id = id;
        this.metaFile = metaFile;
    }
}
