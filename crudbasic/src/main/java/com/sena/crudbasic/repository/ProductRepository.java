package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Product;

@Repository
public interface ProductRepository
        extends JpaRepository<Product, Integer> {

    @Query(""
            + "SELECT "
            + "p "
            + "FROM "
            + "product p "
            + "WHERE "
            + "p.name like %?1%"
    )
    public List<Product> filterByName(String name);
}
