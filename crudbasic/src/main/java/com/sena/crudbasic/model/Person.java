package com.sena.crudbasic.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_person")
    private int id;

    @Column(name="name", length = 50)
    private String name;

    @Column(name="lastname", length =50)
    private String lastname;

    @Column(name="dni", length = 50)
    private String dni;

    @Column(name="gmail", length = 50)
    private String gmail;

    @Column(name="phone", length = 50)
    private String phone;

    @OneToMany(mappedBy = "person")//de una persona salen muchos responsables
    private List<Responsible> responsibles;

    @OneToMany(mappedBy = "person") //de una persona salen muchos ponentes
    private List<Speaker> speakers;

    @OneToMany(mappedBy = "person") //de una persona salen muchos visitantes
    private List<Visitor> visitors;

    		public Person(int id, String name, List<Responsible> responsibles, List<Speaker> speakers, List<Visitor> visitors) {
			super();
			this.id = id;
			this.name = name;
			this.responsibles = responsibles;
            this.speakers = speakers;
            this.visitors = visitors;
		}
		
		public Person() {
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

		public List<Responsible> getResponsibles() {
			return responsibles;
		}

		public void setResponsibles(List<Responsible> responsibles) {
			this.responsibles = responsibles;
		}
        		public List<Speaker> getSpeakers() {
			return speakers;
		}

		public void setSpeakers(List<Speaker> speakers) {
			this.speakers = speakers;
		}

        		public List<Visitor> getVisitors() {
			return visitors;
		}

		public void setVisitors(List<Visitor> visitors) {
			this.visitors = visitors;
		}
}