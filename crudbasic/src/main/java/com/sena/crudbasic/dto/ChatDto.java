package com.sena.crudbasic.dto;

public class ChatDto {

    private int id;
    private String name;

    public ChatDto(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public ChatDto() {
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
