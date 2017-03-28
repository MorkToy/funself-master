package com.onelife.fun.entity;

import java.util.Date;

public class Wish {
    private Integer wishId;

    private Integer userId;

    private String wishContent;

    private String wishDeclare;

    private String wechatName;

    private Date publishTime;

    private Byte wishStatus;

    public Integer getWishId() {
        return wishId;
    }

    public void setWishId(Integer wishId) {
        this.wishId = wishId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWishContent() {
        return wishContent;
    }

    public void setWishContent(String wishContent) {
        this.wishContent = wishContent == null ? null : wishContent.trim();
    }

    public String getWishDeclare() {
        return wishDeclare;
    }

    public void setWishDeclare(String wishDeclare) {
        this.wishDeclare = wishDeclare == null ? null : wishDeclare.trim();
    }

    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName == null ? null : wechatName.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Byte getWishStatus() {
        return wishStatus;
    }

    public void setWishStatus(Byte wishStatus) {
        this.wishStatus = wishStatus;
    }
}