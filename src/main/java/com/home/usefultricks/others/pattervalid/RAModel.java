package com.home.usefultricks.others.pattervalid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class RAModel {
    @NotNull(message = "Наименование не задано")
    @Pattern(regexp = "John", message = "Некорректный формат наименования", flags = {Pattern.Flag.CASE_INSENSITIVE})
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
