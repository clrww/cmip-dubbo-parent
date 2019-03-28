package com.wwclr.api.bean;

/**
 * Created by wangwu on 2019/3/28.
 */

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


import javax.persistence.Table;
import java.util.Date;

public class BusMemberBean implements Serializable{
        public   static final long serialVersionUID = 4955660887215112691L;
        public Integer id;
        public String memberCode;
        public String userId;
        public String userName;
        public Integer memberType;
        public Date effectTime;
        public Date failureTime;
        public Date createTime;
        public Date lastModify;
        public Boolean logicalDeleted;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getMemberCode() {
                return memberCode;
        }

        public void setMemberCode(String memberCode) {
                this.memberCode = memberCode;
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

        public Integer getMemberType() {
                return memberType;
        }

        public void setMemberType(Integer memberType) {
                this.memberType = memberType;
        }

        public Date getEffectTime() {
                return effectTime;
        }

        public void setEffectTime(Date effectTime) {
                this.effectTime = effectTime;
        }

        public Date getFailureTime() {
                return failureTime;
        }

        public void setFailureTime(Date failureTime) {
                this.failureTime = failureTime;
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