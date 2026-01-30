package com.sena.crudbasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Responsible;

@Repository
public interface ResponsibleRepository
        extends JpaRepository<Responsible, Integer> {
}
