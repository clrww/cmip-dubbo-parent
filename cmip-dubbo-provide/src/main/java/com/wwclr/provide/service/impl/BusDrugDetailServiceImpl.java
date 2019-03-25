package com.wwclr.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwclr.api.bean.BusDrugDetailBean;
import com.wwclr.api.service.BusDrugDetailInterface;
import com.wwclr.provide.mapper.BusDrugDetailMapper;
import com.wwclr.provide.pojo.BusDrugDetail;
import com.wwclr.provide.utils.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by wangwu on 2019/3/25.
 *
 */
@Service
public class BusDrugDetailServiceImpl  extends BaseService implements BusDrugDetailInterface{

        @Autowired
        BusDrugDetailMapper busDrugDetailMapper;

        /**
         * Created by wangwu on 2019/3/25.
         *查找所有中医药信息
         */
        @Override
        public List<BusDrugDetailBean> findAllBusDrug() {
                List<BusDrugDetail> busDrugDetailList=busDrugDetailMapper.findAllBusDrug();
                List<BusDrugDetailBean> busDrugDetailBeanList=transferObjectIgnoreCaseList(busDrugDetailList,BusDrugDetailBean.class);
                return busDrugDetailBeanList;
        }
}
