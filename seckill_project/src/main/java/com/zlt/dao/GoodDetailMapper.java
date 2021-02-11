package com.zlt.dao;

import com.zlt.domain.GoodDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodDetailMapper {
    public GoodDetail getGoodDetail(Integer miaoshaGoodsId);
}
