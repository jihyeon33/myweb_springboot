package com.example.myweb_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/jspTest")
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "JIHYEON");

        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);
        return mav;
    }

/*    @RequestMapping(value = "/jspTest", method = RequestMethod.GET)
    public String jspTest(){
        return "test";
    }*/
}
