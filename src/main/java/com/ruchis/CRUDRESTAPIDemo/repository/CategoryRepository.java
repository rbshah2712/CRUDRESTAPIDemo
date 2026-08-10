package com.ruchis.CRUDRESTAPIDemo.repository;

import com.ruchis.CRUDRESTAPIDemo.entity.Category;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
