package main.patrones.callback;

import java.util.Timer;
import java.util.TimerTask;

public class Tardis {
	
	private Respuesta listener;
	private int amount = 0;

	public Tardis(Respuesta listener) {
		this.listener = listener;
	}
	
	
	public void eventoClick() {
		
		Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               listener.clickado(true);
            }
        }, 3000, 10000);
		
	}
	
	public void getError() {
		
		Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               listener.error("Mensaje de Error");
            }
        }, 2500, 4000);
		
	}
	
	public void eventoContador() {
		
		Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
               amount = amount + listener.contador( amount );
               System.out.println("Amount: "+amount);
            }
        }, 0, 3000);
		
	}
	

}
