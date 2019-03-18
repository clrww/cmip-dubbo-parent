package com.wwclr.provide.pojo;

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
    private String purchaseCode;

    /**
     * 药物编码
     */
    private String drugCode;

    /**
     * 药物名称
     */
    private String drugName;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 购买数量
     */
    private Integer purchaseNumber;

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
     * 获取订单编号
     *
     * @return purchaseCode - 订单编号
     */
    public String getPurchaseCode() {
        return purchaseCode;
    }

    /**
     * 设置订单编号
     *
     * @param purchaseCode 订单编号
     */
    public void setPurchaseCode(String purchaseCode) {
        this.purchaseCode = purchaseCode;
    }

    /**
     * 获取药物编码
     *
     * @return drugCode - 药物编码
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * 设置药物编码
     *
     * @param drugCode 药物编码
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    /**
     * 获取药物名称
     *
     * @return drugName - 药物名称
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * 设置药物名称
     *
     * @param drugName 药物名称
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * 获取用户Id
     *
     * @return userId - 用户Id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户Id
     *
     * @param userId 用户Id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名称
     *
     * @return userName - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取购买数量
     *
     * @return purchaseNumber - 购买数量
     */
    public Integer getPurchaseNumber() {
        return purchaseNumber;
    }

    /**
     * 设置购买数量
     *
     * @param purchaseNumber 购买数量
     */
    public void setPurchaseNumber(Integer purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
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