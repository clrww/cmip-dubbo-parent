package com.wwclr.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.wwclr.api.bean.BusUserBean;
import com.wwclr.api.service.BusUserInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by wangwu on 2019/3/18.
 */
@RestController
@RequestMapping("/user")
public class UserController {
        private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);


        @Reference
        BusUserInterface busUserInterface;

        @RequestMapping("/saveUser")
        public void saveUser(BusUserBean busUserBean){
                busUserBean.setCrateTime(new Date());
                busUserBean.setUserId("123456");
                busUserBean.setAge(26);
                busUserBean.setUserName("wwclr");
                busUserBean.setPhone(10086);
                LOGGER.info("UserController  saveUser ={}", JSONObject.toJSON(busUserBean));
                busUserInterface.saveUser(busUserBean);
        }

        @RequestMapping("/findAllUser")
        public List<BusUserBean> findAllUser(){
                List<BusUserBean> busUserBeanList=busUserInterface.findAllUser();
                LOGGER.info("UserController  findAllUser ={}", JSONObject.toJSON(busUserBeanList));
                return busUserBeanList;
        }

}
