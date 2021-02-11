package com.zlt.dao;

import com.zlt.domain.Good;
import com.zlt.domain.MiaoshaGood;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MiaoshaMapper {
    public List<Good> findAllMiaoshaGoods();
    public int insertMiaoshaGood(MiaoshaGood miaoshaGood);
    public int deleteMiaoshaGood(Integer goodId);

}
