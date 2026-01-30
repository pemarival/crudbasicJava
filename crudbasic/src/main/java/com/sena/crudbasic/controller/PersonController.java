package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sena.crudbasic.dto.PersonDto;
import com.sena.crudbasic.model.Person;
import com.sena.crudbasic.service.PersonService;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<Object>(
                service.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(
            @RequestBody PersonDto p) {
        service.save(p);
        return new ResponseEntity<Object>(
                "Se guardó", HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(
            @PathVariable int id) {
        Person person = service.findById(id);
        return new ResponseEntity<Object>(
                person, HttpStatus.OK);
    }

    @GetMapping("filterbyname/{name}")
    public ResponseEntity<Object> filterByName(
            @PathVariable String name) {
        List<Person> person = service.filterByName(name);
        return new ResponseEntity<Object>(
                person, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(
            @PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<Object>(
                "Se eliminó", HttpStatus.OK);
    }
}
