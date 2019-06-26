package com.java1234.c04upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("/upload")
public class FileUploadController {

    @RequestMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws Exception {
//        String filePath = request.getServletContext().getRealPath("/");
        String name = request.getParameter("name");
        System.out.println("name:" + name);
        String filePath = "E:\\upload\\";
        System.out.println(filePath);
        File dir = new File(filePath);
        if (!dir.exists()) {
            dir.mkdirs();//如果目录不存在，创建目录
        }
        file.transferTo(new File(filePath + file.getOriginalFilename()));
        return "redirect:/c04upload/success.jsp";
    }

    @RequestMapping("/uploadFiles")
    public String uploadFiles(@RequestParam("file") MultipartFile[] files, HttpServletRequest request) throws Exception {
//        String filePath = request.getServletContext().getRealPath("/");
        String name = request.getParameter("name");
        System.out.println("name:" + name);
        String filePath = "E:\\upload\\";
        System.out.println(filePath);
        File dir = new File(filePath);
        if (!dir.exists()) {
            dir.mkdirs();//如果目录不存在，创建目录
        }
        for (MultipartFile file : files) {
            file.transferTo(new File(filePath + file.getOriginalFilename()));
        }
        return "redirect:/c04upload/success.jsp";
    }
}
