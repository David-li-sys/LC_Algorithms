package com.zlt.dao;

import com.zlt.domain.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GoodMapper {
    public List<Good> findAll();
    public Good findGoodById(Integer goodId);
    public int deleteGood(Integer goodId);
    public int updateGood(Good good);
    public int insertGood(Good good);
    public List<Good> findSomeGoods(@Param(value="start") Integer start, @Param(value="step") Integer step);
}
