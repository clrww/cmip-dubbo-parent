package com.wwclr.api.service;

import com.wwclr.api.bean.DrugPostRecordCommentBean;

import java.util.List;

/**
 * Created by wwclr on 2019/4/3.
 */
public interface DrugPostRecordCommentInterface {
    public List<DrugPostRecordCommentBean> findByPostCode(String postCode);
    public void saveDrugPostRecordComment(DrugPostRecordCommentBean drugPostRecordCommentBean);

}
