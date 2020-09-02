package com.home.usefultricks.json.schema;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonService {

    public void jsonParse() {
        JSONObject jsonDoc = new JSONObject(
                new JSONTokener(getClass().getResourceAsStream("/json/product.json")));
        JSONObject jsonSchema = new JSONObject(
                new JSONTokener(getClass().getResourceAsStream("/json/schema.json")));

        Schema schema = SchemaLoader.load(jsonSchema);
        try {
            schema.validate(jsonDoc);
            System.out.println("Schema valid");
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }
    }
}
