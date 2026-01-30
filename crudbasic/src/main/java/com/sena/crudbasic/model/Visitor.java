package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "visitor")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visitor")
    private int id;

    @ManyToOne // muchos visitantes hacen parte de una persona
    @JoinColumn(name = "id_person")
    private Person person;

    @ManyToOne // muchos visitantes tienen un solo tipo de entrada
    @JoinColumn(name = "id_typevisitor")
    private Typevisitor typevisitor;

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Typevisitor getTypevisitor() {
        return typevisitor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setTypevisitor(Typevisitor typevisitor) {
        this.typevisitor = typevisitor;
    }
}
