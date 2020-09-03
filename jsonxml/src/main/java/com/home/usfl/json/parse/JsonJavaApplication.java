package com.home.usfl.json.parse;

import org.json.JSONObject;

public class JsonJavaApplication {
    public static void main(String[] args) {

        // convert Java to Json
        JSONObject root = new JSONObject(); // создает главный объект
        root.put("message", "Hello");
        JSONObject place = new JSONObject(); // создаем объект place
        place.put("name", "World!");
        root.put("place", place); // сохраняем объект place в поле place

        String json = root.toString();
        System.out.println(json); // {"place":{"name":"World!"},"message":"Hi"}

        // convert json to Java
        JSONObject jsonObject = new JSONObject(json);
        String message = jsonObject.getString("message");
        String name = jsonObject.getJSONObject("place").getString("name");
        System.out.println(message + " " + name);
    }
}
