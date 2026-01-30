package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.CompanyDto;
import com.sena.crudbasic.model.Company;
import com.sena.crudbasic.repository.CompanyRepository;
import com.sena.crudbasic.service.CompanyService;

@Service
public class CompanyServiceImpl
implements CompanyService {

    @Autowired
    private CompanyRepository repo;

    @Override
    public List<Company> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Company findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Company> filterByName(String name) {
        return repo.filterByName(name);
    }

    // conversor del DTO al model
    public Company dtoToModel(CompanyDto companyDto) {
        return new Company(
                companyDto.getId(),
                companyDto.getName(),
                null
        );
    }

    public CompanyDto modelToDto(Company company) {
        return new CompanyDto(
                company.getId(),
                company.getName()
        );
    }

    @Override
    public String save(CompanyDto companyDto) {
        Company company = dtoToModel(companyDto);
        repo.save(company);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }

}
