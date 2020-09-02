package com.home.usefultricks.json.convert.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.usefultricks.json.model.Product;

import java.io.File;
import java.io.IOException;

public class JacksonApplication {
    public static void main(String[] args) throws IOException {
        Product product = Product.builder()
                .id(1)
                .name("Mazda")
                .price(500)
                .build();

        // convert to json
        ObjectMapper mapper = new ObjectMapper();
        String jsonAsString = mapper.writeValueAsString(product);
        System.out.println(jsonAsString); // {"id":1,"name":"Mazda","price":500}

        // convert from json
        Product newProduct = mapper.readValue(new File("src/main/resources/json/product.json"), Product.class);
        System.out.println(newProduct.toString()); // Product(id=1, name=BMW, price=500)

    }
}
