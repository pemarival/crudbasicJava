package com.sena.crudbasic.dto;

public class PavilionDto {

    private int id;

    public PavilionDto(int id) {
        super();
        this.id = id;
    }

    public PavilionDto() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
