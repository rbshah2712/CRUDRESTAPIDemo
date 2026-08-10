package com.ruchis.CRUDRESTAPIDemo.repository;

import com.ruchis.CRUDRESTAPIDemo.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface  ProductionRepository extends JpaRepository<Product, Long> {

}
