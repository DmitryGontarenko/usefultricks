package com.home.usefultricks.utils;

import java.util.UUID;

public class UuidUtils {
    private static final String UUID_CREATION_REGEX = "([0-9a-fA-F]{8})([0-9a-fA-F]{4})([0-9a-fA-F]{4})([0-9a-fA-F]{4})([0-9a-fA-F]{12})";
    private static final String UUID_CREATION_REPLACEMENT = "$1-$2-$3-$4-$5";

    private UuidUtils() {

    }

    /**
     * Преобразование GUID - добавление дефисов
     *
     * @param guidWithoutHyphen cтрока, представляющая GUID без дефисов
     * @return UUID
     */
    @Deprecated
    public static UUID addHyphenToGuid(String guidWithoutHyphen) {
        if (guidWithoutHyphen != null && guidWithoutHyphen.length() == 32) {
            return UUID.fromString(guidWithoutHyphen.substring(0, 8) + "-" + guidWithoutHyphen.substring(8, 12) + "-" + guidWithoutHyphen.substring(12, 16)
                    + "-" + guidWithoutHyphen.substring(16, 20) + "-" + guidWithoutHyphen.substring(20));
        } else {
            throw new IllegalArgumentException("UUID must contain 32 symbols");
        }
    }

    /**
     * Преобразование GUID - добавление дефисов.
     * С использованием регулярных выражений.
     *
     * @param guidWithoutHyphen cтрока, представляющая GUID без дефисов
     * @return UUID
     */
    public static UUID createUuidWithoutHyphen(String guidWithoutHyphen) {
        if (guidWithoutHyphen != null && guidWithoutHyphen.length() == 32) {
            return UUID.fromString(guidWithoutHyphen.replaceFirst(UUID_CREATION_REGEX, UUID_CREATION_REPLACEMENT));
        } else {
            throw new IllegalArgumentException("UUID must contain 32 symbols");
        }
    }

    /**
     * Преобразование GUID - удаление дефисов
     *
     * @param uuid UUID
     * @return cтрока, представляющая GUID без дефисов
     */
    public static String removeHyphenFromGuid(UUID uuid) {
        if (uuid != null) {
            return uuid.toString().replaceAll("-", "");
        } else {
            throw new IllegalArgumentException("UUID must be not null");
        }
    }
}
