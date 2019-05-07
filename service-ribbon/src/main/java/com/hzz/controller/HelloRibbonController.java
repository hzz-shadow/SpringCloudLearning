package com.hzz.controller;

import com.hzz.service.HelloRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloRibbonController {
    @Autowired
    private HelloRibbonService helloRibbonService;

    @RequestMapping("/ribbon")
    public String hello(){
        return helloRibbonService.getHelloContent();
    }
}
