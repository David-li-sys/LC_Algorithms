package com.zlt.domain;

import java.util.Date;

public class Order {
    String orderId;
    String orderNo;
    Integer userId;
    Integer goodsId;
    String addressId;
    String buyCount;
    Integer orderStatus;
    float payPrice;
    Date createTime;
    Date payTime;
    String alipayNo;

    public Order() {
    }

    public Order(String orderId, String orderNo, Integer userId, Integer goodsId, String addressId, String buyCount, Integer orderStatus, float payPrice, Date createTime, Date payTime, String alipayNo) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.userId = userId;
        this.goodsId = goodsId;
        this.addressId = addressId;
        this.buyCount = buyCount;
        this.orderStatus = orderStatus;
        this.payPrice = payPrice;
        this.createTime = createTime;
        this.payTime = payTime;
        this.alipayNo = alipayNo;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", userId=" + userId +
                ", goodsId=" + goodsId +
                ", addressId='" + addressId + '\'' +
                ", buyCount='" + buyCount + '\'' +
                ", orderStatus=" + orderStatus +
                ", payPrice=" + payPrice +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", alipayNo='" + alipayNo + '\'' +
                '}';
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(String buyCount) {
        this.buyCount = buyCount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(float payPrice) {
        this.payPrice = payPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getAlipayNo() {
        return alipayNo;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }
}
