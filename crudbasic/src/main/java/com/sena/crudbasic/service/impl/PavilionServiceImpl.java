package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.PavilionDto;
import com.sena.crudbasic.model.Pavilion;
import com.sena.crudbasic.repository.PavilionRepository;
import com.sena.crudbasic.service.PavilionService;

@Service
public class PavilionServiceImpl
implements PavilionService {

    @Autowired
    private PavilionRepository repo;

    @Override
    public List<Pavilion> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Pavilion findById(int id) {
        return repo.findById(id).orElse(null);
    }

    // conversor del DTO al model
    public Pavilion dtoToModel(PavilionDto pavilionDto) {
        Pavilion pavilion = new Pavilion();
        pavilion.setId(pavilionDto.getId());
        pavilion.setTheme(null);
        pavilion.setFair(null);
        pavilion.setStand(null);
        return pavilion;
    }

    public PavilionDto modelToDto(Pavilion pavilion) {
        return new PavilionDto(
                pavilion.getId()
        );
    }

    @Override
    public String save(PavilionDto pavilionDto) {
        Pavilion pavilion = dtoToModel(pavilionDto);
        repo.save(pavilion);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }
}
