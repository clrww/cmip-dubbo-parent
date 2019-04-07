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
    @Column(name = "mobilePhone")
    public String mobilePhone;

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
     * 用户密码
     */
    @Column(name = "passWord")
    public String passWord;

    /**
     * 邮箱
     */
    public String mail;

    /**
     * 用户密码
     */
    @Column(name = "imageUrl")
    public String imageUrl;


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

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

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}