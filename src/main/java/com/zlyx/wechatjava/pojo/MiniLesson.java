package com.zlyx.wechatjava.pojo;

public class MiniLesson extends MiniLessonKey {
    private String lessName;

    private String lessAttribute;

    private String remark;

    private String createTime;

    private String createName;

    private String createId;

    private String opTime;

    private String opName;

    private String opId;

    private String delTime;

    private String delName;

    public String getLessName() {
        return lessName;
    }

    public void setLessName(String lessName) {
        this.lessName = lessName == null ? null : lessName.trim();
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