package com.accenture.usefultricks.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {

    @Autowired
    private FClient feignClient;

    @Override
    public String getFeignData() {
        return feignClient.getData();
    }
}
