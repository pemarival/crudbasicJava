package com.sena.crudbasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.crudbasic.dto.ThemeDto;
import com.sena.crudbasic.model.Theme;
import com.sena.crudbasic.service.ThemeService;

@RestController
@RequestMapping("theme")
public class ThemeController {

    @Autowired
    private ThemeService service;

    @GetMapping("")
    public ResponseEntity<Object> findAll() {
        return new ResponseEntity<Object>(
                service.findAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(
            @RequestBody ThemeDto t) {
        service.save(t);
        return new ResponseEntity<Object>(
                "Se guardó", HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Object> findById(
            @PathVariable int id) {
        Theme theme = service.findById(id);
        return new ResponseEntity<Object>(
                theme, HttpStatus.OK);
    }

    @GetMapping("filterbytype/{type}")
    public ResponseEntity<Object> filterByType(
            @PathVariable String type) {
        List<Theme> themes = service.filterByType(type);
        return new ResponseEntity<Object>(
                themes, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> delete(
            @PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<Object>(
                "Se eliminó", HttpStatus.OK);
    }
}
