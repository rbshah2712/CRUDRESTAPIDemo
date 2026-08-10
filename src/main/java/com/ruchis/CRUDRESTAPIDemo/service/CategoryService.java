package com.ruchis.CRUDRESTAPIDemo.service;

import org.springframework.stereotype.Service;

import com.ruchis.CRUDRESTAPIDemo.dto.CategoryDTO;
import com.ruchis.CRUDRESTAPIDemo.entity.Category;
import com.ruchis.CRUDRESTAPIDemo.mapper.CategoryMapper;
import com.ruchis.CRUDRESTAPIDemo.repository.CategoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryService {

    private  CategoryRepository categoryRepository;
    //create category
   public CategoryDTO createCategory(CategoryDTO categoryDTO) {
            Category category = CategoryMapper.tocategoryEntity(categoryDTO);
            categoryRepository.save(category);
            return CategoryMapper.toCategoryDTO(category);
    }

    
    
}
