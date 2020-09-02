package com.home.usefultricks.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "feignClient", url = "${feign.client.url}")
public interface FClient {

    @RequestMapping(method = RequestMethod.GET, value = "/feign")
    String getData();
}
