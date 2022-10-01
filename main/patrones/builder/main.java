package main.patrones.builder;

import main.patrones.builder.constructor.CorreoElectronico;
import main.patrones.builder.constructor.EmailBuilder;
import main.patrones.builder.constructor.TipoBody;

public class main {
	
	public static void main(String[] args) {
		
		EmailBuilder builder = new EmailBuilder();
		
		// NO puedo hacer una instancia de ese objeto
		// CorreoElectronico correo = new CorreoElectronico();
		
		builder.setBody(TipoBody.MD, "Hola, Mundo")
		.setAcuse(true)
		.setSubject("Hola, Correito");
		
		builder.addBCC("test@test.test");
		
		builder.addCC("test01@test.test").addCC("user@user.com");
		
		CorreoElectronico email = builder.build();
		email.send();
		
	}

	
	
}
