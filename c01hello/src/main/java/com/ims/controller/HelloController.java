package com.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(Model model) {
        model.addAttribute("message", "StringMvc你好");
        return "hello";
    }
}
