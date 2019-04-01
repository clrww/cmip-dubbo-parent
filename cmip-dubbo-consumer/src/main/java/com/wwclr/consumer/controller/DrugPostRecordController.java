package com.wwclr.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wwclr.api.bean.DrugPostRecordBean;
import com.wwclr.api.service.DrugPostRecordInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangwu on 2019/3/25.
 */
@Controller
@RequestMapping("/record")
public class DrugPostRecordController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrugPostRecordController.class);

    @Reference
    DrugPostRecordInterface drugPostRecordInterface;

    @RequestMapping("/postRecordDetail")
    public Object findRecordById(int id){
        DrugPostRecordBean drugPostRecordBean=drugPostRecordInterface.findRecordById(id);
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("drugPostRecordBean",drugPostRecordBean);
        modelAndView.setViewName("thymeleaf/postRecordDetail");
        return modelAndView;
    }

}
