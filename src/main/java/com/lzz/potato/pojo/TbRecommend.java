package com.lzz.potato.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbRecommend implements Serializable {
    private Integer rId;

    private Date rTime;

    private String rLevel;

    private String rName;

    private Integer rPerson;

    private static final long serialVersionUID = 1L;

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    public String getrLevel() {
        return rLevel;
    }

    public void setrLevel(String rLevel) {
        this.rLevel = rLevel == null ? null : rLevel.trim();
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getrPerson() {
        return rPerson;
    }

    public void setrPerson(Integer rPerson) {
        this.rPerson = rPerson;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rId=").append(rId);
        sb.append(", rTime=").append(rTime);
        sb.append(", rLevel=").append(rLevel);
        sb.append(", rName=").append(rName);
        sb.append(", rPerson=").append(rPerson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}