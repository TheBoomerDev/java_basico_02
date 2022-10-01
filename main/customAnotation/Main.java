package main.customAnotation;


public class Main { 
	
	public Integer valor = 0;
	
	@CAnot(value=20)
	public Integer getValor() {
		return this.valor;
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {

		Main main = new Main();
		
		WorkAnot worker = new WorkAnot(main);
		worker.work();
		
		System.out.println(main.getValor());

	}

}
