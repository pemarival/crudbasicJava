package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.RecordDto;
import com.sena.crudbasic.model.Record;

public interface RecordService {

    /*
     * findAll
     * findById
     * filterByOnline
     * save
     * delete
     */
    public List<Record> findAll();
    public Record findById(int id);
    public List<Record> filterByOnline(String online);
    public String save(RecordDto r);
    public String delete(int id);
}
