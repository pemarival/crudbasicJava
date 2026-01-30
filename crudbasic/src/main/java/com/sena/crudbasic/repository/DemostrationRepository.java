package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Demostration;

@Repository
public interface DemostrationRepository
        extends JpaRepository<Demostration, Integer> {

    @Query(""
            + "SELECT "
            + "d "
            + "FROM "
            + "demostration d "
            + "WHERE "
            + "d.type like %?1%"
    )
    public List<Demostration> filterByType(String type);

}
