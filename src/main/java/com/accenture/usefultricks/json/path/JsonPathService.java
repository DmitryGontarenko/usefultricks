package com.accenture.usefultricks.json.path;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.InputStream;
import java.util.List;

public class JsonPathService {

    public void jsonPath(){
        InputStream resource = getClass().getResourceAsStream("/json/book.json");
        String jsonpathCreatorNamePath = "$.tool.jsonpath.creator.name";
        String jsonpathCreatorLocationPath = "$.tool.jsonpath.creator.location.[*]";

        DocumentContext jsonContext = JsonPath.parse(resource);
        String jsonpathCreatorName = jsonContext.read(jsonpathCreatorNamePath);
        List<String> jsonpathCreatorLocation = jsonContext.read(jsonpathCreatorLocationPath);

        System.out.println("creator`s name: " + jsonpathCreatorName);
        for (String location : jsonpathCreatorLocation) {
            System.out.println("creator`s location: " + location);
        }

        // Короткий способ
        Object title = JsonPath.parse("{data:{\"name\":\"John\", \"age\":23}}").read("$.data.name");
        System.out.println("Name: " + title.toString());
    }
}
