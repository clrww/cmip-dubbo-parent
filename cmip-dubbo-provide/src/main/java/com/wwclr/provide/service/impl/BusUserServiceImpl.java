package com.wwclr.provide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.wwclr.api.bean.BusUserBean;
import com.wwclr.api.service.BusUserInterface;

import com.wwclr.provide.mapper.BusUserMapper;
import com.wwclr.provide.pojo.BusUser;
import com.wwclr.provide.utils.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by wangwu on 2019/3/18.
 */
@Service
public class BusUserServiceImpl  extends BaseService implements BusUserInterface{
        private static final Logger LOGGER = LoggerFactory.getLogger(BusUserServiceImpl.class);

        @Autowired
       private BusUserMapper busUserMapper;

       @Autowired
       private StringRedisTemplate redisTemplate;

        @Override
        public void saveUser(BusUserBean busUserBean) {
                 BusUser busUser=transferObjectIgnoreCase(busUserBean,BusUser.class);
                LOGGER.info("BusUserServiceImpl  saveUser ={}", JSONObject.toJSON(busUser));
                busUserMapper.saveUser(busUser);
        }

        @Override
        public List<BusUserBean> findAllUser() {
                List<BusUser> userList = busUserMapper.selectAll();
                List<BusUserBean> busUserBeanList=transferObjectIgnoreCaseList(userList,BusUserBean.class);
                return busUserBeanList;
        }

        @Override
        public void deleteUser(BusUserBean busUserBean) {
                BusUser busUser=transferObjectIgnoreCase(busUserBean, BusUser.class);
                busUserMapper.delete(busUser);
        }

        @Override
        public BusUserBean findUser(BusUserBean busUserBean) {
                BusUser busUser=transferObjectIgnoreCase(busUserBean, BusUser.class);
                BusUser busUser1= (BusUser)busUserMapper.select(busUser);
                BusUserBean bean=transferObjectIgnoreCase(busUser1,BusUserBean.class);
                return bean;
        }

    @Override
    public BusUserBean findUserByUserNameAndPassWord(BusUserBean busUserBean) {
        BusUserBean busUserBean1=JSONObject.parseObject(redisTemplate.opsForValue().get(busUserBean.getUserName()),BusUserBean.class);
        BusUserBean bean=new BusUserBean();
        if(StringUtils.isEmpty(busUserBean1)){
            BusUser busUser=transferObjectIgnoreCase(busUserBean, BusUser.class);
            BusUser busUser1= (BusUser)busUserMapper.findUserByUserNameAndPassWord(busUser);
            bean=transferObjectIgnoreCase(busUser1,BusUserBean.class);
            redisTemplate.opsForValue().set(bean.getUserName(), JSONObject.toJSONString(bean));
        }else {
            bean=busUserBean1;
        }
//        BusUser busUser=transferObjectIgnoreCase(busUserBean, BusUser.class);
//        BusUser busUser1= (BusUser)busUserMapper.findUserByUserNameAndPassWord(busUser);
//        BusUserBean bean=transferObjectIgnoreCase(busUser1,BusUserBean.class);
        return bean;
    }

    @Override
    public BusUserBean findUserByUserName(BusUserBean busUserBean) {
        BusUserBean busUserBean1=JSONObject.parseObject(redisTemplate.opsForValue().get(busUserBean.getUserName()),BusUserBean.class);
        BusUserBean bean=new BusUserBean();
        if(StringUtils.isEmpty(busUserBean1)){
            BusUser busUser=transferObjectIgnoreCase(busUserBean, BusUser.class);
            BusUser busUser1= (BusUser)busUserMapper.findUserByUserName(busUser);
             bean=transferObjectIgnoreCase(busUser1,BusUserBean.class);
        }else {
            bean=busUserBean1;
        }
        return bean;
    }
}
