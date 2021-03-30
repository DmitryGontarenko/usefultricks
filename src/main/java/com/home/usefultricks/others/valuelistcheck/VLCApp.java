package com.home.usefultricks.others.valuelistcheck;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * Класс для проверки значения в списке существующих значений
 */
public class VLCApp {
    private final static Set<String> STATUS = ImmutableSet.of("CONNECTED", "BLOCKED", "ERROR");

    public static void main(String[] args) {
        String customStatus = "CLOSED";

        // Неправильно
        if (!"CONNECTED".equals(customStatus) ||
                !"BLOCED".equals(customStatus) ||
                !"ERROR".equals(customStatus)) {
            System.out.println("Статус отсутствует");
        }

        // Правильно
        if (!STATUS.contains(customStatus)) {
            System.out.println("Статус отсутствует");
        }
    }
}
