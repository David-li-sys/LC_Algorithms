package com.zlt.service.impl;

import com.zlt.dao.GoodDetailMapper;
import com.zlt.domain.GoodDetail;
import com.zlt.service.GoodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodDetailServiceImpl implements GoodDetailService {
    @Autowired(required = false)
    GoodDetailMapper goodDetailMapper;
    @Override
    public GoodDetail getGoodDetail(Integer miaoshaGoodsId) {
        return goodDetailMapper.getGoodDetail(miaoshaGoodsId);
    }
}
