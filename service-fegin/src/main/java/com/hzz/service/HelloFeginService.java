package com.hzz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-HELLOWORLD")
public interface HelloFeginService {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    String sayHello();
}
