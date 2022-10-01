package main.patrones.builder.constructor;

import java.util.List;

public class EmailBuilder {

	private CorreoElectronico email = new CorreoElectronico();
	
	public EmailBuilder() {}
	
	public EmailBuilder setBody (TipoBody tipo, String body) {
		this.email.setBody(tipo, body);
		
		return this;
	}
	
	public EmailBuilder setSubject(String subject) {
		this.email.setSubject(subject);
		return this;
	}
	
	public EmailBuilder setAcuse(boolean recibirAcuse) {
		this.email.setAcuseDeRecibo(recibirAcuse);
		return this;
	}
	
	public EmailBuilder setListaCC(List<String> emails) {
		this.email.setListaCC(emails);
		return this;
	} 
	 
	public EmailBuilder addCC(String email) {
		List<String> emails = this.email.getListaCC();
		emails.add(email);
		this.email.setListaCC(emails);
		
		return this;
	}
	
	public EmailBuilder addBCC(String email) {
		List<String> emails = this.email.getListaBCC();
		emails.add(email);
		this.email.setListaBCC(emails);
		
		return this;
	}
	
	public CorreoElectronico build() {
		return this.email;
	}
}
