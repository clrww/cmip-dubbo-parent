package com.wwclr.provide.pojo;

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
    private String postCode;

    /**
     * 帖子发起用户Name
     */
    private String userName;

    /**
     * 帖子发起用户Id
     */
    private String userId;

    /**
     * 是否置顶 (0： 否， 1： 是)
     */
    private Boolean ifTop;

    /**
     * 是否精华帖 (0： 否， 1： 是)
     */
    private Boolean ifEssence;

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
    private Integer getStarNumber;

    /**
     * 获得浏览数
     */
    private Integer getBrowseNumber;

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