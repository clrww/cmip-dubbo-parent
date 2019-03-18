package com.wwclr.provide.pojo;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "bus_members")
public class BusMembers {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 会员卡号
     */
    private String memberCode;

    /**
     * 会员userId
     */
    private String userId;

    /**
     * 会员名称
     */
    private String userName;

    /**
     * (1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    private Integer memberType;

    /**
     * 会员生效时间
     */
    private Date effectTime;

    /**
     * 会员失效时间
     */
    private Date failureTime;

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
     * 获取会员卡号
     *
     * @return memberCode - 会员卡号
     */
    public String getMemberCode() {
        return memberCode;
    }

    /**
     * 设置会员卡号
     *
     * @param memberCode 会员卡号
     */
    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    /**
     * 获取会员userId
     *
     * @return userId - 会员userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置会员userId
     *
     * @param userId 会员userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取会员名称
     *
     * @return userName - 会员名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置会员名称
     *
     * @param userName 会员名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取(1： 普通会员,2： 黄金会员,3： 钻石会员)
     *
     * @return memberType - (1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    public Integer getMemberType() {
        return memberType;
    }

    /**
     * 设置(1： 普通会员,2： 黄金会员,3： 钻石会员)
     *
     * @param memberType (1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    /**
     * 获取会员生效时间
     *
     * @return effectTime - 会员生效时间
     */
    public Date getEffectTime() {
        return effectTime;
    }

    /**
     * 设置会员生效时间
     *
     * @param effectTime 会员生效时间
     */
    public void setEffectTime(Date effectTime) {
        this.effectTime = effectTime;
    }

    /**
     * 获取会员失效时间
     *
     * @return failureTime - 会员失效时间
     */
    public Date getFailureTime() {
        return failureTime;
    }

    /**
     * 设置会员失效时间
     *
     * @param failureTime 会员失效时间
     */
    public void setFailureTime(Date failureTime) {
        this.failureTime = failureTime;
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