package com.wwclr.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwclr.api.bean.DrugPostRecordBean;
import com.wwclr.api.service.DrugPostRecordInterface;
import com.wwclr.provide.mapper.DrugPostRecordMapper;
import com.wwclr.provide.pojo.DrugPostRecord;
import com.wwclr.provide.utils.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wangwu on 2019/3/25.
 */
@Service
public class DrugPostRecordServiceImpl  extends BaseService implements DrugPostRecordInterface{
        private static final Logger LOGGER = LoggerFactory.getLogger(DrugPostRecordServiceImpl.class);

        @Autowired
        private DrugPostRecordMapper drugPostRecordMapper;

        /**
         * Created by wangwu on 2019/3/25.
         *查找前三个置顶的中医药帖子或博客信息
         */
        @Override
        public List<DrugPostRecordBean> findTopThreeRecord() {
                List<DrugPostRecord> drugPostRecordList=drugPostRecordMapper.findTopThreeRecord();
                List<DrugPostRecordBean> busUserBeanList=transferObjectIgnoreCaseList(drugPostRecordList,DrugPostRecordBean.class);
                return busUserBeanList;
        }

        /**
         * Created by wangwu on 2019/3/25.
         *根据主键id查找中医药博客
         */
        @Override
        public DrugPostRecordBean findRecordById(int id) {
                DrugPostRecord drugPostRecord=drugPostRecordMapper.findRecordById(id);
                DrugPostRecordBean drugPostRecordBean=transferObjectIgnoreCase(drugPostRecord,DrugPostRecordBean.class);
                return drugPostRecordBean;
        }

        @Override
        public List<DrugPostRecordBean> findAllRecord() {
                List<DrugPostRecord> drugPostRecordList=drugPostRecordMapper.findAllRecord();
                List<DrugPostRecordBean> busUserBeanList=transferObjectIgnoreCaseList(drugPostRecordList,DrugPostRecordBean.class);
                return busUserBeanList;
        }
}
