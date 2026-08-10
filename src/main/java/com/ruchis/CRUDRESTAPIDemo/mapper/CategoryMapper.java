package com.ruchis.CRUDRESTAPIDemo.mapper;

import com.ruchis.CRUDRESTAPIDemo.dto.CategoryDTO;
import com.ruchis.CRUDRESTAPIDemo.entity.Category;

public class CategoryMapper {

    public static CategoryDTO toCategoryDTO(Category category) {

        if (category == null) {
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setProducts(category.getProducts().stream()
                .map(product -> ProductMapper.toProductDTO(product))
                .toList());
        return categoryDTO;
    }

    public static Category tocategoryEntity(CategoryDTO categoryDTO) {
            Category category = new Category();
            category.setName(categoryDTO.getName());    
            return category;
    }
}
