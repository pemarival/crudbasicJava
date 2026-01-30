package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.SpeakerDto;
import com.sena.crudbasic.model.Speaker;

public interface SpeakerService {

    /*
     * findAll
     * findById
     * save
     * delete
     */
    public List<Speaker> findAll();
    public Speaker findById(int id);
    public String save(SpeakerDto s);
    public String delete(int id);
}
