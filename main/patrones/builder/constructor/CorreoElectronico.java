package main.patrones.builder.constructor;

import java.util.ArrayList;
import java.util.List;

public class CorreoElectronico {
	
	private List<String> listaCC = new ArrayList<String>();
	private List<String> listaBCC = new ArrayList<String>();
	
	private boolean acuseDeRecibo = false;
	
	private String subject = "";
	
	private String body = "";
	private TipoBody tipoBody = TipoBody.TXT; // 0 - TXT | 1 - HTML | 2 - MD
	  
	protected CorreoElectronico() {}
	
	public List<String> getListaCC() {
		return listaCC;
	} 

	protected void setListaCC(List<String> listaCC) {
		this.listaCC = listaCC;
	} 

	public List<String> getListaBCC() {
		return listaBCC;
	} 

	protected void setListaBCC(List<String> listaBCC) {
		this.listaBCC = listaBCC;
	}
 
	public boolean isAcuseDeRecibo() {
		return acuseDeRecibo;
	}
 
	protected void setAcuseDeRecibo(boolean acuseDeRecibo) {
		this.acuseDeRecibo = acuseDeRecibo;
	} 
	
	public String getSubject() {
		return subject;
	} 

	protected void setSubject(String subject) {
		this.subject = subject;
	} 

	public String getBody() {
		return body;
	} 

	protected void setBody(TipoBody tipo, String body) {
		this.body = body;
		this.tipoBody = tipo;
	}
 
	public TipoBody getTipoBody() {
		return tipoBody;
	} 

	protected void setTipoBody(TipoBody tipoBody) {
		this.tipoBody = tipoBody;
	} 

	public void send() {
		System.out.println("Correo Enviado");
	}
}
