package com.lzz.potato.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbManage implements Serializable {
    private Integer mId;

    private String mName;

    private String mCompang;

    private Date mStarttime;

    private Date mEndtime;

    private String mLeaderA;

    private String mLeaderB;

    private Double mMoney;

    private Double mPay;

    private String mFile;

    private String mFlag;

    private static final long serialVersionUID = 1L;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmCompang() {
        return mCompang;
    }

    public void setmCompang(String mCompang) {
        this.mCompang = mCompang == null ? null : mCompang.trim();
    }

    public Date getmStarttime() {
        return mStarttime;
    }

    public void setmStarttime(Date mStarttime) {
        this.mStarttime = mStarttime;
    }

    public Date getmEndtime() {
        return mEndtime;
    }

    public void setmEndtime(Date mEndtime) {
        this.mEndtime = mEndtime;
    }

    public String getmLeaderA() {
        return mLeaderA;
    }

    public void setmLeaderA(String mLeaderA) {
        this.mLeaderA = mLeaderA == null ? null : mLeaderA.trim();
    }

    public String getmLeaderB() {
        return mLeaderB;
    }

    public void setmLeaderB(String mLeaderB) {
        this.mLeaderB = mLeaderB == null ? null : mLeaderB.trim();
    }

    public Double getmMoney() {
        return mMoney;
    }

    public void setmMoney(Double mMoney) {
        this.mMoney = mMoney;
    }

    public Double getmPay() {
        return mPay;
    }

    public void setmPay(Double mPay) {
        this.mPay = mPay;
    }

    public String getmFile() {
        return mFile;
    }

    public void setmFile(String mFile) {
        this.mFile = mFile == null ? null : mFile.trim();
    }

    public String getmFlag() {
        return mFlag;
    }

    public void setmFlag(String mFlag) {
        this.mFlag = mFlag == null ? null : mFlag.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", mName=").append(mName);
        sb.append(", mCompang=").append(mCompang);
        sb.append(", mStarttime=").append(mStarttime);
        sb.append(", mEndtime=").append(mEndtime);
        sb.append(", mLeaderA=").append(mLeaderA);
        sb.append(", mLeaderB=").append(mLeaderB);
        sb.append(", mMoney=").append(mMoney);
        sb.append(", mPay=").append(mPay);
        sb.append(", mFile=").append(mFile);
        sb.append(", mFlag=").append(mFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}