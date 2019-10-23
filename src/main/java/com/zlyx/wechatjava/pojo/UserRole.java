package com.zlyx.wechatjava.pojo;

public class UserRole {
    private String roleNo;

    private String roleName;

    private String roleCreateId;

    private String roleCreate;

    private String roleCreateTime;

    private String roleDesc;

    private String opId;

    private String opName;

    private String opTime;

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo == null ? null : roleNo.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleCreateId() {
        return roleCreateId;
    }

    public void setRoleCreateId(String roleCreateId) {
        this.roleCreateId = roleCreateId == null ? null : roleCreateId.trim();
    }

    public String getRoleCreate() {
        return roleCreate;
    }

    public void setRoleCreate(String roleCreate) {
        this.roleCreate = roleCreate == null ? null : roleCreate.trim();
    }

    public String getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(String roleCreateTime) {
        this.roleCreateTime = roleCreateTime == null ? null : roleCreateTime.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId == null ? null : opId.trim();
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }

    public String getOpTime() {
        return opTime;
    }

    public void setOpTime(String opTime) {
        this.opTime = opTime == null ? null : opTime.trim();
    }
}