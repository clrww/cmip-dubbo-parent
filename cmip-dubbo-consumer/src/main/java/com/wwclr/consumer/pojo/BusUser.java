package com.wwclr.consumer.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "bus_user")
public class BusUser {
    /**
     * 自增主键
     */
    private Integer id;

    @Column(name = "userId")
    private String userid;

    /**
     * 用户名称
     */
    @Column(name = "userName")
    private String username;

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
    @Column(name = "memberCode")
    private Integer membercode;

    /**
     * (0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    private Integer role;

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
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
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
    public Integer getMembercode() {
        return membercode;
    }

    /**
     * 设置会员卡号
     *
     * @param membercode 会员卡号
     */
    public void setMembercode(Integer membercode) {
        this.membercode = membercode;
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