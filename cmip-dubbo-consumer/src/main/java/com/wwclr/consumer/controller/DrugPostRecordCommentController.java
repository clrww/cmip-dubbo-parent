package com.wwclr.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wwclr.api.bean.BusUserBean;
import com.wwclr.api.bean.DrugPostRecordCommentBean;
import com.wwclr.api.service.BusUserInterface;
import com.wwclr.api.service.DrugPostRecordCommentInterface;
import com.wwclr.consumer.utils.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        String userName=drugPostRecordCommentBean.getUserName();
        ModelAndView modelAndView=new ModelAndView();
        BusUserBean busUserBean=new BusUserBean();
        busUserBean.setUserName(drugPostRecordCommentBean.getUserName());
        BusUserBean busUserBean1=busUserInterface.findUserByUserName(busUserBean);
        modelAndView.addObject("user",busUserBean1);

        if("null".equals(drugPostRecordCommentBean.getUserName()) || StringUtils.isEmpty(drugPostRecordCommentBean.getUserName()) || drugPostRecordCommentBean.getIfNiMing()) {
            drugPostRecordCommentBean.setUserName("匿名用户");
            drugPostRecordCommentBean.setUserId(this.getUserId());
            drugPostRecordCommentBean.setGetStarNumber(0);
            drugPostRecordCommentBean.setImageUrl("../../static/blogimg/blog/avatar01.jpg");
        }else {
            drugPostRecordCommentBean.setUserName(busUserBean1.getUserName());
            drugPostRecordCommentBean.setUserId(busUserBean1.getUserId());
            drugPostRecordCommentBean.setGetStarNumber(0);
            drugPostRecordCommentBean.setImageUrl(busUserBean1.getImageUrl());
        }
        drugPostRecordCommentBean.setCreateTime(new Date());
        drugPostRecordCommentBean.setLogicalDeleted(true);
        drugPostRecordCommentInterface.saveDrugPostRecordComment(drugPostRecordCommentBean);

        return "redirect:/record/postRecordDetail?postCode="+drugPostRecordCommentBean.getPostCode()+"&userName="+URLEncoder.encode(userName,"UTF-8");
    }


    /**
     //         * 生成匿名用户Id--日期+随机4位字符串
     //         */
    public String getUserId(){
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        // 生成文件名
        return  sdf.format(nowDate) + HttpUtil.getRandomStringByLength(4);
    }

}
