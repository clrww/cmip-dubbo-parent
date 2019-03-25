package com.wwclr.provide.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bus_user")
public class BusUser {
    /**
     * 自增主键
     */
    public Integer id;

    @Column(name = "userId")
    public String userId;

    /**
     * 用户名称
     */
    @Column(name = "userName")
    public String userName;

    /**
     * 电话
     */
    public Integer phone;

    /**
     * 年龄
     */
    public Integer age;

    /**
     * 职业
     */
    public Integer job;

    /**
     * 会员卡号
     */
    @Column(name = "memberCode")
    public Integer memberCode;

    /**
     * (0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    public Integer role;

    /**
     * 创建时间
     */
    @Column(name = "crateTime")
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
     * 用户密码
     */
    @Column(name = "passWord")
    public String passWord;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public Integer getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(Integer memberCode) {
        this.memberCode = memberCode;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getCrateTime() {
        return createTime;
    }

    public void setCrateTime(Date crateTime) {
        this.createTime = crateTime;
    }

    public Date getLastModify() {
        return lastModify;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    public Boolean getLogicalDeleted() {
        return logicalDeleted;
    }

    public void setLogicalDeleted(Boolean logicalDeleted) {
        this.logicalDeleted = logicalDeleted;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

//    /**
//     * 获取自增主键
//     *
//     * @return id - 自增主键
//     */
//    public Integer getId() {
//        return id;
//    }
//
//
//    /**
//     * 设置自增主键
//     *
//     * @param id 自增主键
//     */
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    /**
//     * @return userId
//     */
//    public String getUserid() {
//        return userId;
//    }
//
//    /**
//     * @param userid
//     */
//    public void setUserid(String userid) {
//        this.userId = userid;
//    }
//
//    /**
//     * 获取用户名称
//     *
//     * @return userName - 用户名称
//     */
//    public String getUsername() {
//        return userName;
//    }
//
//    /**
//     * 设置用户名称
//     *
//     * @param username 用户名称
//     */
//    public void setUsername(String username) {
//        this.userName = username;
//    }
//
//    /**
//     * 获取电话
//     *
//     * @return phone - 电话
//     */
//    public Integer getPhone() {
//        return phone;
//    }
//
//    /**
//     * 设置电话
//     *
//     * @param phone 电话
//     */
//    public void setPhone(Integer phone) {
//        this.phone = phone;
//    }
//
//    /**
//     * 获取年龄
//     *
//     * @return age - 年龄
//     */
//    public Integer getAge() {
//        return age;
//    }
//
//    /**
//     * 设置年龄
//     *
//     * @param age 年龄
//     */
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    /**
//     * 获取职业
//     *
//     * @return job - 职业
//     */
//    public Integer getJob() {
//        return job;
//    }
//
//    /**
//     * 设置职业
//     *
//     * @param job 职业
//     */
//    public void setJob(Integer job) {
//        this.job = job;
//    }
//
//    /**
//     * 获取会员卡号
//     *
//     * @return memberCode - 会员卡号
//     */
//    public Integer getMembercode() {
//        return memberCode;
//    }
//
//    /**
//     * 设置会员卡号
//     *
//     * @param membercode 会员卡号
//     */
//    public void setMembercode(Integer membercode) {
//        this.memberCode = membercode;
//    }
//
//    /**
//     * 获取(0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
//     *
//     * @return role - (0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
//     */
//    public Integer getRole() {
//        return role;
//    }
//
//    /**
//     * 设置(0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
//     *
//     * @param role (0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
//     */
//    public void setRole(Integer role) {
//        this.role = role;
//    }
//
//    /**
//     * 获取创建时间
//     *
//     * @return crateTime - 创建时间
//     */
//    public Date getCratetime() {
//        return crateTime;
//    }
//
//    /**
//     * 设置创建时间
//     *
//     * @param cratetime 创建时间
//     */
//    public void setCratetime(Date cratetime) {
//        this.crateTime = cratetime;
//    }
//
//    /**
//     * 获取最后修改时间
//     *
//     * @return lastModify - 最后修改时间
//     */
//    public Date getLastmodify() {
//        return lastModify;
//    }
//
//    /**
//     * 设置最后修改时间
//     *
//     * @param lastmodify 最后修改时间
//     */
//    public void setLastmodify(Date lastmodify) {
//        this.lastModify = lastmodify;
//    }
//
//    /**
//     * 获取数据状态 (0： 逻辑删除， 1： 正常)
//     *
//     * @return logicalDeleted - 数据状态 (0： 逻辑删除， 1： 正常)
//     */
//    public Boolean getLogicaldeleted() {
//        return logicalDeleted;
//    }
//
//    /**
//     * 设置数据状态 (0： 逻辑删除， 1： 正常)
//     *
//     * @param logicaldeleted 数据状态 (0： 逻辑删除， 1： 正常)
//     */
//    public void setLogicaldeleted(Boolean logicaldeleted) {
//        this.logicalDeleted = logicaldeleted;
//    }
}