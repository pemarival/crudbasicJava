package com.sena.crudbasic.dto;

public class SpeakerDto {

    private int id;

    public SpeakerDto(int id) {
        super();
        this.id = id;
    }

    public SpeakerDto() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
