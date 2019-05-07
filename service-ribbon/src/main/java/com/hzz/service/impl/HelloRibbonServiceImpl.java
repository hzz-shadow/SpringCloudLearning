package com.hzz.service.impl;

import com.hzz.service.HelloRibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class HelloRibbonServiceImpl implements HelloRibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "serviceFailure")
    @Override
    public String getHelloContent() {
        Map<String,String> map = new HashMap<>();
        map.put("name","ribbon");
        return restTemplate.postForObject("http://EUREKA-CLIENT/hello",map,String.class);
    }

    public String serviceFailure(){
        return "hello world service is not available";
    }
}
