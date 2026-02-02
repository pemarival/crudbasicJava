package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Fair;

@Repository
public interface FairRepository
        extends JpaRepository<Fair, Integer> {

    @Query(""
            + "SELECT "
            + "f "
            + "FROM "
            + "fair f "
            + "WHERE "
            + "f.name like %?1%"
    )
    public List<Fair> filterByName(String name);

}
