package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Record;

@Repository
public interface RecordRepository
        extends JpaRepository<Record, Integer> {

    @Query(""
            + "SELECT "
            + "r "
            + "FROM "
            + "record r "
            + "WHERE "
            + "r.online like %?1%"
    )
    public List<Record> filterByOnline(String online);
}
