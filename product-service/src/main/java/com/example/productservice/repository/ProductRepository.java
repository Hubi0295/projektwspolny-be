package com.example.productservice.repository;

import com.example.productservice.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    @Query(nativeQuery = true,value = "SELECT count(*) from products where activated is true")
    long countActiveProducts();
    Optional<ProductEntity> findByUid(String uuid);
    List<ProductEntity> findByNameAndCreatedAt(String name, LocalDate createdAt);
}
