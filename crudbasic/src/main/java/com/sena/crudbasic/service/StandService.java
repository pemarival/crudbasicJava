package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.StandDto;
import com.sena.crudbasic.model.Stand;

public interface StandService {

    /*
     * findAll
     * findById
     * save
     * delete
     */
    public List<Stand> findAll();
    public Stand findById(int id);
    public String save(StandDto s);
    public String delete(int id);
}
