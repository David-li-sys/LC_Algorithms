package com.zlt.service.impl;

import com.zlt.dao.AddressMapper;
import com.zlt.domain.Address;
import com.zlt.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired(required = false)
    AddressMapper addressMapper;
    public int insertAddress(Address address){
       return addressMapper.insertAddress(address);

    }
}
