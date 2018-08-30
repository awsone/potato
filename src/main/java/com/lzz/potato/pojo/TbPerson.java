package com.lzz.potato.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbPerson implements Serializable {
    private Integer pId;

    private String pPassword;

    private String pSalt;

    private String pLocation;

    private String pName;

    private Date pBirthday;

    private String pHome;

    private String pSchool;

    private String pEdu;

    private Date pFinish;

    private String pMajor;

    private String pWork;

    private Date pJobtime;

    private String pQuali;

    private Date pQualitime;

    private String pIdentity;

    private Integer pIdentityId;

    private String pLevel;

    private String pType;

    private String pExtra;
   
    private String pSex;

    private static final long serialVersionUID = 1L;

    
    
    
    
    public String getpSex() {
		return pSex;
	}

	public void setpSex(String pSex) {
        this.pSex = pSex == null ? null : pSex.trim();
	}

	public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
    	
        this.pId = pId;
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword == null ? null : pPassword.trim();
    }

    public String getpSalt() {
        return pSalt;
    }

    public void setpSalt(String pSalt) {
        this.pSalt = pSalt == null ? null : pSalt.trim();
    }

    public String getpLocation() {
        return pLocation;
    }

    public void setpLocation(String pLocation) {
        this.pLocation = pLocation == null ? null : pLocation.trim();
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Date getpBirthday() {
        return pBirthday;
    }

    public void setpBirthday(Date pBirthday) {
        this.pBirthday = pBirthday;
    }

    public String getpHome() {
        return pHome;
    }

    public void setpHome(String pHome) {
        this.pHome = pHome == null ? null : pHome.trim();
    }

    public String getpSchool() {
        return pSchool;
    }

    public void setpSchool(String pSchool) {
        this.pSchool = pSchool == null ? null : pSchool.trim();
    }

    public String getpEdu() {
        return pEdu;
    }

    public void setpEdu(String pEdu) {
        this.pEdu = pEdu == null ? null : pEdu.trim();
    }

    public Date getpFinish() {
        return pFinish;
    }

    public void setpFinish(Date pFinish) {
        this.pFinish = pFinish;
    }

    public String getpMajor() {
        return pMajor;
    }

    public void setpMajor(String pMajor) {
        this.pMajor = pMajor == null ? null : pMajor.trim();
    }

    public String getpWork() {
        return pWork;
    }

    public void setpWork(String pWork) {
        this.pWork = pWork == null ? null : pWork.trim();
    }

    public Date getpJobtime() {
        return pJobtime;
    }

    public void setpJobtime(Date pJobtime) {
        this.pJobtime = pJobtime;
    }

    public String getpQuali() {
        return pQuali;
    }

    public void setpQuali(String pQuali) {
        this.pQuali = pQuali == null ? null : pQuali.trim();
    }

    public Date getpQualitime() {
        return pQualitime;
    }

    public void setpQualitime(Date pQualitime) {
        this.pQualitime = pQualitime;
    }

    public String getpIdentity() {
        return pIdentity;
    }

    public void setpIdentity(String pIdentity) {
        this.pIdentity = pIdentity == null ? null : pIdentity.trim();
    }

    public Integer getpIdentityId() {
        return pIdentityId;
    }

    public void setpIdentityId(Integer pIdentityId) {
        this.pIdentityId = pIdentityId;
    }

    public String getpLevel() {
        return pLevel;
    }

    public void setpLevel(String pLevel) {
        this.pLevel = pLevel == null ? null : pLevel.trim();
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

    public String getpExtra() {
        return pExtra;
    }

    public void setpExtra(String pExtra) {
        this.pExtra = pExtra == null ? null : pExtra.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", pPassword=").append(pPassword);
        sb.append(", pSalt=").append(pSalt);
        sb.append(", pLocation=").append(pLocation);
        sb.append(", pName=").append(pName);
        sb.append(", pBirthday=").append(pBirthday);
        sb.append(", pHome=").append(pHome);
        sb.append(", pSchool=").append(pSchool);
        sb.append(", pEdu=").append(pEdu);
        sb.append(", pFinish=").append(pFinish);
        sb.append(", pMajor=").append(pMajor);
        sb.append(", pWork=").append(pWork);
        sb.append(", pJobtime=").append(pJobtime);
        sb.append(", pQuali=").append(pQuali);
        sb.append(", pQualitime=").append(pQualitime);
        sb.append(", pIdentity=").append(pIdentity);
        sb.append(", pIdentityId=").append(pIdentityId);
        sb.append(", pLevel=").append(pLevel);
        sb.append(", pType=").append(pType);
        sb.append(", pExtra=").append(pExtra);
        sb.append(", pSex=").append(pSex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}