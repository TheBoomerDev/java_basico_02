package main.hilosSegundoPlano;

public class ViajeTemporal implements Runnable  {
	
	 private Thread t;
	private String label = "";
	private int segundos = 0;
	private Respuesta listener;
	
	public ViajeTemporal(String label, int segundos, Respuesta callback) {
		this.segundos = segundos;
		this.label = label;
		this.listener = callback;
	}
	
	private void sleep() {
		int segundosToWait = this.segundos * 1000;
		 try{  
             Thread.sleep(segundosToWait);  
         }catch(InterruptedException e){
        	 System.out.println(e);
         }    
	}
	
	public void start() {
		 if (t == null) {
	         t = new Thread (this, this.label);
	         t.start ();
	      }
	}
	
	@Override
	public void run() { 
		
		String format = "%s->%s";
		String msg = String.format(format, this.label, this.segundos);
		
		for (int i = 0; i < 10; i++) {
			this.sleep();
			System.out.println(msg+":"+i);
			if (this.listener != null) {
				this.listener.contador(i);
			}
		} 
		
		if(this.listener != null) {
			this.listener.heTerminado(this.label);
		}
		
	}

}
