package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.TypevisitorDto;
import com.sena.crudbasic.model.Typevisitor;
import com.sena.crudbasic.service.TypevisitorService;

@RestController
@RequestMapping("typevisitor")
public class TypevisitorController {

    @Autowired
    private TypevisitorService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<Object>(
                service.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(
            @RequestBody TypevisitorDto t) {
        service.save(t);
        return new ResponseEntity<Object>(
                "Se guardó", HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(
            @PathVariable int id) {
        Typevisitor tv = service.findById(id);
        return new ResponseEntity<Object>(
                tv, HttpStatus.OK);
    }

    @GetMapping("filterbyentrance/{entrance}")
    public ResponseEntity<Object> filterByEntrance(
            @PathVariable String entrance) {
        List<Typevisitor> list = service.filterByEntrance(entrance);
        return new ResponseEntity<Object>(
                list, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(
            @PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<Object>(
                "Se eliminó", HttpStatus.OK);
    }
}
