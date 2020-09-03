package com.home.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {

    @Autowired
    private FClient feignClient;

    @Override
    public Person getFeignData() {
        return feignClient.getData();
    }
}
