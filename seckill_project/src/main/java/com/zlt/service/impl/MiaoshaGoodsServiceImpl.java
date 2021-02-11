package com.zlt.service.impl;

import com.zlt.dao.MiaoshaMapper;
import com.zlt.domain.Good;
import com.zlt.domain.MiaoshaGood;
import com.zlt.service.MiaoshaGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiaoshaGoodsServiceImpl implements MiaoshaGoodsService {
    @Autowired(required = false)
    MiaoshaMapper miaoshaMapper;
    public List<Good> findAllMiaoshaGoods() {
        return miaoshaMapper.findAllMiaoshaGoods();
    }

    public int insertMiaoshaGood(MiaoshaGood miaoshaGood) {
        return miaoshaMapper.insertMiaoshaGood(miaoshaGood);
    }

    public int deleteMiaoshaGood(Integer goodId) {
        return miaoshaMapper.deleteMiaoshaGood(goodId);
    }
}
