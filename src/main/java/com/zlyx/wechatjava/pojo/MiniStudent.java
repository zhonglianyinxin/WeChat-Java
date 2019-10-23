package com.zlyx.wechatjava.pojo;

public class MiniStudent {
    private Long stuNo;

    private String stuName;

    private String stuId;

    private String stuSex;

    private String stuAge;

    private String stuGroupId;

    private String stuYear;

    private String remark;

    private String createTime;

    private String createName;

    private String createId;

    private String opTime;

    private String opName;

    private String opId;

    private String delTime;

    private String delName;

    public Long getStuNo() {
        return stuNo;
    }

    public void setStuNo(Long stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge == null ? null : stuAge.trim();
    }

    public String getStuGroupId() {
        return stuGroupId;
    }

    public void setStuGroupId(String stuGroupId) {
        this.stuGroupId = stuGroupId == null ? null : stuGroupId.trim();
    }

    public String getStuYear() {
        return stuYear;
    }

    public void setStuYear(String stuYear) {
        this.stuYear = stuYear == null ? null : stuYear.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime == null ? null : opTime.trim();
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId == null ? null : opId.trim();
    }

    public String getDelTime() {
        return delTime;
    }

    public void setDelTime(String delTime) {
        this.delTime = delTime == null ? null : delTime.trim();
    }

    public String getDelName() {
        return delName;
    }

    public void setDelName(String delName) {
        this.delName = delName == null ? null : delName.trim();
    }
}