package com.wwclr.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wwclr.api.bean.BusUserBean;
import com.wwclr.api.bean.DrugPostRecordBean;
import com.wwclr.api.bean.DrugPostRecordCommentBean;
import com.wwclr.api.service.BusUserInterface;
import com.wwclr.api.service.DrugPostRecordCommentInterface;
import com.wwclr.api.service.DrugPostRecordInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by wangwu on 2019/3/25.
 */
@Controller
@RequestMapping("/record")
public class DrugPostRecordController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrugPostRecordController.class);

    @Reference
    DrugPostRecordInterface drugPostRecordInterface;

    @Reference
    DrugPostRecordCommentInterface drugPostRecordCommentInterface;

    @Reference
    BusUserInterface busUserInterface;

    @RequestMapping("/postRecordDetail")
    public Object findRecordByPostCode(String postCode,String userName){
        DrugPostRecordBean drugPostRecordBean=drugPostRecordInterface.findRecordByPostCode(postCode);
        List<DrugPostRecordCommentBean> drugPostRecordCommentBeanList=drugPostRecordCommentInterface.findByPostCode(drugPostRecordBean.getPostCode());
        ModelAndView modelAndView=new ModelAndView();
        if(!StringUtils.isEmpty(userName)){
            BusUserBean busUserBean=new BusUserBean();
            busUserBean.setUserName(userName);
            BusUserBean busUserBean1=busUserInterface.findUserByUserName(busUserBean);
            modelAndView.addObject("user",busUserBean1);
        }
        modelAndView.addObject("drugPostRecordBean",drugPostRecordBean);
        modelAndView.addObject("drugPostRecordCommentBeanList",drugPostRecordCommentBeanList);
        modelAndView.addObject("commentSize",drugPostRecordCommentBeanList.size()+"条");
        modelAndView.setViewName("thymeleaf/blog-post");
        return modelAndView;
    }

    @RequestMapping("/allPostRecord")
    public Object findAllRecord(BusUserBean busUserBean){
        List<DrugPostRecordBean> drugPostRecordBeanList=drugPostRecordInterface.findAllRecord();
        ModelAndView modelAndView=new ModelAndView();
        if(!StringUtils.isEmpty(busUserBean.getUserName())){
            BusUserBean busUserBean1=busUserInterface.findUserByUserName(busUserBean);
             modelAndView.addObject("user",busUserBean1);
        }
        modelAndView.addObject("drugPostRecordBeanList",drugPostRecordBeanList);
        modelAndView.setViewName("thymeleaf/blog");
        return modelAndView;
    }



}
