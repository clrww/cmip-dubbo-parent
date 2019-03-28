package com.wwclr.provide.mapper;

import com.wwclr.provide.pojo.BusMember;
import com.wwclr.provide.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface BusMembersMapper extends MyMapper<BusMember> {
        public BusMember findMemberByUserId(@Param("busMember") BusMember busMember);
}