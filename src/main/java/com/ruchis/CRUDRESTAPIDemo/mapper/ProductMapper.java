package com.ruchis.CRUDRESTAPIDemo.mapper;

import com.ruchis.CRUDRESTAPIDemo.dto.ProductDTO;
import com.ruchis.CRUDRESTAPIDemo.entity.Category;
import com.ruchis.CRUDRESTAPIDemo.entity.Product;

public class ProductMapper {


   public static ProductDTO toProductDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setCategoryId(product.getCategory().getId());
        return productDTO;
    }

    public static Product toProductEntity(ProductDTO productDTO, Category category) {
        if (productDTO == null) {
            return null;
        }
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(category);
        return product;
    }
}
