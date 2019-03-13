package com.wwclr.consumer.controller;

import com.wwclr.consumer.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wangwu on 2019/3/12.
 */
@Controller
@RequestMapping("/th")
public class ThymeleafController {

        @RequestMapping("/index")
        public String index(ModelMap modelMap){
                modelMap.addAttribute("name1","wangwu");
                return "thymeleaf/ceshi";
        }
        @RequestMapping("/student")
        public String student(ModelMap modelMap){
                modelMap.addAttribute("name","wangwu");
                Student student=new Student("123","supermanager",18,new Date());
                Student student1=new Student("456","wang6",28,new Date());
                Student student2=new Student("789","wang7",38,new Date());
                student.setDes("<h1 style='color: green'>hello everyone</h1>");
                List<Student>  list = new ArrayList<Student>();
                list.add(student);
                list.add(student1);
                list.add(student2);
                modelMap.addAttribute("studentList",list);
                modelMap.addAttribute("student",student);
                return "thymeleaf/student";
        }

        @RequestMapping("/postform")
        public String postform(Student student){
                System.out.println(student.getName());
                return "redirect:/th/student";
        }
}
