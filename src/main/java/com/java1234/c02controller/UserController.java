package com.java1234.c02controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("----登陆验证֤---");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Cookie cookie = new Cookie("user", userName + "-" + password);
        cookie.setMaxAge(1 * 60 * 60 * 24 * 7);
        User currentUser = new User(userName, password);
        response.addCookie(cookie);
        HttpSession session = request.getSession();
        session.setAttribute("currentUser", currentUser);
        return "redirect:/c02controller/user/success.jsp";
//        return "forward:/c02controller/user/success.jsp";
    }

    @RequestMapping("/ajax")
    public @ResponseBody
    User ajax() {
        User user = new User("zhangsan", "123");
        return user;
    }
}
