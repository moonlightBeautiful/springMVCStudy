package com.java1234.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

    @RequestMapping("/upload")
    public String uploadFile(@RequestParam("file1") MultipartFile file1, HttpServletRequest request) throws Exception {
        String filePath = request.getServletContext().getRealPath("/"); //得到的是：某盘\...\项目路径\
        System.out.println(filePath);
        file1.transferTo(new File(filePath + "upload/" + file1.getOriginalFilename()));
        return "redirect:success.html";
    }

    @RequestMapping("/upload2")
    public String uploadFiles(@RequestParam("file") MultipartFile[] files, HttpServletRequest request) throws Exception {
        String filePath = request.getServletContext().getRealPath("/");//得到的是：某盘\...\项目路径\    项目的真是路径
        System.out.println(filePath);
        System.out.println(request.getContextPath());  //为空字符串，为啥，因为我没有配置项目context  localhost:8080/资源地址，没有项目context
        for (MultipartFile file : files) {
            if(file.isEmpty()){
                continue;
            }
            file.transferTo(new File(filePath + "upload/" + file.getOriginalFilename()));
        }
        return "redirect:success.html";
    }
}
