package com.zlyx.wechatjava.pojo;

public class MiniChapter {
    private Long chapId;

    private String chapName;

    private String lessId;

    private String lessType;

    private String lessAttribute;

    private String remark;

    private String createTime;

    private String createName;

    private String opTime;

    private String opName;

    private String delTime;

    private String delName;

    public Long getChapId() {
        return chapId;
    }

    public void setChapId(Long chapId) {
        this.chapId = chapId;
    }

    public String getChapName() {
        return chapName;
    }

    public void setChapName(String chapName) {
        this.chapName = chapName == null ? null : chapName.trim();
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