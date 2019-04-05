package com.wwclr.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wwclr.api.bean.BusUserBean;
import com.wwclr.api.bean.DrugPostRecordCommentBean;
import com.wwclr.api.service.BusUserInterface;
import com.wwclr.api.service.DrugPostRecordCommentInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.net.URLEncoder;
import java.util.List;

/**
 * Created by wwclr on 2019/4/3.
 */
@Controller
@RequestMapping("/comment")
public class DrugPostRecordCommentController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrugPostRecordCommentController.class);

    @Reference
    DrugPostRecordCommentInterface drugPostRecordCommentInterface;

    @Reference
    BusUserInterface busUserInterface;

    @RequestMapping("/queryRecordComment")
    @ResponseBody
    public List<DrugPostRecordCommentBean> findByPostCode(String postCode){
        List<DrugPostRecordCommentBean> drugPostRecordCommentBeanList=drugPostRecordCommentInterface.findByPostCode(postCode);
        return drugPostRecordCommentBeanList;

    }

    @RequestMapping("/saveDrugPostRecordComment")
    public Object saveDrugPostRecordComment(DrugPostRecordCommentBean drugPostRecordCommentBean) throws Exception{

        ModelAndView modelAndView=new ModelAndView();
//        String userName="王武";
        BusUserBean busUserBean=new BusUserBean();
        busUserBean.setUserName(drugPostRecordCommentBean.getUserName());
        BusUserBean busUserBean1=busUserInterface.findUserByUserName(busUserBean);
        modelAndView.addObject("user",busUserBean1);

        drugPostRecordCommentBean.setUserName(busUserBean.getUserName());
        drugPostRecordCommentBean.setUserId(busUserBean.getUserId());
        drugPostRecordCommentBean.setLogicalDeleted(true);
        drugPostRecordCommentInterface.saveDrugPostRecordComment(drugPostRecordCommentBean);

//        modelAndView.setViewName("thymeleaf/blog-post");
//        return modelAndView;
//        DrugPostRecordController drugPostRecordController=new DrugPostRecordController();
//        drugPostRecordController.findRecordByPostCode(drugPostRecordCommentBean.getPostCode(),drugPostRecordCommentBean.getUserName());

        return "redirect:/record/postRecordDetail?postCode="+drugPostRecordCommentBean.getPostCode()+"&userName="+URLEncoder.encode(drugPostRecordCommentBean.getUserName(),"UTF-8");
    }



}
