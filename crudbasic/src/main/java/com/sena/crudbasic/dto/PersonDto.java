package com.sena.crudbasic.dto;

public class PersonDto {

    private int id;
    private String name;
    private String lastname;
    private String dni;
    private String gmail;
    private String phone;

    public PersonDto(int id, String name, String lastname, String dni, String gmail, String phone) {
        super();
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.gmail = gmail;
        this.phone = phone;
    }

    public PersonDto() {
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
