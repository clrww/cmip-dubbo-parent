package com.wwclr.provide.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "bus_members")
public class BusMember {
    /**
     * 自增主键
     */
    public Integer id;

    /**
     * 会员卡号
     */
    @Column(name = "memberCode")
    public String memberCode;

    /**
     * 会员userId
     */
    @Column(name = "userId")
    public String userId;

    /**
     * 会员名称
     */
    @Column(name = "userName")
    public String userName;

    /**
     * (1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    @Column(name = "memberType")
    public Integer memberType;

    /**
     * 会员生效时间
     */
    @Column(name = "effectTime")
    public Date effectTime;

    /**
     * 会员失效时间
     */
    @Column(name = "failureTime")
    public Date failureTime;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    public Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "lastModify")
    public Date lastModify;

    /**
     * 数据状态 (0： 逻辑删除， 1： 正常)
     */
    @Column(name = "logicalDeleted")
    public Boolean logicalDeleted;

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
     * @return createTime - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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