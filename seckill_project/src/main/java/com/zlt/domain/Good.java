package com.zlt.domain;

public class Good {

    Integer goodsId;
    String goodsName;
    String goodsTitle;
    float goodsPrice;
    String goodsImg;
    String goodsDesc;
    Integer goodsStock;
    Integer categoryId;

    public Good() {

    }

    public Good(Integer goodsId, String goodsName, String goodsTitle, float goodsPrice, String goodsImg, String goodsDesc, Integer goodsStock, Integer categoryId) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsTitle = goodsTitle;
        this.goodsPrice = goodsPrice;
        this.goodsImg = goodsImg;
        this.goodsDesc = goodsDesc;
        this.goodsStock = goodsStock;
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Good{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsTitle='" + goodsTitle + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsImg='" + goodsImg + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsStock=" + goodsStock +
                ", categoryId=" + categoryId +
                '}';
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

    public float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(float goodsPrice) {
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
}
