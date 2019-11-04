package com.zlyx.wechatjava.pojo;

public class MiniLessonKey {
    private String lessId;

    private String lessType;

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
}