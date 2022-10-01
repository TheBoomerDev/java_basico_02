package main.patrones.dao;

import main.patrones.dao.datasource.DataSourceCurso;
import main.patrones.dao.datasource.Student;

public class Main {

	public static void main(String[] args) {

		DataSourceCurso curso = DataSourceCurso.getInstance();
		
		Student student = new Student();
		student.setId(1);
		student.setName("Jorge");
		
		curso.add(student.toDTO());
		

	}

}
