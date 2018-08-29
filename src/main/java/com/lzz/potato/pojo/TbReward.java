package com.lzz.potato.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbReward implements Serializable {
    private Integer reId;

    private String reLevel;

    private Date reTime;

    private String reName;

    private Integer rePerson;

    private static final long serialVersionUID = 1L;

    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    public String getReLevel() {
        return reLevel;
    }

    public void setReLevel(String reLevel) {
        this.reLevel = reLevel == null ? null : reLevel.trim();
    }

    public Date getReTime() {
        return reTime;
    }

    public void setReTime(Date reTime) {
        this.reTime = reTime;
    }

    public String getReName() {
        return reName;
    }

    public void setReName(String reName) {
        this.reName = reName == null ? null : reName.trim();
    }

    public Integer getRePerson() {
        return rePerson;
    }

    public void setRePerson(Integer rePerson) {
        this.rePerson = rePerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", reId=").append(reId);
        sb.append(", reLevel=").append(reLevel);
        sb.append(", reTime=").append(reTime);
        sb.append(", reName=").append(reName);
        sb.append(", rePerson=").append(rePerson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}