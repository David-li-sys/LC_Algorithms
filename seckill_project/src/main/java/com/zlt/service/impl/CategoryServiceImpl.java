package com.zlt.service.impl;

import com.zlt.dao.CategoryMapper;
import com.zlt.domain.Category;
import com.zlt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired(required = false)
    CategoryMapper categoryMapper;

    public Category findCategoryById(Integer categoryId) {
        return categoryMapper.findCategoryById(categoryId);
    }
}
