package com.sena.crudbasic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.crudbasic.dto.PersonDto;
import com.sena.crudbasic.model.Person;
import com.sena.crudbasic.repository.PersonRepository;
import com.sena.crudbasic.service.PersonService;

@Service
public class PersonServiceImpl
implements PersonService {

    @Autowired
    private PersonRepository repo;

    @Override
    public List<Person> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Person findById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Person> filterByName(String name) {
        return repo.filterByName(name);
    }

    // conversor del DTO al model
    public Person dtoToModel(PersonDto personDto) {
        Person person = new Person();
        person.setId(personDto.getId());
        person.setName(personDto.getName());
        person.setResponsibles(null);
        person.setSpeakers(null);
        person.setVisitors(null);
        return person;
    }

    public PersonDto modelToDto(Person person) {
        return new PersonDto(
                person.getId(),
                person.getName(),
                null,
                null,
                null,
                null
        );
    }

    @Override
    public String save(PersonDto personDto) {
        Person person = dtoToModel(personDto);
        repo.save(person);
        return null;
    }

    @Override
    public String delete(int id) {
        repo.deleteById(id);
        return null;
    }
}
