package com.wwclr.api.service;

import com.wwclr.api.bean.BusUserBean;

import java.util.List;

/**
 * Created by wangwu on 2019/3/18.
 */
public interface BusUserInterface {
        public void saveUser(BusUserBean busUserBean);
        public List<BusUserBean> findAllUser();
        public void deleteUser(BusUserBean busUserBean) ;
}
