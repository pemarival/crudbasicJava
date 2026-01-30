package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.TypevisitorDto;
import com.sena.crudbasic.model.Typevisitor;
import com.sena.crudbasic.repository.TypevisitorRepository;
import com.sena.crudbasic.service.TypevisitorService;

@Service
public class TypevisitorServiceImpl
implements TypevisitorService {

    @Autowired
    private TypevisitorRepository repo;

    @Override
    public List<Typevisitor> findAll() {
        return repo.findAll();
    }

    @Override
    public Typevisitor findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Typevisitor> filterByEntrance(String entrance) {
        return repo.filterByEntrance(entrance);
    }

    // DTO → Model
    public Typevisitor dtoToModel(TypevisitorDto dto) {
        return new Typevisitor(
                dto.getId(),
                dto.getEntrance(),
                null
        );
    }

    // Model → DTO
    public TypevisitorDto modelToDto(Typevisitor t) {
        return new TypevisitorDto(
                t.getId(),
                t.getEntrance()
        );
    }

    @Override
    public String save(TypevisitorDto t) {
        Typevisitor tv = dtoToModel(t);
        repo.save(tv);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }
}
