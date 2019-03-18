package com.wwclr.consumer.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "drug_recommend")
public class DrugRecommend {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 药品编号
     */
    private String drugCode;

    /**
     * 推荐天数
     */
    private Integer recommendTime;

    /**
     * 推荐开始时间
     */
    private Date recommendStartTime;

    /**
     * 推荐结束时间
     */
    private Date recommendEndTime;

    /**
     * 创建时间
     */
    private Date crateTime;

    /**
     * 最后修改时间
     */
    private Date lastModify;

    /**
     * 数据状态 (0： 逻辑删除， 1： 正常)
     */
    private Boolean logicalDeleted;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取药品编号
     *
     * @return drugCode - 药品编号
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * 设置药品编号
     *
     * @param drugCode 药品编号
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    /**
     * 获取推荐天数
     *
     * @return recommendTime - 推荐天数
     */
    public Integer getRecommendTime() {
        return recommendTime;
    }

    /**
     * 设置推荐天数
     *
     * @param recommendTime 推荐天数
     */
    public void setRecommendTime(Integer recommendTime) {
        this.recommendTime = recommendTime;
    }

    /**
     * 获取推荐开始时间
     *
     * @return recommendStartTime - 推荐开始时间
     */
    public Date getRecommendStartTime() {
        return recommendStartTime;
    }

    /**
     * 设置推荐开始时间
     *
     * @param recommendStartTime 推荐开始时间
     */
    public void setRecommendStartTime(Date recommendStartTime) {
        this.recommendStartTime = recommendStartTime;
    }

    /**
     * 获取推荐结束时间
     *
     * @return recommendEndTime - 推荐结束时间
     */
    public Date getRecommendEndTime() {
        return recommendEndTime;
    }

    /**
     * 设置推荐结束时间
     *
     * @param recommendEndTime 推荐结束时间
     */
    public void setRecommendEndTime(Date recommendEndTime) {
        this.recommendEndTime = recommendEndTime;
    }

    /**
     * 获取创建时间
     *
     * @return crateTime - 创建时间
     */
    public Date getCrateTime() {
        return crateTime;
    }

    /**
     * 设置创建时间
     *
     * @param crateTime 创建时间
     */
    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    /**
     * 获取最后修改时间
     *
     * @return lastModify - 最后修改时间
     */
    public Date getLastModify() {
        return lastModify;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastModify 最后修改时间
     */
    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    /**
     * 获取数据状态 (0： 逻辑删除， 1： 正常)
     *
     * @return logicalDeleted - 数据状态 (0： 逻辑删除， 1： 正常)
     */
    public Boolean getLogicalDeleted() {
        return logicalDeleted;
    }

    /**
     * 设置数据状态 (0： 逻辑删除， 1： 正常)
     *
     * @param logicalDeleted 数据状态 (0： 逻辑删除， 1： 正常)
     */
    public void setLogicalDeleted(Boolean logicalDeleted) {
        this.logicalDeleted = logicalDeleted;
    }
}