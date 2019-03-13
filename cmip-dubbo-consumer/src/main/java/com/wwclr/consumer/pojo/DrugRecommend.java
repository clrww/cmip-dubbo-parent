package com.wwclr.consumer.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "drug_recommend")
public class DrugRecommend {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 药品编号
     */
    @Column(name = "drugCode")
    private String drugcode;

    /**
     * 推荐天数
     */
    @Column(name = "recommendTime")
    private Integer recommendtime;

    /**
     * 推荐开始时间
     */
    @Column(name = "recommendStartTime")
    private Date recommendstarttime;

    /**
     * 推荐结束时间
     */
    @Column(name = "recommendEndTime")
    private Date recommendendtime;

    /**
     * 创建时间
     */
    @Column(name = "crateTime")
    private Date cratetime;

    /**
     * 最后修改时间
     */
    @Column(name = "lastModify")
    private Date lastmodify;

    /**
     * 数据状态 (0： 逻辑删除， 1： 正常)
     */
    @Column(name = "logicalDeleted")
    private Boolean logicaldeleted;

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
    public String getDrugcode() {
        return drugcode;
    }

    /**
     * 设置药品编号
     *
     * @param drugcode 药品编号
     */
    public void setDrugcode(String drugcode) {
        this.drugcode = drugcode;
    }

    /**
     * 获取推荐天数
     *
     * @return recommendTime - 推荐天数
     */
    public Integer getRecommendtime() {
        return recommendtime;
    }

    /**
     * 设置推荐天数
     *
     * @param recommendtime 推荐天数
     */
    public void setRecommendtime(Integer recommendtime) {
        this.recommendtime = recommendtime;
    }

    /**
     * 获取推荐开始时间
     *
     * @return recommendStartTime - 推荐开始时间
     */
    public Date getRecommendstarttime() {
        return recommendstarttime;
    }

    /**
     * 设置推荐开始时间
     *
     * @param recommendstarttime 推荐开始时间
     */
    public void setRecommendstarttime(Date recommendstarttime) {
        this.recommendstarttime = recommendstarttime;
    }

    /**
     * 获取推荐结束时间
     *
     * @return recommendEndTime - 推荐结束时间
     */
    public Date getRecommendendtime() {
        return recommendendtime;
    }

    /**
     * 设置推荐结束时间
     *
     * @param recommendendtime 推荐结束时间
     */
    public void setRecommendendtime(Date recommendendtime) {
        this.recommendendtime = recommendendtime;
    }

    /**
     * 获取创建时间
     *
     * @return crateTime - 创建时间
     */
    public Date getCratetime() {
        return cratetime;
    }

    /**
     * 设置创建时间
     *
     * @param cratetime 创建时间
     */
    public void setCratetime(Date cratetime) {
        this.cratetime = cratetime;
    }

    /**
     * 获取最后修改时间
     *
     * @return lastModify - 最后修改时间
     */
    public Date getLastmodify() {
        return lastmodify;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastmodify 最后修改时间
     */
    public void setLastmodify(Date lastmodify) {
        this.lastmodify = lastmodify;
    }

    /**
     * 获取数据状态 (0： 逻辑删除， 1： 正常)
     *
     * @return logicalDeleted - 数据状态 (0： 逻辑删除， 1： 正常)
     */
    public Boolean getLogicaldeleted() {
        return logicaldeleted;
    }

    /**
     * 设置数据状态 (0： 逻辑删除， 1： 正常)
     *
     * @param logicaldeleted 数据状态 (0： 逻辑删除， 1： 正常)
     */
    public void setLogicaldeleted(Boolean logicaldeleted) {
        this.logicaldeleted = logicaldeleted;
    }
}