package douc.ope;

import douc.ope.modelo.OperacionesBasicas;

public class Laucher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OperacionesBasicas op = new OperacionesBasicas();
		
		System.out.println("suma  10 + 5: "+op.suma(10, 5));
		System.out.println("resta 10 - 5: "+op.resta(10, 5));
		System.out.println("multi 10 * 5: "+op.multiplicacion(10, 5));
		System.out.println("division 10/5 :"+op.division(10,5));

	}

}
