package com.home.usefultricks.liquibase.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "print_form_meta")
@NoArgsConstructor
@AllArgsConstructor
public class PrintFormMetaEntity {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "meta_file")
    private byte[] metaFile;
}
