package com.home.usefultricks.json.convert.gson;

import com.google.gson.Gson;
import com.home.usefultricks.json.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class GsonApplication {
    public static void main(String[] args) throws FileNotFoundException {
        Product product = Product.builder()
                .id(1)
                .name("Ferrari")
                .price(1000)
                .build();

        // convert to Json
        Gson gson = new Gson();
        String jsonAsString = gson.toJson(product);
        System.out.println(jsonAsString); // {"id":1,"name":"Ferrari","price":1000}

        // path to json file
        String path = "src/main/resources/json/product.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        // convert from Json
        Product newProduct = gson.fromJson(bufferedReader, Product.class);
        System.out.println(newProduct.toString()); // Product(id=1, name=BMW, price=500)

    }
}
