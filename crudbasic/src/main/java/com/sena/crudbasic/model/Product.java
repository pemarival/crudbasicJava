package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne // muchos productos hacen parte de un stand
    @JoinColumn(name = "id_stand")
    private Stand stand;

    @ManyToOne // muchos productos tienen un responsable
    @JoinColumn(name = "id_responsible")
    private Responsible responsible;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Stand getStand() {
        return stand;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }
}
