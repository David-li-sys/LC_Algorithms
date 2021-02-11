package com.zlt.domain;

import java.util.Date;

public class MiaoshaGood {
    Integer miaoshagoodsId;
    Integer goodsId;
    Integer miaoshaStock;
    float miaoshaPrice;
    Date beginTime;
    Date endTime;

    public MiaoshaGood() {
    }

    public MiaoshaGood(Integer miaoshagoodsId, Integer goodsId, Integer miaoshaStock, float miaoshaPrice, Date beginTime, Date endTime) {
        this.miaoshagoodsId = miaoshagoodsId;
        this.goodsId = goodsId;
        this.miaoshaStock = miaoshaStock;
        this.miaoshaPrice = miaoshaPrice;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public Integer getMiaoshagoodsId() {
        return miaoshagoodsId;
    }

    public void setMiaoshagoodsId(Integer miaoshagoodsId) {
        this.miaoshagoodsId = miaoshagoodsId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getMiaoshaStock() {
        return miaoshaStock;
    }

    public void setMiaoshaStock(Integer miaoshaStock) {
        this.miaoshaStock = miaoshaStock;
    }

    public float getMiaoshaPrice() {
        return miaoshaPrice;
    }

    public void setMiaoshaPrice(float miaoshaPrice) {
        this.miaoshaPrice = miaoshaPrice;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "MiaoshaGood{" +
                "miaoshagoodsId=" + miaoshagoodsId +
                ", goodsId=" + goodsId +
                ", miaoshaStock=" + miaoshaStock +
                ", miaoshaPrice=" + miaoshaPrice +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}
