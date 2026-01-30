package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.DemostrationDto;
import com.sena.crudbasic.model.Demostration;
import com.sena.crudbasic.repository.DemostrationRepository;
import com.sena.crudbasic.service.DemostrationService;

@Service
public class DemostrationServiceImpl
implements DemostrationService {

    @Autowired
    private DemostrationRepository repo;

    @Override
    public List<Demostration> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Demostration findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Demostration> filterByType(String type) {
        return repo.filterByType(type);
    }

    // conversor del DTO al model
    public Demostration dtoToModel(DemostrationDto demostrationDto) {
        Demostration demostration = new Demostration();
        demostration.setId(demostrationDto.getId());
        demostration.setType(demostrationDto.getType());
        demostration.setRecord(null);
        return demostration;
    }

    public DemostrationDto modelToDto(Demostration demostration) {
        return new DemostrationDto(
                demostration.getId(),
                demostration.getType()
        );
    }

    @Override
    public String save(DemostrationDto demostrationDto) {
        Demostration demostration = dtoToModel(demostrationDto);
        repo.save(demostration);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }

}
