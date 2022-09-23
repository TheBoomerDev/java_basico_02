package main.patrones.dao.datasource;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDTO {
	
	private int id = 0;
	private String name = "";
	private String created = "";
	 

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



	public String getCreated() {
		return created;
	}



	public void setCreated(String created) {
		this.created = created;
	}



	protected StudentDTO(Student student) {
		
		this.id = student.getId();
		this.name = student.getName();
		
		Date date = student.getCreated();
		
		SimpleDateFormat spf = new SimpleDateFormat("YYYYMMddHHmmss");
		this.created = spf.format(date);
		
	}
	
}
