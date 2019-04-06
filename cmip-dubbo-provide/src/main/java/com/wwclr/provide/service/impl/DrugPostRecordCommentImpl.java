package com.wwclr.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwclr.api.bean.DrugPostRecordCommentBean;
import com.wwclr.api.service.DrugPostRecordCommentInterface;
import com.wwclr.provide.mapper.DrugPostRecordCommentMapper;
import com.wwclr.provide.pojo.DrugPostRecordComment;
import com.wwclr.provide.utils.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wwclr on 2019/4/3.
 */
@Service
public class DrugPostRecordCommentImpl extends BaseService implements DrugPostRecordCommentInterface{
    private static final Logger LOGGER = LoggerFactory.getLogger(DrugPostRecordCommentImpl.class);

    @Autowired
    private DrugPostRecordCommentMapper drugPostRecordCommentMapper;


    @Override
    public List<DrugPostRecordCommentBean> findByPostCode(String postCode) {
        List<DrugPostRecordComment> drugPostRecordCommentList= drugPostRecordCommentMapper.findByPostCode(postCode);
       List<DrugPostRecordCommentBean> drugPostRecordCommentBeanList=transferObjectIgnoreCaseList(drugPostRecordCommentList,DrugPostRecordCommentBean.class);
        return drugPostRecordCommentBeanList;
    }

    @Override
    public DrugPostRecordCommentBean findById(int id) {
        DrugPostRecordComment drugPostRecordComment= drugPostRecordCommentMapper.findById(id);
        DrugPostRecordCommentBean drugPostRecordCommentBean=transferObjectIgnoreCase(drugPostRecordComment,DrugPostRecordCommentBean.class);
        return drugPostRecordCommentBean;
    }

    @Override
    public void saveDrugPostRecordComment(DrugPostRecordCommentBean drugPostRecordCommentBean) {
        DrugPostRecordComment drugPostRecordComment=transferObjectIgnoreCase(drugPostRecordCommentBean,DrugPostRecordComment.class);
        drugPostRecordCommentMapper.insert(drugPostRecordComment);
    }

    @Override
    public void updateDrugPostRecord(DrugPostRecordCommentBean drugPostRecordCommentBean,String event) {
        DrugPostRecordComment drugPostRecordComment=transferObjectIgnoreCase(drugPostRecordCommentBean,DrugPostRecordComment.class);
         drugPostRecordCommentMapper.updateDrugPostRecord(drugPostRecordComment,event);
    }
}
