package com.wwclr.api.service;

import com.wwclr.api.bean.DrugPostRecordBean;

import java.util.List;

/**
 * Created by wangwu on 2019/3/25.
 */
public interface DrugPostRecordInterface {
        public List<DrugPostRecordBean> findTopThreeRecord();
        public DrugPostRecordBean findRecordByPostCode(String postCode);
        public List<DrugPostRecordBean> findAllRecord();

}
