package com.lzz.potato.pojo;

import java.io.Serializable;

public class TbRole implements Serializable {
    private Integer roleId;

    private String roleName;

    private String roleSign;

    private String roleSalt;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleSign() {
        return roleSign;
    }

    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign == null ? null : roleSign.trim();
    }

    public String getRoleSalt() {
        return roleSalt;
    }

    public void setRoleSalt(String roleSalt) {
        this.roleSalt = roleSalt == null ? null : roleSalt.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleSign=").append(roleSign);
        sb.append(", roleSalt=").append(roleSalt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}