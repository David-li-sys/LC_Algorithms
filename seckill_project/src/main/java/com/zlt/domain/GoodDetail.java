package com.zlt.domain;

import java.util.Date;

public class GoodDetail {
    Integer goodsId;
    String goodsName;
    String goodsTitle;
    String goodsPrice;
    String goodsImg;
    String goodsDesc;
    Integer goodsStock;
    Integer categoryId;
    Integer miaoshagoodsId;
    Integer miaoshaStock;
    float miaoshaPrice;
    Date beginTime;
    Date endTime;

    public GoodDetail() {
    }

    public GoodDetail(Integer goodsId, String goodsName, String goodsTitle, String goodsPrice, String goodsImg, String goodsDesc, Integer goodsStock, Integer categoryId, Integer miaoshagoodsId, Integer miaoshaStock, float miaoshaPrice, Date beginTime, Date endTime) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsTitle = goodsTitle;
        this.goodsPrice = goodsPrice;
        this.goodsImg = goodsImg;
        this.goodsDesc = goodsDesc;
        this.goodsStock = goodsStock;
        this.categoryId = categoryId;
        this.miaoshagoodsId = miaoshagoodsId;
        this.miaoshaStock = miaoshaStock;
        this.miaoshaPrice = miaoshaPrice;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsTitle() {
        return goodsTitle;
    }

    public void setGoodsTitle(String goodsTitle) {
        this.goodsTitle = goodsTitle;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public Integer getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(Integer goodsStock) {
        this.goodsStock = goodsStock;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getMiaoshagoodsId() {
        return miaoshagoodsId;
    }

    public void setMiaoshagoodsId(Integer miaoshagoodsId) {
        this.miaoshagoodsId = miaoshagoodsId;
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
        return "GoodDetail{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", goodsPrice='" + goodsPrice + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsStock=" + goodsStock +
                ", categoryId=" + categoryId +
                ", miaoshagoodsId=" + miaoshagoodsId +
                ", miaoshaStock=" + miaoshaStock +
                ", miaoshaPrice=" + miaoshaPrice +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }
}
