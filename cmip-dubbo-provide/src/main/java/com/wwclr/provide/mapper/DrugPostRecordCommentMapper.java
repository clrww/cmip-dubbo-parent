package com.wwclr.provide.mapper;

import com.wwclr.provide.pojo.DrugPostRecordComment;
import com.wwclr.provide.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrugPostRecordCommentMapper extends MyMapper<DrugPostRecordComment> {
    public List<DrugPostRecordComment> findByPostCode(@Param("postCode") String postCode);
    public DrugPostRecordComment findById(@Param("id") int id);
    public void updateDrugPostRecord(@Param("drugPostRecordComment") DrugPostRecordComment drugPostRecordComment,@Param("event") String event);


}