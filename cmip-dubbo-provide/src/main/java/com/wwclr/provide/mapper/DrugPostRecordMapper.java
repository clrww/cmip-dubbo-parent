package com.wwclr.provide.mapper;

import com.wwclr.provide.pojo.DrugPostRecord;
import com.wwclr.provide.utils.MyMapper;

import java.util.List;

public interface DrugPostRecordMapper extends MyMapper<DrugPostRecord> {
        public List<DrugPostRecord> findTopThreeRecord();
}