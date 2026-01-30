package com.sena.crudbasic.model;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_company")
    private int id;

    @Column(name="name", length = 50)
    private String name;

    @OneToMany(mappedBy = "company") //una empresa tiene muchos stands
    private List<Stand> stands;

    		public Company(int id, String name, List<Stand> stands) {
			super();
			this.id = id;
			this.name = name;
			this.stands = stands;
		}
		
		public Company() {
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

		public List<Stand> getStands() {
			return stands;
		}

		public void setStands(List<Stand> stands) {
			this.stands = stands;
		}


}