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

import com.sena.crudbasic.dto.RecordDto;
import com.sena.crudbasic.model.Record;
import com.sena.crudbasic.service.RecordService;

@RestController
public class RecordController {

    @Autowired
    private RecordService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<Object>(
                service.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(
            @RequestBody RecordDto r) {
        service.save(r);
        return new ResponseEntity<Object>(
                "Se guardó", HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(
            @PathVariable int id) {
        Record record = service.findById(id);
        return new ResponseEntity<Object>(
                record, HttpStatus.OK);
    }

    @GetMapping("filterbyonline/{online}")
    public ResponseEntity<Object> filterByOnline(
            @PathVariable String online) {
        List<Record> record = service.filterByOnline(online);
        return new ResponseEntity<Object>(
                record, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(
            @PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<Object>(
                "Se eliminó", HttpStatus.OK);
    }
}
