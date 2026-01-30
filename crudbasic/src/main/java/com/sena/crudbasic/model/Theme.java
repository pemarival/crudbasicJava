package com.sena.crudbasic.model;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="theme")
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_theme")
    private int id;

    @Column(name="type", length = 50)
    private String type;

    @OneToMany(mappedBy = "theme") //muchos pabellones tienen una sola tematica
    private List<Pavilion> pavilions;

    		public Theme(int id, String type, List<Pavilion> paivilions) {
			super();
			this.id = id;
			this.type = type;
			this.pavilions = paivilions;
		}
		
		public Theme() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<Pavilion> getPavilions() {
			return pavilions;
		}

		public void setStudents(List<Pavilion> pavilions) {
			this.pavilions = pavilions;
		}
}