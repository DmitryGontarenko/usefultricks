package com.accenture.usefultricks.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "feignClient", url = "http://www.mocky.io/v2/5d7a4944320000a1ea34eea3")
public interface FClient {

    @RequestMapping(method = RequestMethod.GET, value = "/feign")
    String getData();
}
