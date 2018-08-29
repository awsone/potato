package com.lzz.potato.pojo;

import java.io.Serializable;

public class TbToreward implements Serializable {
    private Integer tId;

    private Integer tMId;

    private Integer tAcId;

    private String tLevel;

    private String tRegister;

    private String tFile;

    private static final long serialVersionUID = 1L;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public Integer gettMId() {
        return tMId;
    }

    public void settMId(Integer tMId) {
        this.tMId = tMId;
    }

    public Integer gettAcId() {
        return tAcId;
    }

    public void settAcId(Integer tAcId) {
        this.tAcId = tAcId;
    }

    public String gettLevel() {
        return tLevel;
    }

    public void settLevel(String tLevel) {
        this.tLevel = tLevel == null ? null : tLevel.trim();
    }

    public String gettRegister() {
        return tRegister;
    }

    public void settRegister(String tRegister) {
        this.tRegister = tRegister == null ? null : tRegister.trim();
    }

    public String gettFile() {
        return tFile;
    }

    public void settFile(String tFile) {
        this.tFile = tFile == null ? null : tFile.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tId=").append(tId);
        sb.append(", tMId=").append(tMId);
        sb.append(", tAcId=").append(tAcId);
        sb.append(", tLevel=").append(tLevel);
        sb.append(", tRegister=").append(tRegister);
        sb.append(", tFile=").append(tFile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}