package com.wwclr.consumer.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "drug_post_record")
public class DrugPostRecord {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 帖子编号
     */
    @Column(name = "postCode")
    private String postcode;

    /**
     * 帖子发起用户Name
     */
    @Column(name = "userName")
    private String username;

    /**
     * 帖子发起用户Id
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 是否置顶 (0： 否， 1： 是)
     */
    @Column(name = "ifTop")
    private Boolean iftop;

    /**
     * 是否精华帖 (0： 否， 1： 是)
     */
    @Column(name = "ifEssence")
    private Boolean ifessence;

    /**
     * 帖子标题
     */
    private String title;

    /**
     * 帖子内容
     */
    private String describe;

    /**
     * 获取点赞数
     */
    @Column(name = "getStarNumber")
    private Integer getstarnumber;

    /**
     * 获得浏览数
     */
    @Column(name = "getBrowseNumber")
    private Integer getbrowsenumber;

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
     * 获取帖子编号
     *
     * @return postCode - 帖子编号
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置帖子编号
     *
     * @param postcode 帖子编号
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取帖子发起用户Name
     *
     * @return userName - 帖子发起用户Name
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置帖子发起用户Name
     *
     * @param username 帖子发起用户Name
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取帖子发起用户Id
     *
     * @return userId - 帖子发起用户Id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置帖子发起用户Id
     *
     * @param userid 帖子发起用户Id
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取是否置顶 (0： 否， 1： 是)
     *
     * @return ifTop - 是否置顶 (0： 否， 1： 是)
     */
    public Boolean getIftop() {
        return iftop;
    }

    /**
     * 设置是否置顶 (0： 否， 1： 是)
     *
     * @param iftop 是否置顶 (0： 否， 1： 是)
     */
    public void setIftop(Boolean iftop) {
        this.iftop = iftop;
    }

    /**
     * 获取是否精华帖 (0： 否， 1： 是)
     *
     * @return ifEssence - 是否精华帖 (0： 否， 1： 是)
     */
    public Boolean getIfessence() {
        return ifessence;
    }

    /**
     * 设置是否精华帖 (0： 否， 1： 是)
     *
     * @param ifessence 是否精华帖 (0： 否， 1： 是)
     */
    public void setIfessence(Boolean ifessence) {
        this.ifessence = ifessence;
    }

    /**
     * 获取帖子标题
     *
     * @return title - 帖子标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置帖子标题
     *
     * @param title 帖子标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取帖子内容
     *
     * @return describe - 帖子内容
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置帖子内容
     *
     * @param describe 帖子内容
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 获取获取点赞数
     *
     * @return getStarNumber - 获取点赞数
     */
    public Integer getGetstarnumber() {
        return getstarnumber;
    }

    /**
     * 设置获取点赞数
     *
     * @param getstarnumber 获取点赞数
     */
    public void setGetstarnumber(Integer getstarnumber) {
        this.getstarnumber = getstarnumber;
    }

    /**
     * 获取获得浏览数
     *
     * @return getBrowseNumber - 获得浏览数
     */
    public Integer getGetbrowsenumber() {
        return getbrowsenumber;
    }

    /**
     * 设置获得浏览数
     *
     * @param getbrowsenumber 获得浏览数
     */
    public void setGetbrowsenumber(Integer getbrowsenumber) {
        this.getbrowsenumber = getbrowsenumber;
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