package com.accenture.usefultricks.logback;

import com.accenture.usefultricks.Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLogback {

    private static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public void showAllLevels() {
        LOGGER.info("Custom info 1");
        LOGGER.debug("Custom debug 2");
        LOGGER.trace("Custom trace 3");
        LOGGER.error("Custom error 4");
        LOGGER.warn("Custom warn 5");
    }

}
