package com.zlt.service.impl;

import com.zlt.dao.GoodMapper;
import com.zlt.domain.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements com.zlt.service.GoodService {

    @Autowired(required = false)
    GoodMapper goodMapper;


    public List<Good> findAll() {
        return goodMapper.findAll();
    }

    public Good findGoodById(Integer goodId) {
        return goodMapper.findGoodById(goodId);
    }

    public int deleteGood(Integer goodId) {
        return goodMapper.deleteGood(goodId);
    }

    public int updateGood(Good good) {
        return goodMapper.updateGood(good);
    }

    public int insertGood(Good good) {
        return goodMapper.insertGood(good);
    }

    public List<Good> findSomeGoods(Integer start, Integer step) {
        return goodMapper.findSomeGoods(start,step);
    }
}
