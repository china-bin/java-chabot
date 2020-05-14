package com.springboot.fast.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontIndexController {

    @RequestMapping("/index")
    public String index() {

        return "front/index";
    }
    @RequestMapping("/")
    public String index2() {
        return "redirect:index";
    }



}
