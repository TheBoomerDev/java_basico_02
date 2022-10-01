package main.patrones.dao.datasource;

import java.util.Date;

public class Student {
	
	private int id = 0;
	private String name = "";
	private Date created = new Date();
	
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
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	} 
	
	public StudentDTO toDTO() { 
		return new StudentDTO(this);
	}
	
	
	public static Student fromDTO(StudentDTO obj) {
		return new Student();
	}

}
