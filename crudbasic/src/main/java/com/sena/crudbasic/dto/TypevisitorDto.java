package com.sena.crudbasic.dto;

public class TypevisitorDto {

    private int id;
    private String entrance;

    public TypevisitorDto() {
        super();
    }

    public TypevisitorDto(int id, String entrance) {
        super();
        this.id = id;
        this.entrance = entrance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }
}
