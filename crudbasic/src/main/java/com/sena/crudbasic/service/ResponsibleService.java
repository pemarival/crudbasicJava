package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.ResponsibleDto;
import com.sena.crudbasic.model.Responsible;

public interface ResponsibleService {

    /*
     * findAll
     * findById
     * save
     * delete
     */
    public List<Responsible> findAll();
    public Responsible findById(int id);
    public String save(ResponsibleDto r);
    public String delete(int id);
}
