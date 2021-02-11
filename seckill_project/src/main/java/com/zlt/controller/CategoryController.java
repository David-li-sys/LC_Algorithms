package com.zlt.controller;

import com.zlt.dao.CategoryMapper;
import com.zlt.domain.Category;
import com.zlt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Autowired(required = false)
    CategoryService categoryService;
    @GetMapping("/findCategoryById")
    @ResponseBody
    public Category findCategoryById(Integer categoryId){
        return categoryService.findCategoryById(categoryId);
    }
}
