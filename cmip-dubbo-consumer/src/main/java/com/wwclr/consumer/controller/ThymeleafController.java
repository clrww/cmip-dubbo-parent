package com.wwclr.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.wwclr.api.bean.BusUserBean;
import com.wwclr.api.service.BusUserInterface;
import com.wwclr.consumer.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
        private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

        @Reference
        BusUserInterface busUserInterface;


        @RequestMapping("/indexceshi")
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

        @RequestMapping("/index22")
        public String index22(BusUserBean busUserBean){
                busUserBean.setCrateTime(new Date());
                busUserBean.setUserId("987543121212121");
                busUserBean.setAge(26);
                busUserBean.setUserName("wangwu");
                busUserBean.setPhone(10086);
                LOGGER.info("UserController  saveUser ={}", JSONObject.toJSON(busUserBean));
                busUserInterface.saveUser(busUserBean);
                return "thymeleaf/index22";
        }

        @RequestMapping("/index")
        public String index11(ModelMap modelMap){
                List<BusUserBean> userList=busUserInterface.findAllUser();

//                ModelMap modelMap =new ModelMap();
                Student student=new Student("123","supermanager",18,new Date());
//                modelMap.addAttribute("student",student);
//                modelMap.addAttribute("name","wangwu");
                modelMap.addAttribute("userList",userList);
                LOGGER.info("UserController  saveUser ={}", JSONObject.toJSON(student));
                return "thymeleaf/index";
        }
}
