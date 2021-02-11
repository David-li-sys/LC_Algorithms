package com.zlt.domain;

import java.util.Date;

public class OrderDetail {
    String orderId;
    String goodsDesc;
    String goodsPrice;
    String goodsCount;
    String orderStatus;
    String goodsImg;
    Date createTime;

    public OrderDetail() {
    }

    public OrderDetail(String orderId, String goodsDesc, String goodsPrice, String goodsCount, String orderStatus, String goodsImg, Date createTime) {
        this.orderId = orderId;
        this.goodsDesc = goodsDesc;
        this.goodsPrice = goodsPrice;
        this.goodsCount = goodsCount;
        this.orderStatus = orderStatus;
        this.goodsImg = goodsImg;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", goodsCount='" + goodsCount + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(String goodsCount) {
        this.goodsCount = goodsCount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
