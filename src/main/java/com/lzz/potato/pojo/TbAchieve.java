package com.lzz.potato.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbAchieve implements Serializable {
    private Integer acId;

    private Integer acMId;

    private String acContent;

    private String acSale;

    private String acLevel;

    private String acFile;

    private Date acTime;

    private static final long serialVersionUID = 1L;

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getAcMId() {
        return acMId;
    }

    public void setAcMId(Integer acMId) {
        this.acMId = acMId;
    }

    public String getAcContent() {
        return acContent;
    }

    public void setAcContent(String acContent) {
        this.acContent = acContent == null ? null : acContent.trim();
    }

    public String getAcSale() {
        return acSale;
    }

    public void setAcSale(String acSale) {
        this.acSale = acSale == null ? null : acSale.trim();
    }

    public String getAcLevel() {
        return acLevel;
    }

    public void setAcLevel(String acLevel) {
        this.acLevel = acLevel == null ? null : acLevel.trim();
    }

    public String getAcFile() {
        return acFile;
    }

    public void setAcFile(String acFile) {
        this.acFile = acFile == null ? null : acFile.trim();
    }

    public Date getAcTime() {
        return acTime;
    }

    public void setAcTime(Date acTime) {
        this.acTime = acTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acId=").append(acId);
        sb.append(", acMId=").append(acMId);
        sb.append(", acContent=").append(acContent);
        sb.append(", acSale=").append(acSale);
        sb.append(", acLevel=").append(acLevel);
        sb.append(", acFile=").append(acFile);
        sb.append(", acTime=").append(acTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}