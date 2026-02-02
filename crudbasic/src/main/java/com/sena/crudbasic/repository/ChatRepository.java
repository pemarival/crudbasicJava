package com.sena.crudbasic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sena.crudbasic.model.Chat;

@Repository
public interface ChatRepository
        extends JpaRepository<Chat, Integer> {

    /*
     * JpaRepository
     * Incluye las consultas basicas
     * Para una consulta personalizada
     * es requerido definir el método necesario
     */

    @Query(""
            + "SELECT "
            + "c "
            + "FROM "
            + "chat c "
            + "WHERE "
            + "c.name like %?1%"
    )
    public List<Chat> filterByName(String name);

}
