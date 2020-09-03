package com.home.liquibase.migration;

import com.home.liquibase.printform.PrintFormMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MigrationRun {

    @Autowired
    private PrintFormMetaService printFormMetaService;

    @Autowired
    private MigrationService migrationService;

    /**
     * Данный метод добавляет данные шаблона
     * в таблицу print_form_meta, которая была создана ранее
     * и запускает миграцию, которая создает остальные таблицу,
     * заполняя их на основе print_from_meta
     */
    @PostConstruct
    public void init() {
        printFormMetaService.insertMasterData();
        migrationService.migrate();
    }
}
