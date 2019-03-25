package com.wwclr.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.wwclr.api.bean.BusUserBean;
import com.wwclr.api.bean.DrugPostRecordBean;
import com.wwclr.api.service.BusUserInterface;
import com.wwclr.api.service.DrugPostRecordInterface;
import com.wwclr.consumer.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
        @Reference
        DrugPostRecordInterface drugPostRecordInterface;

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

        /**
         * 进入主页
         */
        @RequestMapping("/index")
        public Object index(BusUserBean busUserBean){
                ModelAndView modelAndView=new ModelAndView();
                try {
                        busUserBean.setUserId("1234561");
                        BusUserBean bean=busUserInterface.findUser(busUserBean);
                        List<DrugPostRecordBean> drugPostRecordBeanList=drugPostRecordInterface.findTopThreeRecord();
                        modelAndView.addObject("user",bean);
                        modelAndView.addObject("drugPostRecordBeanList",drugPostRecordBeanList);
                        modelAndView.setViewName("thymeleaf/index");
                        LOGGER.info("ThymeleafController  index  bean={}", JSONObject.toJSON(bean));
                }catch (Exception e){
                        e.printStackTrace();
                }
             return  modelAndView;
        }


        /**
         * 登陆验证账号密码
         */
        @RequestMapping("/login")
        @ResponseBody
        public Object login(BusUserBean busUserBean){
                try{
                        ModelAndView modelAndView=new ModelAndView();
                        BusUserBean bean=busUserInterface.findUser(busUserBean);
                        if(StringUtils.isEmpty(bean)){
                                modelAndView.addObject("user",false);
//                        modelAndView.setViewName("thymeleaf/index");
                                return "账号或密码错误";
                        }
//                        modelAndView.addObject("user",bean);
//                        modelAndView.setViewName("thymeleaf/index");
                        LOGGER.info("ThymeleafController  login  bean={}", JSONObject.toJSON(bean));
                        return bean;
                }catch (Exception e){
                        e.printStackTrace();
                }
              return null;
        }

        /**
         * 登陆成功跳转主页
         */
        @RequestMapping("/loginForIndex")
        public Object loginForIndex(BusUserBean busUserBean){
                ModelAndView modelAndView=new ModelAndView();
                try{
                        BusUserBean bean=busUserInterface.findUser(busUserBean);
                        List<DrugPostRecordBean> drugPostRecordBeanList=drugPostRecordInterface.findTopThreeRecord();
                        modelAndView.addObject("user",bean);
                        modelAndView.addObject("drugPostRecordBeanList",drugPostRecordBeanList);
                        modelAndView.setViewName("thymeleaf/index");
                        LOGGER.info("ThymeleafController  loginForIndex  bean={}", JSONObject.toJSON(bean));
                }catch (Exception e){
                        e.printStackTrace();
                }
                return modelAndView;
        }
}
