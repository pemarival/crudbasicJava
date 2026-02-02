package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.TypevisitorDto;
import com.sena.crudbasic.model.Typevisitor;

public interface TypevisitorService {

    /*
     * findAll
     * findById
     * filterByEntrance
     * save
     * delete
     */
    public List<Typevisitor> findAll();
    public Typevisitor findById(int id);
    public List<Typevisitor> filterByEntrance(String entrance);
    public String save(TypevisitorDto t);
    public String delete(int id);
}
