package com.home.jooq.exeptions;

public enum RestExceptionsMessages {
    ERROR_REST_INCORRECTRESPONSECODE("Код ответа не соответствует ожидаемому"),
    ERROR_REST_BODYISEMPTY("Тело ответа пустое");

    private String key;

    RestExceptionsMessages(String key) {
        this.key = key;
    }

    public String getMessage() {
        return key;
    }
}
