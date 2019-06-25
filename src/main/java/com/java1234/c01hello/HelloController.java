package com.java1234.c01hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gaoxu
 * @date 2019-06-25 11:39
 * @description ... 类
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(Model model) {
        model.addAttribute("message", "StringMvc你好");
        return "hello";
    }
}
