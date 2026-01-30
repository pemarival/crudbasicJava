package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Person;

@Repository
public interface PersonRepository
        extends JpaRepository<Person, Integer> {

    @Query(""
            + "SELECT "
            + "p "
            + "FROM "
            + "person p "
            + "WHERE "
            + "p.name like %?1%"
    )
    public List<Person> filterByName(String name);
}
