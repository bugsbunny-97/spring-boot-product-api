package com.bugsbunny.springbootproductapi;


import com.bugsbunny.springbootproductapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
