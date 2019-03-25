package com.wwclr.api.bean;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


public class DrugPostRecordBean implements Serializable{
        public static final   long serialVersionUID =7955660884215112691L;
        public Integer id;
        public String postCode;
        public String userName;
        public String userId;
        public Boolean ifTop;
        public Boolean ifEssence;
        public String title;
        public String describe;
        public String shortDescribe;
        public Integer getStarNumber;
        public Integer getBrowseNumber;
        public String imageUrl;
        public Date createTime;
        public Date lastModify;
        public Boolean logicalDeleted;

        public String getImageUrl() {
                return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
        }

        public String getShortDescribe() {
                return shortDescribe;
        }

        public void setShortDescribe(String shortDescribe) {
                this.shortDescribe = shortDescribe;
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
        public Boolean getIfTop() {
                return ifTop;
        }
        public void setIfTop(Boolean ifTop) {
                this.ifTop = ifTop;
        }
        public Boolean getIfEssence() {
                return ifEssence;
        }
        public void setIfEssence(Boolean ifEssence) {
                this.ifEssence = ifEssence;
        }
        public String getTitle() {
                return title;
        }
        public void setTitle(String title) {
                this.title = title;
        }
        public String getDescribe() {
                return describe;
        }
        public void setDescribe(String describe) {
                this.describe = describe;
        }
        public Integer getGetStarNumber() {
                return getStarNumber;
        }
        public void setGetStarNumber(Integer getStarNumber) {
                this.getStarNumber = getStarNumber;
        }
        public Integer getGetBrowseNumber() {
                return getBrowseNumber;
        }
        public void setGetBrowseNumber(Integer getBrowseNumber) {
                this.getBrowseNumber = getBrowseNumber;
        }
        public Date getCreateTime() {
                return createTime;
        }
        public void setCreateTime(Date crateTime) {
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
}