package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.DemostrationDto;
import com.sena.crudbasic.model.Demostration;

public interface DemostrationService {

    /*
     * findAll
     * findById
     * filterByName
     * save
     * delete
     */
    public List<Demostration> findAll();
    public Demostration findById(int id);
    public List<Demostration> filterByType(String type);
    public String save(DemostrationDto d);
    public String delete(int id);
}
