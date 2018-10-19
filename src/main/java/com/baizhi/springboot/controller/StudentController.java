package com.baizhi.springboot.controller;

import com.baizhi.springboot.aspect.LogAnnotation;
import com.baizhi.springboot.entity.Student;
import com.baizhi.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;

    @LogAnnotation(name = "自定义的注解")
    @RequestMapping("/getAll")
    public String getAll(HttpServletRequest request) {
//        System.out.println("进入Controller*****************");
        List<Student> students = service.selectAll();
        request.setAttribute("admin", students);
//        System.out.println("走出Controller=====555555555======");
        return "index";
    }
}
