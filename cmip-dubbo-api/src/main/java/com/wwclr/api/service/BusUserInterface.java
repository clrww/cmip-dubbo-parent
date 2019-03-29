package com.wwclr.api.service;

import com.wwclr.api.bean.BusUserBean;

import java.util.List;

/**
 * Created by wangwu on 2019/3/18.
 */
public interface BusUserInterface {
        public Integer saveUser(BusUserBean busUserBean);
        public List<BusUserBean> findAllUser();
        public void deleteUser(BusUserBean busUserBean) ;
        public BusUserBean findUser(BusUserBean busUserBean);
        public BusUserBean findUserByUserNameAndPassWord(BusUserBean busUserBean);
        public BusUserBean findUserByUserName(BusUserBean busUserBean);

}
