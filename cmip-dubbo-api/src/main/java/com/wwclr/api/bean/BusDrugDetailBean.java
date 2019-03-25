package com.wwclr.api.bean;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "bus_drug_detail")
public class BusDrugDetailBean implements Serializable{
        public static final  long serialVersionUID= 7915660887215112691L;
        public Integer id;
        public String drugCode;
        public String drugName;
        public String drugImgUrl;
        public String describe;
        public String origin;
        public Integer type;
        public String drmodel;
        public String pack;
        public String packUnit;
        public Date createTime;
        public Date lastModify;
        public Boolean logicalDeleted;

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
         * 获取药物编码
         *
         * @return drugCode - 药物编码
         */
        public String getDrugCode() {
                return drugCode;
        }

        /**
         * 设置药物编码
         *
         * @param drugCode 药物编码
         */
        public void setDrugCode(String drugCode) {
                this.drugCode = drugCode;
        }

        /**
         * 获取药物名称
         *
         * @return drugName - 药物名称
         */
        public String getDrugName() {
                return drugName;
        }

        /**
         * 设置药物名称
         *
         * @param drugName 药物名称
         */
        public void setDrugName(String drugName) {
                this.drugName = drugName;
        }

        /**
         * 获取药物图片地址
         *
         * @return drugImgUrl - 药物图片地址
         */
        public String getDrugImgUrl() {
                return drugImgUrl;
        }

        /**
         * 设置药物图片地址
         *
         * @param drugImgUrl 药物图片地址
         */
        public void setDrugImgUrl(String drugImgUrl) {
                this.drugImgUrl = drugImgUrl;
        }

        /**
         * 获取药物描述
         *
         * @return describe - 药物描述
         */
        public String getDescribe() {
                return describe;
        }

        /**
         * 设置药物描述
         *
         * @param describe 药物描述
         */
        public void setDescribe(String describe) {
                this.describe = describe;
        }

        /**
         * 获取药物产地
         *
         * @return origin - 药物产地
         */
        public String getOrigin() {
                return origin;
        }

        /**
         * 设置药物产地
         *
         * @param origin 药物产地
         */
        public void setOrigin(String origin) {
                this.origin = origin;
        }

        /**
         * 获取药品类型
         *
         * @return type - 药品类型
         */
        public Integer getType() {
                return type;
        }

        /**
         * 设置药品类型
         *
         * @param type 药品类型
         */
        public void setType(Integer type) {
                this.type = type;
        }

        /**
         * 获取药品规格
         *
         * @return drmodel - 药品规格
         */
        public String getDrmodel() {
                return drmodel;
        }

        /**
         * 设置药品规格
         *
         * @param drmodel 药品规格
         */
        public void setDrmodel(String drmodel) {
                this.drmodel = drmodel;
        }

        /**
         * 获取药品包装
         *
         * @return pack - 药品包装
         */
        public String getPack() {
                return pack;
        }

        /**
         * 设置药品包装
         *
         * @param pack 药品包装
         */
        public void setPack(String pack) {
                this.pack = pack;
        }

        /**
         * 获取药品包装单位
         *
         * @return packUnit - 药品包装单位
         */
        public String getPackUnit() {
                return packUnit;
        }

        /**
         * 设置药品包装单位
         *
         * @param packUnit 药品包装单位
         */
        public void setPackUnit(String packUnit) {
                this.packUnit = packUnit;
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