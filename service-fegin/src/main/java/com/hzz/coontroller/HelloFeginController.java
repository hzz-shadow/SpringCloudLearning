package com.hzz.coontroller;

import com.hzz.service.HelloFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFeginController {
    @Autowired
    private HelloFeginService helloFeginService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return helloFeginService.sayHello();
    }
}
