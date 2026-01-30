package com.sena.crudbasic.dto;

public class DemostrationDto {

    private int id;
    private String type;

    public DemostrationDto(int id, String type) {
        super();
        this.id = id;
        this.type = type;
    }

    public DemostrationDto() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
