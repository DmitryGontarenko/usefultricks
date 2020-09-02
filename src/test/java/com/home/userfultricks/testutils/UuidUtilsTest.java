package com.home.userfultricks.testutils;

import com.home.usefultricks.utils.UuidUtils;
import org.junit.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UuidUtilsTest {

    @Test
    public void uuidFormattingTest() {
        UUID uuid = UUID.randomUUID(); // создаем UUID
        String uuidWithoutHyphen = UuidUtils.removeHyphenFromGuid(uuid); // удаляем дефисы
        UUID uuidWithHyphen = UuidUtils.createUuidWithoutHyphen(uuidWithoutHyphen); // добавляем дефисы

        assertThat(uuid, is(uuidWithHyphen)); // сравниваем созданный и получившийся UUID
    }
}