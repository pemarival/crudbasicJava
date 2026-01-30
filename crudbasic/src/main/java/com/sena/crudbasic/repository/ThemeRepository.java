package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Theme;

@Repository
public interface ThemeRepository
extends JpaRepository<Theme, Integer> {

    @Query("""
        SELECT t
        FROM theme t
        WHERE t.type LIKE %?1%
    """)
    public List<Theme> filterByType(String type);
}
