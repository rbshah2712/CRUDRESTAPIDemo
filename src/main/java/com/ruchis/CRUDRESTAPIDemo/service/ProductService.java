package com.ruchis.CRUDRESTAPIDemo.service;


import org.springframework.stereotype.Service;

import com.ruchis.CRUDRESTAPIDemo.dto.CategoryDTO;
import com.ruchis.CRUDRESTAPIDemo.dto.ProductDTO;
import com.ruchis.CRUDRESTAPIDemo.entity.Product;
import com.ruchis.CRUDRESTAPIDemo.mapper.CategoryMapper;
import com.ruchis.CRUDRESTAPIDemo.mapper.ProductMapper;
import com.ruchis.CRUDRESTAPIDemo.repository.CategoryRepository;
import com.ruchis.CRUDRESTAPIDemo.repository.ProductionRepository;

@Service
public class ProductService {

    private  ProductionRepository productRepository;
    //create product
   public ProductDTO createProduct(ProductDTO productDTO) {
            Product product = ProductMapper.toProductEntity(productDTO, null);
            productRepository.save(product);
            return ProductMapper.toProductDTO(product);
    }

}
