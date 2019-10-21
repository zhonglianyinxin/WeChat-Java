package com.zlyx.wechatjava.pojo;

public class LessionCompleteStatus {
    private Long comId;

    private String stuId;

    private String lessId;

    private String lessType;

    private String lessAttribute;

    private String complete;

    private String studyBeginTime;

    private String studyEndTime;

    private String stuYear;

    private String remark;

    private String createTime;

    private String createName;

    private String opTime;

    private String opName;

    private String delTime;

    private String delName;

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getLessId() {
        return lessId;
    }

    public void setLessId(String lessId) {
        this.lessId = lessId == null ? null : lessId.trim();
    }

    public String getLessType() {
        return lessType;
    }

    public void setLessType(String lessType) {
        this.lessType = lessType == null ? null : lessType.trim();
    }

    public String getLessAttribute() {
        return lessAttribute;
    }

    public void setLessAttribute(String lessAttribute) {
        this.lessAttribute = lessAttribute == null ? null : lessAttribute.trim();
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete == null ? null : complete.trim();
    }

    public String getStudyBeginTime() {
        return studyBeginTime;
    }

    public void setStudyBeginTime(String studyBeginTime) {
        this.studyBeginTime = studyBeginTime == null ? null : studyBeginTime.trim();
    }

    public String getStudyEndTime() {
        return studyEndTime;
    }

    public void setStudyEndTime(String studyEndTime) {
        this.studyEndTime = studyEndTime == null ? null : studyEndTime.trim();
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