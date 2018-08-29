package com.lzz.potato.pojo;

import java.io.Serializable;

public class TbWords implements Serializable {
    private Integer wsId;

    private Integer wsPersonId;

    private String wsContent;

    private String wsReply;

    private String wsSendTime;

    private String wsReplyTime;

    private static final long serialVersionUID = 1L;

    public Integer getWsId() {
        return wsId;
    }

    public void setWsId(Integer wsId) {
        this.wsId = wsId;
    }

    public Integer getWsPersonId() {
        return wsPersonId;
    }

    public void setWsPersonId(Integer wsPersonId) {
        this.wsPersonId = wsPersonId;
    }

    public String getWsContent() {
        return wsContent;
    }

    public void setWsContent(String wsContent) {
        this.wsContent = wsContent == null ? null : wsContent.trim();
    }

    public String getWsReply() {
        return wsReply;
    }

    public void setWsReply(String wsReply) {
        this.wsReply = wsReply == null ? null : wsReply.trim();
    }

    public String getWsSendTime() {
        return wsSendTime;
    }

    public void setWsSendTime(String wsSendTime) {
        this.wsSendTime = wsSendTime == null ? null : wsSendTime.trim();
    }

    public String getWsReplyTime() {
        return wsReplyTime;
    }

    public void setWsReplyTime(String wsReplyTime) {
        this.wsReplyTime = wsReplyTime == null ? null : wsReplyTime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wsId=").append(wsId);
        sb.append(", wsPersonId=").append(wsPersonId);
        sb.append(", wsContent=").append(wsContent);
        sb.append(", wsReply=").append(wsReply);
        sb.append(", wsSendTime=").append(wsSendTime);
        sb.append(", wsReplyTime=").append(wsReplyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}