package main.patrones.dao.datasource;

import java.util.ArrayList;
import java.util.List; 

public class DataSourceCurso {
	
private DataSourceCurso() {}
	
	private static DataSourceCurso instance =  new DataSourceCurso();
	public static DataSourceCurso getInstance() { 		
		return instance;
	}

	private List<StudentDTO> alumnos = new ArrayList<StudentDTO>();
	
	public void add(StudentDTO student) {
		this.alumnos.add(student);
	}
	
	public List<StudentDTO> get(){
		return this.alumnos;
	}
	
}
