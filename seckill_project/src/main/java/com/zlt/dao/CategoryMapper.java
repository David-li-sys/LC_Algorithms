package com.zlt.dao;

import com.zlt.domain.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    public Category findCategoryById(Integer categoryId);
}
