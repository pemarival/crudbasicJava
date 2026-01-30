package com.sena.crudbasic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name = "stand")
public class Stand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_stand")
    private int id;

    @ManyToOne // muchos stands pertenecen a una empresa
    @JoinColumn(name = "id_company")
    private Company company;

    @OneToOne // un stand pertenece a un pabellón
    @JoinColumn(name = "id_pavilion")
    private Pavilion pavilion;

    public int getId() {
        return id;
    }

    public Company getCompany() {
        return company;
    }

    public Pavilion getPavilion() {
        return pavilion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPavilion(Pavilion pavilion) {
        this.pavilion = pavilion;
    }
}
