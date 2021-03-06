package com.wwclr.consumer.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bus_user")
public class BusUser {
    /**
     * 自增主键
     */
    private Integer id;

    private String user_Id;

    /**
     * 用户名称
     */
    private String user_Name;

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
    private Integer member_Code;

    /**
     * (0： 非会员,1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    private Integer role;

    /**
     * 创建时间
     */
    private Date crate_Time;

    /**
     * 最后修改时间
     */
    private Date last_Modify;

    /**
     * 数据状态 (0： 逻辑删除， 1： 正常)
     */
    private Boolean logical_Deleted;

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
     * @return user_Id
     */
    public String getUser_Id() {
        return user_Id;
    }

    /**
     * @param user_Id
     */
    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    /**
     * 获取用户名称
     *
     * @return user_Name - 用户名称
     */
    public String getUser_Name() {
        return user_Name;
    }

    /**
     * 设置用户名称
     *
     * @param user_Name 用户名称
     */
    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
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
     * @return member_Code - 会员卡号
     */
    public Integer getMember_Code() {
        return member_Code;
    }

    /**
     * 设置会员卡号
     *
     * @param member_Code 会员卡号
     */
    public void setMember_Code(Integer member_Code) {
        this.member_Code = member_Code;
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
     * @return crate_Time - 创建时间
     */
    public Date getCrate_Time() {
        return crate_Time;
    }

    /**
     * 设置创建时间
     *
     * @param crate_Time 创建时间
     */
    public void setCrate_Time(Date crate_Time) {
        this.crate_Time = crate_Time;
    }

    /**
     * 获取最后修改时间
     *
     * @return last_Modify - 最后修改时间
     */
    public Date getLast_Modify() {
        return last_Modify;
    }

    /**
     * 设置最后修改时间
     *
     * @param last_Modify 最后修改时间
     */
    public void setLast_Modify(Date last_Modify) {
        this.last_Modify = last_Modify;
    }

    /**
     * 获取数据状态 (0： 逻辑删除， 1： 正常)
     *
     * @return logical_Deleted - 数据状态 (0： 逻辑删除， 1： 正常)
     */
    public Boolean getLogical_Deleted() {
        return logical_Deleted;
    }

    /**
     * 设置数据状态 (0： 逻辑删除， 1： 正常)
     *
     * @param logical_Deleted 数据状态 (0： 逻辑删除， 1： 正常)
     */
    public void setLogical_Deleted(Boolean logical_Deleted) {
        this.logical_Deleted = logical_Deleted;
    }
}