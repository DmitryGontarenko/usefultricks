package com.accenture.usefultricks.migration;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.io.File;

/**
 * В этом классе задаются основные настройки liquibase
 */
@Configuration
public class CustomMigrationConfig {

    @Autowired
    private SpringLiquibase liquibase;

    /**
     * Данный метод устанавливает путь, где находится
     * файл-конфигурации, а так же указывает, надо ли
     * удалять данные из БД перед выполнением изменений.
     * @return объект типа SpringLiquibase, который
     * инициализирован параметрами change-log и drop-first.
     */
    public SpringLiquibase getLiquibase() {
        StringBuilder sb = new StringBuilder();
        sb.append("db")
                .append(File.separator)
                .append("migration-custom")
                .append(File.separator)
                .append("changelog.xml");

        liquibase.setChangeLog("classpath:" + sb);
        liquibase.setDropFirst(false);
        return liquibase;
    }
}
