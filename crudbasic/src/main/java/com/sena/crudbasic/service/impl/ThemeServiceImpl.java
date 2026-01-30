package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.ThemeDto;
import com.sena.crudbasic.model.Theme;
import com.sena.crudbasic.repository.ThemeRepository;
import com.sena.crudbasic.service.ThemeService;

@Service
public class ThemeServiceImpl
implements ThemeService {

    @Autowired
    private ThemeRepository repo;

    @Override
    public List<Theme> findAll() {
        return repo.findAll();
    }

    @Override
    public Theme findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Theme> filterByType(String type) {
        return repo.filterByType(type);
    }

    // DTO → Model
    public Theme dtoToModel(ThemeDto dto) {
        return new Theme(
                dto.getId(),
                dto.getType(),
                null
        );
    }

    // Model → DTO
    public ThemeDto modelToDto(Theme theme) {
        return new ThemeDto(
                theme.getId(),
                theme.getType()
        );
    }

    @Override
    public String save(ThemeDto t) {
        Theme theme = dtoToModel(t);
        repo.save(theme);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }
}
