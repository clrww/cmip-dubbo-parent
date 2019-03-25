package com.wwclr.provide.mapper;

import com.wwclr.provide.pojo.BusDrugDetail;
import com.wwclr.provide.utils.MyMapper;

import java.util.List;

public interface BusDrugDetailMapper extends MyMapper<BusDrugDetail> {
        public List<BusDrugDetail> findAllBusDrug();
}