package com.home.usfl.json.convert.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.usfl.json.model.Product;

import java.io.File;
import java.io.IOException;

public class JacksonApplication {
    public static void main(String[] args) throws IOException {
        Product product = new Product();
        product.setId(1);
        product.setName("Mazda");
        product.setPrice(500);

        // convert to json
        ObjectMapper mapper = new ObjectMapper();
        String jsonAsString = mapper.writeValueAsString(product);
        System.out.println(jsonAsString); // {"id":1,"name":"Mazda","price":500}

        // convert from json
        Product newProduct = mapper.readValue(new File("usfl/src/main/resources/json/product.json"), Product.class);
        System.out.println(newProduct.toString()); // Product(id=1, name=BMW, price=500)

    }
}
