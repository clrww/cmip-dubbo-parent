package com.wwclr.consumer.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bus_user")
public class BusUser {
    /**
     * 自增主键
     */
    private Integer id;

    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 电话
     */
    private Integer phone;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 职业
     */
    private Integer job;

    /**
     * 会员卡号
     */
    private Integer memberCode;

    /**
     * (0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    private Integer role;

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
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
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
     * 获取电话
     *
     * @return phone - 电话
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取职业
     *
     * @return job - 职业
     */
    public Integer getJob() {
        return job;
    }

    /**
     * 设置职业
     *
     * @param job 职业
     */
    public void setJob(Integer job) {
        this.job = job;
    }

    /**
     * 获取会员卡号
     *
     * @return memberCode - 会员卡号
     */
    public Integer getMemberCode() {
        return memberCode;
    }

    /**
     * 设置会员卡号
     *
     * @param memberCode 会员卡号
     */
    public void setMemberCode(Integer memberCode) {
        this.memberCode = memberCode;
    }

    /**
     * 获取(0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
     *
     * @return role - (0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    public Integer getRole() {
        return role;
    }

    /**
     * 设置(0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
     *
     * @param role (0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    public void setRole(Integer role) {
        this.role = role;
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