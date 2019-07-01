package douc.ope.modelo;

public class OperacionesBasicas {
	
	
	private int a;
	private int b;
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int suma(int a,int b) {
		
		if(a==0||b==0) {
	
			return 0;
		}
		return a+b;
		
	}
	
	public int resta(int a,int b) {
		
		if(b>a) {
			
		return 0;
		
		}
		
		
		return a-b;
		
	}
	
	
	public int multiplicacion(int a, int b) {
		
		if(b==0) {
			
			return 1;
		}
		
		
		return a*b;
	}
	
	
	public int division(int a, int b) {
		
		if(b==0) {
			
			return 0;
		}
		
		
		return a/b;
	}
	
	
	
	

}
