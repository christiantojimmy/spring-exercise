package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "Hello World acasc acsca");
        mv.setViewName("index");
        return mv;
    }
}
