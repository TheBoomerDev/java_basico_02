package main.customAnotation;

import java.lang.reflect.Method;

public class WorkAnot {
	
	private Main obj;

	public WorkAnot(Main obj) {
		this.obj = obj;
	}

	public void work() throws NoSuchMethodException, SecurityException {
		
		Method method=obj.getClass().getMethod("getValor");
		CAnot manno= method.getAnnotation(CAnot.class);  
		
		System.out.println(manno.value());
	}
	
}
