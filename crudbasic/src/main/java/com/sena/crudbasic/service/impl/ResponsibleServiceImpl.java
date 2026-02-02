package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.ResponsibleDto;
import com.sena.crudbasic.model.Responsible;
import com.sena.crudbasic.repository.ResponsibleRepository;
import com.sena.crudbasic.service.ResponsibleService;

@Service
public class ResponsibleServiceImpl
implements ResponsibleService {

    @Autowired
    private ResponsibleRepository repo;

    @Override
    public List<Responsible> findAll() {
        return repo.findAll();
    }

    @Override
    public Responsible findById(int id) {
        return repo.findById(id).orElse(null);
    }

    // DTO → Model
    public Responsible dtoToModel(ResponsibleDto dto) {
        Responsible responsible = new Responsible();
        responsible.setId(dto.getId());
        responsible.setProducts(null);
        responsible.setPerson(null);
        return responsible;
    }

    // Model → DTO
    public ResponsibleDto modelToDto(Responsible responsible) {
        return new ResponsibleDto(responsible.getId());
    }

    @Override
    public String save(ResponsibleDto r) {
        Responsible responsible = dtoToModel(r);
        repo.save(responsible);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }
}
