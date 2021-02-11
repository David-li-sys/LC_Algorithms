package com.zlt.service;

import com.zlt.domain.Business;
import com.zlt.domain.GoodVO;

import java.util.List;

public interface BusinessService {
    public Business findById(int id);
    public List<Business> findAll();
    public void insert(Business business);
    public void delete(Integer id);
    public void update(Business business);
    public List<GoodVO> findGoodByBusiness(int id);
}
