package com.accenture.usefultricks;

import com.accenture.usefultricks.logback.CustomLogback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        CustomLogback cl = new CustomLogback();
        //cl.evaluators();
        cl.showAllLevels();
    }
}
