package com.lzz.potato.pojo;

import java.io.Serializable;

public class TbApply implements Serializable {
    private Integer aId;

    private String aName;

    private String aType;

    private String aLocation;

    private String aLeader;

    private Double aMoney;

    private String aContent;

    private String aExtra;

    private String aFile;

    private Integer aTheId;

    private String aFirstOpinion;

    private String aLeaderOpinion;

    private String aFlag;

    private static final long serialVersionUID = 1L;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType == null ? null : aType.trim();
    }

    public String getaLocation() {
        return aLocation;
    }

    public void setaLocation(String aLocation) {
        this.aLocation = aLocation == null ? null : aLocation.trim();
    }

    public String getaLeader() {
        return aLeader;
    }

    public void setaLeader(String aLeader) {
        this.aLeader = aLeader == null ? null : aLeader.trim();
    }

    public Double getaMoney() {
        return aMoney;
    }

    public void setaMoney(Double aMoney) {
        this.aMoney = aMoney;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent == null ? null : aContent.trim();
    }

    public String getaExtra() {
        return aExtra;
    }

    public void setaExtra(String aExtra) {
        this.aExtra = aExtra == null ? null : aExtra.trim();
    }

    public String getaFile() {
        return aFile;
    }

    public void setaFile(String aFile) {
        this.aFile = aFile == null ? null : aFile.trim();
    }

    public Integer getaTheId() {
        return aTheId;
    }

    public void setaTheId(Integer aTheId) {
        this.aTheId = aTheId;
    }

    public String getaFirstOpinion() {
        return aFirstOpinion;
    }

    public void setaFirstOpinion(String aFirstOpinion) {
        this.aFirstOpinion = aFirstOpinion == null ? null : aFirstOpinion.trim();
    }

    public String getaLeaderOpinion() {
        return aLeaderOpinion;
    }

    public void setaLeaderOpinion(String aLeaderOpinion) {
        this.aLeaderOpinion = aLeaderOpinion == null ? null : aLeaderOpinion.trim();
    }

    public String getaFlag() {
        return aFlag;
    }

    public void setaFlag(String aFlag) {
        this.aFlag = aFlag == null ? null : aFlag.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aId=").append(aId);
        sb.append(", aName=").append(aName);
        sb.append(", aType=").append(aType);
        sb.append(", aLocation=").append(aLocation);
        sb.append(", aLeader=").append(aLeader);
        sb.append(", aMoney=").append(aMoney);
        sb.append(", aContent=").append(aContent);
        sb.append(", aExtra=").append(aExtra);
        sb.append(", aFile=").append(aFile);
        sb.append(", aTheId=").append(aTheId);
        sb.append(", aFirstOpinion=").append(aFirstOpinion);
        sb.append(", aLeaderOpinion=").append(aLeaderOpinion);
        sb.append(", aFlag=").append(aFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}