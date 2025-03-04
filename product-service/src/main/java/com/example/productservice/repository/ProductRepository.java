package com.example.productservice.repository;

import com.example.productservice.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    @Query(nativeQuery = true,value = "SELECT count(*) from products where activated is true")
    long countActiveProducts();

}
