package com.hzz.service.impl;

import com.hzz.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloRibbonServiceImpl implements HelloRibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getHelloContent() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/",String.class);
    }
}
