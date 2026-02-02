package com.sena.crudbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Pavilion;

@Repository
public interface PavilionRepository
        extends JpaRepository<Pavilion, Integer> {
}
