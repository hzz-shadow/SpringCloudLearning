package com.hzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloRibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon")
    public String hello(){
        Map<String,String> map = new HashMap<>();
        map.put("name","ribbon");
        return restTemplate.postForObject("http://EUREKA-CLIENT/hello",map,String.class);
//                ("http://EUREKA-CLIENT/hello",String.class,map);
    }
}
