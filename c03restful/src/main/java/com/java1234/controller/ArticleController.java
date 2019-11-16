package com.java1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java1234.model.Article;

@Controller
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("/list")
    public String list(Model model) {
        return "article/list";
    }

    @RequestMapping("/details/{id}")
    public ModelAndView details(@PathVariable("id") int id) {
        ModelAndView mav = new ModelAndView();
        if (id == 1) {
            mav.addObject("article", new Article("����һ", "����һ������"));
        } else if (id == 2) {
            mav.addObject("article", new Article("���¶�", "���¶�������"));
        }
        mav.setViewName("article/details");
        return mav;
    }
}
