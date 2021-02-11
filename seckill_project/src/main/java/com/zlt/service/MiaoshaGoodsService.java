package com.zlt.service;

import com.zlt.domain.Good;
import com.zlt.domain.MiaoshaGood;

import java.util.List;

public interface MiaoshaGoodsService {
    public List<Good> findAllMiaoshaGoods();
    public int insertMiaoshaGood(MiaoshaGood miaoshaGood);
    public int deleteMiaoshaGood(Integer goodId);
}
