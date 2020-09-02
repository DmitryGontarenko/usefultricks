package com.home.usefultricks.liquibase.migration;

import liquibase.exception.LiquibaseException;
import liquibase.integration.spring.SpringLiquibase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MigrationServiceImpl implements MigrationService {

    private Logger LOGGER = LoggerFactory.getLogger(MigrationServiceImpl.class);

    @Autowired
    private CustomMigrationConfig migrationConfig;

    @Override
    public void migrate() {
        try {
            SpringLiquibase liquibase = migrationConfig.getLiquibase();
            liquibase.setShouldRun(true);
            liquibase.afterPropertiesSet();
        } catch (LiquibaseException e) {
            LOGGER.error("Migration error {}", e.getMessage());
        }
    }
}
