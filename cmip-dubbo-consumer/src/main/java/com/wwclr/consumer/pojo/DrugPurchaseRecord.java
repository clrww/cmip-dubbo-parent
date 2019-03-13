package com.wwclr.consumer.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "drug_purchase_record")
public class DrugPurchaseRecord {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 订单编号
     */
    @Column(name = "purchaseCode")
    private String purchasecode;

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
     * 用户Id
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 用户名称
     */
    @Column(name = "userName")
    private String username;

    /**
     * 购买数量
     */
    @Column(name = "purchaseNumber")
    private Integer purchasenumber;

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
     * 获取订单编号
     *
     * @return purchaseCode - 订单编号
     */
    public String getPurchasecode() {
        return purchasecode;
    }

    /**
     * 设置订单编号
     *
     * @param purchasecode 订单编号
     */
    public void setPurchasecode(String purchasecode) {
        this.purchasecode = purchasecode;
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
     * 获取用户Id
     *
     * @return userId - 用户Id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户Id
     *
     * @param userid 用户Id
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取用户名称
     *
     * @return userName - 用户名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     *
     * @param username 用户名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取购买数量
     *
     * @return purchaseNumber - 购买数量
     */
    public Integer getPurchasenumber() {
        return purchasenumber;
    }

    /**
     * 设置购买数量
     *
     * @param purchasenumber 购买数量
     */
    public void setPurchasenumber(Integer purchasenumber) {
        this.purchasenumber = purchasenumber;
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