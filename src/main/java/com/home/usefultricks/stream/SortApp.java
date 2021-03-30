package com.home.usefultricks.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortApp {
    public static void main(String[] args) {
        List<Model> list = new ArrayList<Model>() {{
            add(new Model((short) 12, "Jame"));
            add(new Model((short) 5, "Kate"));
            add(new Model((short) 4, "Kate"));
            add(new Model((short) 30, "Lex"));
        }};

        // создаем свой компаратор
        Comparator<Model> compare = Comparator
                .comparingInt(Model::getAge)
                .thenComparing(Model::getName);

        // передаем созданный компаратор и сортируем
        List<Model> collect = list.stream()
                .sorted(compare)
                .collect(Collectors.toList());

        for (Model model : collect) {
            System.out.println(model.getAge() + " " + model.getName());
        }
    }
}

class Model {
    private Short age;
    private String name;

    public Model(Short age, String name) {
        this.age = age;
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
