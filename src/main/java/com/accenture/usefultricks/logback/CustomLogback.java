package com.accenture.usefultricks.logback;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import com.accenture.usefultricks.Application;
import com.accenture.usefultricks.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLogback extends ClassicConverter {

    private static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    private long start = System.nanoTime();

    /**
     * Метод для тестирования конфигурации Evaluators в logback
     */
    public void evaluators() {
        LOGGER.info("Hello there");
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                LOGGER.info("logging statement " + i, new CustomException("do not display"));
            } else {
                LOGGER.info("logging statement " + i, new Exception("display"));
            }
        }
    }

    public void showAllLevels() {
        LOGGER.info("Custom info 1");
        LOGGER.debug("Custom debug 2");
        LOGGER.trace("Custom trace 3");
        LOGGER.error("Custom error 4");
        LOGGER.warn("Custom warn 5");
    }

    /**
     * Данными метод возвращает количество наносекунд, прошедших с
     * момента его создания.
     */
    @Override
    public String convert(ILoggingEvent iLoggingEvent) {
        long nowInNanos = System.nanoTime();
        return Long.toString(nowInNanos - start);
    }
}
