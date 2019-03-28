package com.wwclr.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wwclr.api.bean.BusMemberBean;
import com.wwclr.api.service.BusMembersInterface;
import com.wwclr.provide.mapper.BusMembersMapper;
import com.wwclr.provide.pojo.BusMember;
import com.wwclr.provide.utils.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangwu on 2019/3/28.
 */
@Service
public class BusMembersImpl  extends BaseService implements BusMembersInterface{
        @Autowired
        BusMembersMapper busMembersMapper;

        @Override
        public BusMemberBean findMemberByUserId(BusMemberBean busMemberBean) {
                BusMember busMember=transferObjectIgnoreCase(busMemberBean,BusMember.class);
                BusMemberBean busMemberBean1=transferObjectIgnoreCase(busMembersMapper.findMemberByUserId(busMember),BusMemberBean.class);
                return busMemberBean1;
        }
}
