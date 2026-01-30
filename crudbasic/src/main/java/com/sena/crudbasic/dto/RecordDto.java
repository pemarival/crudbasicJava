package com.sena.crudbasic.dto;

public class RecordDto {

    private int id;
    private String online;

    public RecordDto() {
        super();
    }

    public RecordDto(int id, String online) {
        super();
        this.id = id;
        this.online = online;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }
}
