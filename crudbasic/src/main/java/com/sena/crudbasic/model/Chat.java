package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "chat")
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChat")
    private int id;

    @Column(name = "name", length = 50)
    private String name;

    @OneToOne(mappedBy = "chat") // una charla tiene un solo registro
    private Record record;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Record getRecord() {
        return record;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
