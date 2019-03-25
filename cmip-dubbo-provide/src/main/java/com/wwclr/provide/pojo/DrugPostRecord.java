package com.wwclr.provide.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "drug_post_record")
public class DrugPostRecord {
    /**
     * 自增主键
     */
    public Integer id;

    /**
     * 帖子编号
     */
    @Column(name = "postCode")
    public String postCode;

    /**
     * 帖子发起用户Name
     */
    @Column(name = "userName")
    public String userName;

    /**
     * 帖子发起用户Id
     */
    @Column(name = "userId")
    public String userId;

    /**
     * 是否置顶 (0： 否， 1： 是)
     */
    @Column(name = "ifTop")
    public Boolean ifTop;

    /**
     * 是否精华帖 (0： 否， 1： 是)
     */
    @Column(name = "ifEssence")
    public Boolean ifEssence;

    /**
     * 帖子标题
     */
    public String title;

    /**
     * 帖子内容
     */
    public String describe;

    @Column(name = "shortDescribe")
    public String shortDescribe;


    /**
     * 获取点赞数
     */
    @Column(name = "getStarNumber")
    public Integer getStarNumber;

    /**
     * 获得浏览数
     */
    @Column(name = "getBrowseNumber")
    public Integer getBrowseNumber;

    @Column(name = "imageUrl")
    public String imageUrl;

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


    public String getShortDescribe() {
        return shortDescribe;
    }

    public void setShortDescribe(String shortDescribe) {
        this.shortDescribe = shortDescribe;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

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
    public String getPostCode() {
        return postCode;
    }

    /**
     * 设置帖子编号
     *
     * @param postCode 帖子编号
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 获取帖子发起用户Name
     *
     * @return userName - 帖子发起用户Name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置帖子发起用户Name
     *
     * @param userName 帖子发起用户Name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取帖子发起用户Id
     *
     * @return userId - 帖子发起用户Id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置帖子发起用户Id
     *
     * @param userId 帖子发起用户Id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取是否置顶 (0： 否， 1： 是)
     *
     * @return ifTop - 是否置顶 (0： 否， 1： 是)
     */
    public Boolean getIfTop() {
        return ifTop;
    }

    /**
     * 设置是否置顶 (0： 否， 1： 是)
     *
     * @param ifTop 是否置顶 (0： 否， 1： 是)
     */
    public void setIfTop(Boolean ifTop) {
        this.ifTop = ifTop;
    }

    /**
     * 获取是否精华帖 (0： 否， 1： 是)
     *
     * @return ifEssence - 是否精华帖 (0： 否， 1： 是)
     */
    public Boolean getIfEssence() {
        return ifEssence;
    }

    /**
     * 设置是否精华帖 (0： 否， 1： 是)
     *
     * @param ifEssence 是否精华帖 (0： 否， 1： 是)
     */
    public void setIfEssence(Boolean ifEssence) {
        this.ifEssence = ifEssence;
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
    public Integer getGetStarNumber() {
        return getStarNumber;
    }

    /**
     * 设置获取点赞数
     *
     * @param getStarNumber 获取点赞数
     */
    public void setGetStarNumber(Integer getStarNumber) {
        this.getStarNumber = getStarNumber;
    }

    /**
     * 获取获得浏览数
     *
     * @return getBrowseNumber - 获得浏览数
     */
    public Integer getGetBrowseNumber() {
        return getBrowseNumber;
    }

    /**
     * 设置获得浏览数
     *
     * @param getBrowseNumber 获得浏览数
     */
    public void setGetBrowseNumber(Integer getBrowseNumber) {
        this.getBrowseNumber = getBrowseNumber;
    }

    /**
     * 获取创建时间
     *
     * @return crateTime - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param crateTime 创建时间
     */
    public void setCreateTime(Date crateTime) {
        this.createTime = crateTime;
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