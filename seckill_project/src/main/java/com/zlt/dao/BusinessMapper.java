package com.zlt.dao;

import com.zlt.domain.Business;
import com.zlt.domain.Good;
import com.zlt.domain.GoodVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BusinessMapper {
    public Business findById(int id);
    public List<Business> findAll();
    public void insert(Business business);
    public void delete(int id);
    public void update(Business business);
    public List<GoodVO> findGoodByBusiness(int id);
}

