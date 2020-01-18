package pt.upacademy.coreFinalProject.models;

import javax.persistence.Entity;

@Entity
public class Theme extends EntityRoot {

	private static final long serialVersionUID = 1L;
	
	private String name;
	
	

	public Theme() {
	}

	public Theme(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
