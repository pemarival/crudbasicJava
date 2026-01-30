package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.ThemeDto;
import com.sena.crudbasic.model.Theme;

public interface ThemeService {

    /*
     * findAll
     * findById
     * filterByType
     * save
     * delete
     */
    public List<Theme> findAll();
    public Theme findById(int id);
    public List<Theme> filterByType(String type);
    public String save(ThemeDto t);
    public String delete(int id);
}
