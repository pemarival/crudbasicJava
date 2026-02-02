package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.ProductDto;
import com.sena.crudbasic.model.Product;

public interface ProductService {

    /*
     * findAll
     * findById
     * filterByName
     * save
     * delete
     */
    public List<Product> findAll();
    public Product findById(int id);
    public List<Product> filterByName(String name);
    public String save(ProductDto p);
    public String delete(int id);
}
