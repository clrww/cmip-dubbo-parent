package com.wwclr.consumer.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "bus_drug_detail")
public class BusDrugDetail {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 药物编码
     */
    @Column(name = "drugCode")
    private String drugcode;

    /**
     * 药物名称
     */
    @Column(name = "drugName")
    private String drugname;

    /**
     * 药物图片地址
     */
    @Column(name = "drugImgUrl")
    private String drugimgurl;

    /**
     * 药物描述
     */
    private String describe;

    /**
     * 药物产地
     */
    private String origin;

    /**
     * 药品类型
     */
    private Integer type;

    /**
     * 药品规格
     */
    private String drmodel;

    /**
     * 药品包装
     */
    private String pack;

    /**
     * 药品包装单位
     */
    @Column(name = "packUnit")
    private String packunit;

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
     * 获取药物编码
     *
     * @return drugCode - 药物编码
     */
    public String getDrugcode() {
        return drugcode;
    }

    /**
     * 设置药物编码
     *
     * @param drugcode 药物编码
     */
    public void setDrugcode(String drugcode) {
        this.drugcode = drugcode;
    }

    /**
     * 获取药物名称
     *
     * @return drugName - 药物名称
     */
    public String getDrugname() {
        return drugname;
    }

    /**
     * 设置药物名称
     *
     * @param drugname 药物名称
     */
    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    /**
     * 获取药物图片地址
     *
     * @return drugImgUrl - 药物图片地址
     */
    public String getDrugimgurl() {
        return drugimgurl;
    }

    /**
     * 设置药物图片地址
     *
     * @param drugimgurl 药物图片地址
     */
    public void setDrugimgurl(String drugimgurl) {
        this.drugimgurl = drugimgurl;
    }

    /**
     * 获取药物描述
     *
     * @return describe - 药物描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置药物描述
     *
     * @param describe 药物描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获取药物产地
     *
     * @return origin - 药物产地
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 设置药物产地
     *
     * @param origin 药物产地
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * 获取药品类型
     *
     * @return type - 药品类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置药品类型
     *
     * @param type 药品类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取药品规格
     *
     * @return drmodel - 药品规格
     */
    public String getDrmodel() {
        return drmodel;
    }

    /**
     * 设置药品规格
     *
     * @param drmodel 药品规格
     */
    public void setDrmodel(String drmodel) {
        this.drmodel = drmodel;
    }

    /**
     * 获取药品包装
     *
     * @return pack - 药品包装
     */
    public String getPack() {
        return pack;
    }

    /**
     * 设置药品包装
     *
     * @param pack 药品包装
     */
    public void setPack(String pack) {
        this.pack = pack;
    }

    /**
     * 获取药品包装单位
     *
     * @return packUnit - 药品包装单位
     */
    public String getPackunit() {
        return packunit;
    }

    /**
     * 设置药品包装单位
     *
     * @param packunit 药品包装单位
     */
    public void setPackunit(String packunit) {
        this.packunit = packunit;
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