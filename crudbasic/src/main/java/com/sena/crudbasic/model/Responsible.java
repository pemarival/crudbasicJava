package com.sena.crudbasic.model;

import java.util.List;

import jakarta.persistence.*;

@Entity(name="responsible")
public class Responsible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_responsible")
    private int id;

    @OneToMany(mappedBy = "responsible")
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name="id_person")
    private Person person;

    public Responsible() {
        super();
    }

    public Responsible(int id, List<Product> products) {
        super();
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
