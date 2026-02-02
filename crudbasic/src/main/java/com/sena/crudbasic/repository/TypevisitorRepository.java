package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Typevisitor;

@Repository
public interface TypevisitorRepository
extends JpaRepository<Typevisitor, Integer> {

    @Query("""
        SELECT t
        FROM typevisitor t
        WHERE t.entrance LIKE %?1%
    """)
    public List<Typevisitor> filterByEntrance(String entrance);
}
