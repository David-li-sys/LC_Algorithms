package com.zlt.dao;

import com.zlt.domain.Address;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AddressMapper {
    public int insertAddress(Address address);
}
