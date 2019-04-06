package com.wwclr.api.bean;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by wwclr on 2019/4/3.
 */
public class DrugPostRecordCommentBean implements Serializable{
    public   static final long serialVersionUID = 1955660887215112691L;
    public Integer id;
    public String postCode;
    public String postOwnerName;
    public String postOwnerId;
    public String userName;
    public String userId;
    public String commentContent;
    public Boolean ifTop;
    public Integer getStarNumber;
    public Integer getCaiStarNumber;
    public String imageUrl;
    public Date createTime;
    public Date lastModify;
    public Boolean logicalDeleted;
    public Boolean ifNiMing;

    public Integer getGetCaiStarNumber() {
        return getCaiStarNumber;
    }

    public void setGetCaiStarNumber(Integer getCaiStarNumber) {
        this.getCaiStarNumber = getCaiStarNumber;
    }

    public Boolean getIfNiMing() {
        return ifNiMing;
    }

    public void setIfNiMing(Boolean ifNiMing) {
        this.ifNiMing = ifNiMing;
    }

    public String getPostOwnerName() {
        return postOwnerName;
    }

    public void setPostOwnerName(String postOwnerName) {
        this.postOwnerName = postOwnerName;
    }

    public String getPostOwnerId() {
        return postOwnerId;
    }

    public void setPostOwnerId(String postOwnerId) {
        this.postOwnerId = postOwnerId;
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
