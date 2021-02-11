package com.zlt.service.impl;

import com.zlt.dao.BusinessMapper;
import com.zlt.domain.Business;
import com.zlt.domain.GoodVO;
import com.zlt.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired(required = false)
    BusinessMapper businessMapper;
    @Override
    public Business findById(int id) {
        return businessMapper.findById(id);
    }

    @Override
    public List<Business> findAll() {
        return businessMapper.findAll();
    }

    @Override
    public void insert(Business business) {
        businessMapper.insert(business);
    }

    @Override
    public void delete(Integer id) {
        businessMapper.delete(id);
    }

    @Override
    public void update(Business business) {
        businessMapper.update(business);
    }
    @Override
    public List<GoodVO> findGoodByBusiness(int id) {
        return businessMapper.findGoodByBusiness(id);
    }
}
