package com.example.myweb_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping(value = "/testValue2",method = RequestMethod.GET)
    public String testValue(){
        return "testValue2 입니다";
    }

}
