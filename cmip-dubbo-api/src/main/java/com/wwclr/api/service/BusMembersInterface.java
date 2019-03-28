package com.wwclr.api.service;

import com.wwclr.api.bean.BusMemberBean;

/**
 * Created by wangwu on 2019/3/28.
 */
public interface BusMembersInterface {
        public BusMemberBean findMemberByUserId(BusMemberBean BusMemberBean);
}
