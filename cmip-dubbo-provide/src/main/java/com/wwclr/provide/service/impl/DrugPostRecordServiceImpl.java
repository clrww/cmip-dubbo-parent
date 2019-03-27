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
         *查找所有中医药帖子或博客信息
         */
        @Override
        public List<DrugPostRecordBean> findTopThreeRecord() {
                List<DrugPostRecord> drugPostRecordList=drugPostRecordMapper.findTopThreeRecord();
                List<DrugPostRecordBean> busUserBeanList=transferObjectIgnoreCaseList(drugPostRecordList,DrugPostRecordBean.class);
                return busUserBeanList;
        }
}
