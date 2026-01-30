package com.sena.crudbasic.dto;

public class CompanyDto {

    private int id;
    private String name;

    public CompanyDto(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public CompanyDto() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
