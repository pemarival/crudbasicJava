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

import com.sena.crudbasic.dto.DemostrationDto;
import com.sena.crudbasic.model.Demostration;
import com.sena.crudbasic.service.DemostrationService;

@RestController
public class DemostrationController {

    @Autowired
    private DemostrationService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<Object>(
                service.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(
            @RequestBody DemostrationDto d) {
        service.save(d);
        return new ResponseEntity<Object>(
                "Se guardó", HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(
            @PathVariable int id) {
        Demostration demostration = service.findById(id);
        return new ResponseEntity<Object>(
                demostration, HttpStatus.OK);
    }

    @GetMapping("filterbytype/{type}")
    public ResponseEntity<Object> filterByType(
            @PathVariable String type) {
        List<Demostration> demostration = service.filterByType(type);
        return new ResponseEntity<Object>(
                demostration, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(
            @PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<Object>(
                "Se eliminó", HttpStatus.OK);
    }
}
