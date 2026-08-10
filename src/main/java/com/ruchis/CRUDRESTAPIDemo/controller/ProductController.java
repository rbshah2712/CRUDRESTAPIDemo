package com.ruchis.CRUDRESTAPIDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    //getProduct
    public String getProduct() {
        return "Get Product";
    }

    public String getAllProducts() {
        return "Get All Products";
    }

    //CreateProduct

    public String createProduct() {
        return "Create Product";
    }

    //UpdateProduct

    public String updateProduct() {
        return "Update Product";
    }
    
    
}
