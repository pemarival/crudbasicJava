package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name = "speaker")
public class Speaker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_speaker")
    private int id;

    @ManyToOne // muchos ponentes hacen parte de una persona
    @JoinColumn(name = "id_person")
    private Person person;

    @OneToOne // un ponente tiene solo un registro
    @JoinColumn(name = "id_record", unique = true, nullable = false)
    private Record record;

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Record getRecord() {
        return record;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
}
