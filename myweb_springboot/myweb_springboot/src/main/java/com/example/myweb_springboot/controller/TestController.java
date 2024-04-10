package com.example.myweb_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String testPage(){
        return "index.html";
    }

    @RequestMapping(value = "/testValue", method = RequestMethod.GET)
    @ResponseBody
    public String getValue(){
        return "test입니다";
    }
}
