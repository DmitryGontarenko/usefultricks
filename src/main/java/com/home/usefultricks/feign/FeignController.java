package com.home.usefultricks.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/")
    public String getAll() {
        return feignService.getFeignData();
    }

}
