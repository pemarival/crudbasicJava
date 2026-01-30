package com.sena.crudbasic.model;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="typevisitor")
public class Typevisitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_typevisitor")
    private int id;

    @Column(name="entrance", length = 50)
    private String entrance;

    @OneToMany(mappedBy = "typevisitor")//muchos visitantes puden tener solo una entrada
    private List<Visitor> visitors;

    		public Typevisitor(int id, String entrance, List<Visitor> visitors) {
			super();
			this.id = id;
			this.entrance = entrance;
			this.visitors = visitors;
		}
		
		public Typevisitor() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEntrance() {
			return entrance;
		}

		public void setEntrance(String entrance) {
			this.entrance = entrance;
		}

		public List<Visitor> getVisitors() {
			return visitors;
		}

		public void setVisitors(List<Visitor> visitors) {
			this.visitors = visitors;
		}
}