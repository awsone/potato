package com.lzz.potato.pojo;

import java.io.Serializable;

public class TbKeeper implements Serializable {
    private Integer kId;

    private String kName;

    private String kPws;

    private static final long serialVersionUID = 1L;

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public String getkName() {
        return kName;
    }

    public void setkName(String kName) {
        this.kName = kName == null ? null : kName.trim();
    }

    public String getkPws() {
        return kPws;
    }

    public void setkPws(String kPws) {
        this.kPws = kPws == null ? null : kPws.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", kId=").append(kId);
        sb.append(", kName=").append(kName);
        sb.append(", kPws=").append(kPws);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}