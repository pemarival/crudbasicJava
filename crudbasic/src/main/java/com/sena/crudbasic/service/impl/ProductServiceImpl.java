package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.ProductDto;
import com.sena.crudbasic.model.Product;
import com.sena.crudbasic.repository.ProductRepository;
import com.sena.crudbasic.service.ProductService;

@Service
public class ProductServiceImpl
implements ProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public List<Product> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Product findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Product> filterByName(String name) {
        return repo.filterByName(name);
    }

    // conversor del DTO al model
    public Product dtoToModel(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setStand(null);
        product.setResponsible(null);
        return product;
    }

    public ProductDto modelToDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getName()
        );
    }

    @Override
    public String save(ProductDto productDto) {
        Product product = dtoToModel(productDto);
        repo.save(product);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }
}
