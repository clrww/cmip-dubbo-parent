package com.wwclr.provide.pojo;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "drug_post_record_comment")
public class DrugPostRecordComment {
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
     * 发帖人用户名Id
     */
    @Column(name = "postOwnerId")
    public String postOwnerId;

    /**
     * 发帖人用户名
     */
    @Column(name = "postOwnerName")
    public String postOwnerName;


    /**
     * 评论者用户Name
     */
    @Column(name = "userName")
    public String userName;

    /**
     * 评论者用户Id
     */
    @Column(name = "userId")
    public String userId;

    /**
     * 帖子评论内容
     */
    @Column(name = "commentContent")
    public String commentContent;

    /**
     * 评论是否置顶 (0： 否， 1： 是)
     */
    @Column(name = "ifTop")
    public Boolean ifTop;

    /**
     * 评论获取点赞数
     */
    @Column(name = "getStarNumber")
    public Integer getStarNumber;

    /**
     * 评论者头像
     */
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

    public String getPostOwnerId() {
        return postOwnerId;
    }

    public void setPostOwnerId(String postOwnerId) {
        this.postOwnerId = postOwnerId;
    }

    public String getPostOwnerName() {
        return postOwnerName;
    }

    public void setPostOwnerName(String postOwnerName) {
        this.postOwnerName = postOwnerName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Boolean getIfTop() {
        return ifTop;
    }

    public void setIfTop(Boolean ifTop) {
        this.ifTop = ifTop;
    }

    public Integer getGetStarNumber() {
        return getStarNumber;
    }

    public void setGetStarNumber(Integer getStarNumber) {
        this.getStarNumber = getStarNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
}