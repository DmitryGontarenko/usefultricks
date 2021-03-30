package com.home.usefultricks.others.tasks.allconnected;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Описание: есть 2 типа моделей - все модели
 * и подключенные модели.
 * Задача: вернуть модель AllModels с признаком isConnected = true,
 * если модель ConnectedModels содержит аналогичные значения поля code
 */
public class AllConnectedApp {
    public static void main(String[] args) {
        // список всех моделей
        List<AllModels> allModels = new ArrayList<AllModels>() {{
            add(new AllModels("bmw"));
            add(new AllModels("mazda"));
            add(new AllModels("ferrari"));
        }};


        // список подключенных моделей
        List<ConnectedModels> connectedModels = new ArrayList<ConnectedModels>() {{
            add(new ConnectedModels("bmw"));
            add(new ConnectedModels("mazda"));
        }};


        // задача: вернуть все модели с пометкой подключены
        // способ 1
        for (AllModels modelTwo : allModels) {
            for (ConnectedModels modelOne : connectedModels) {
                if (StringUtils.equals(modelOne.getCode(), modelTwo.getCode())) {
                    modelTwo.setConnected(true);
                }
            }
        }

        // способ 2
        allModels.forEach(two -> {
            boolean isConnected = connectedModels.stream()
                    .map(ConnectedModels::getCode)
                    .anyMatch(e -> StringUtils.equals(e, two.getCode()));

            if (isConnected) {
                two.setConnected(true);
            }
        });

        // способ 3
        allModels.forEach(all -> all.setConnected(connectedModels.stream()
                .anyMatch(con -> StringUtils.equals(con.getCode(), all.getCode()))));

        System.out.println(allModels); // получить список всех моделей
        // [AllModels{code='bmw', isConnected=true}, AllModels{code='mazda', isConnected=true}, AllModels{code='ferrari', isConnected=false}]
    }
}

class AllModels {
    private String code;
    private boolean isConnected;

    public AllModels(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    @Override
    public String toString() {
        return "AllModels{" +
                "code='" + code + '\'' +
                ", isConnected=" + isConnected +
                '}';
    }
}

class ConnectedModels {
    private String code;

    public ConnectedModels(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
