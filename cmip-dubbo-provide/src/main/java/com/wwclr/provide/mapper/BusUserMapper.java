package com.wwclr.provide.mapper;

import com.wwclr.provide.pojo.BusUser;
import com.wwclr.provide.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface BusUserMapper extends MyMapper<BusUser> {
    public BusUser findUserByUserNameAndPassWord(@Param("busUser") BusUser busUser);
    public BusUser findUserByUserName(@Param("busUser") BusUser busUser);

}