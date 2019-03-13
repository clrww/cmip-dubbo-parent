package com.wwclr.consumer.pojo;

import javax.persistence.Column;
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
    @Column(name = "memberCode")
    private String membercode;

    /**
     * 会员userId
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 会员名称
     */
    @Column(name = "userName")
    private String username;

    /**
     * (1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    @Column(name = "memberType")
    private Integer membertype;

    /**
     * 会员生效时间
     */
    @Column(name = "effectTime")
    private Date effecttime;

    /**
     * 会员失效时间
     */
    @Column(name = "failureTime")
    private Date failuretime;

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
     * 获取会员卡号
     *
     * @return memberCode - 会员卡号
     */
    public String getMembercode() {
        return membercode;
    }

    /**
     * 设置会员卡号
     *
     * @param membercode 会员卡号
     */
    public void setMembercode(String membercode) {
        this.membercode = membercode;
    }

    /**
     * 获取会员userId
     *
     * @return userId - 会员userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置会员userId
     *
     * @param userid 会员userId
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取会员名称
     *
     * @return userName - 会员名称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置会员名称
     *
     * @param username 会员名称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取(1： 普通会员,2： 黄金会员,3： 钻石会员)
     *
     * @return memberType - (1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    public Integer getMembertype() {
        return membertype;
    }

    /**
     * 设置(1： 普通会员,2： 黄金会员,3： 钻石会员)
     *
     * @param membertype (1： 普通会员,2： 黄金会员,3： 钻石会员)
     */
    public void setMembertype(Integer membertype) {
        this.membertype = membertype;
    }

    /**
     * 获取会员生效时间
     *
     * @return effectTime - 会员生效时间
     */
    public Date getEffecttime() {
        return effecttime;
    }

    /**
     * 设置会员生效时间
     *
     * @param effecttime 会员生效时间
     */
    public void setEffecttime(Date effecttime) {
        this.effecttime = effecttime;
    }

    /**
     * 获取会员失效时间
     *
     * @return failureTime - 会员失效时间
     */
    public Date getFailuretime() {
        return failuretime;
    }

    /**
     * 设置会员失效时间
     *
     * @param failuretime 会员失效时间
     */
    public void setFailuretime(Date failuretime) {
        this.failuretime = failuretime;
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