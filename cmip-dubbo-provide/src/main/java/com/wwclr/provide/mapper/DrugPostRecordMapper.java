package com.wwclr.provide.mapper;

import com.wwclr.provide.pojo.DrugPostRecord;
import com.wwclr.provide.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugPostRecordMapper extends MyMapper<DrugPostRecord> {
        public List<DrugPostRecord> findAllRecord();
        public List<DrugPostRecord> findTopThreeRecord();
        public DrugPostRecord findRecordById(@Param("id") int id);
}