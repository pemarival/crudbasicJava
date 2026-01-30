package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "demostration")
public class Demostration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_demostration")
    private int id;

    @Column(name = "name", length = 50)
    private String type;

    @OneToOne(mappedBy = "demostration") // una demostración tiene un solo registro
    private Record record;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Record getRecord() {
        return record;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
