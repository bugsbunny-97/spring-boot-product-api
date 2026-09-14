package com.bugsbunny.springbootproductapi.DTO;

import com.bugsbunny.springbootproductapi.entity.Product;

import java.time.LocalDateTime;

public class ProductRequestDTO {
    private Long id;
    private String name;
    private String description;
    private String category;
    private Double price;
    private String brand;
    private String createdBy;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Product toEntity(ProductRequestDTO productRequestDTO) {
        Product product = new Product();
        product.setId(productRequestDTO.getId());
        product.setName(productRequestDTO.getName());
        product.setDescription(productRequestDTO.getDescription());
        product.setCategory(productRequestDTO.getCategory());
        product.setPrice(productRequestDTO.getPrice());
        product.setBrand(productRequestDTO.getBrand());
        product.setCreatedAt(LocalDateTime.now());
        product.setCreatedBy(productRequestDTO.createdBy);
        product.setUpdatedAt(LocalDateTime.now());
        return product;
    }

    public ProductResponseDTO toResponseDTO(Product product) {
        ProductResponseDTO responseDTO = new ProductResponseDTO();
        responseDTO.setId(product.getId());
        responseDTO.setName(this.name);
        responseDTO.setDescription(this.description);
        responseDTO.setCategory(this.category);
        responseDTO.setPrice(this.price);
        responseDTO.setBrand(this.brand);
        responseDTO.setCreatedAt(product.getCreatedAt());
        responseDTO.setCreatedBy(product.getCreatedBy());
        return responseDTO;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
