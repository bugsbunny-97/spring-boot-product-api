package com.bugsbunny.springbootproductapi.service;

import com.bugsbunny.springbootproductapi.DTO.ProductRequestDTO;
import com.bugsbunny.springbootproductapi.DTO.ProductResponseDTO;
import com.bugsbunny.springbootproductapi.ProductRepository;
import com.bugsbunny.springbootproductapi.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponseDTO createProduct(ProductRequestDTO productRequestDTO) {
        Long uuid = System.currentTimeMillis();
        productRequestDTO.setId(uuid);
        Product product = productRepository.save(productRequestDTO.toEntity(productRequestDTO));
        return productRequestDTO.toResponseDTO(product);
    }
}
