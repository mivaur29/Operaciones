package douc.test.ope.modelo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import douc.ope.modelo.OperacionesBasicas;

public class OperacionesTest {
	
	private OperacionesBasicas ope;

	@Before
	public void setUp() throws Exception {
		
		this.ope = new OperacionesBasicas();
	}

	@After
	public void tearDown() throws Exception {
	
		System.out.println("Terminamos com las pruebas");
	
	}
	
	

	@Test
	public void test() {
		//Suma
		int resultado = this.ope.suma(10, 10);
		assertEquals(20, resultado);
		resultado = this.ope.suma(0, 10);
		assertEquals(0, resultado);
		resultado = this.ope.suma(10, 0);
		assertEquals(0, resultado);
		//Resta
		resultado = this.ope.resta(10, 5);
		assertEquals(5, resultado);
		resultado = this.ope.resta(5, 10);
		assertEquals(0, resultado);
		resultado = this.ope.resta(10, 10);
		assertEquals(0, resultado);
		//Multi
		resultado = this.ope.multiplicacion(10, 5);
		assertEquals(50, resultado);
		resultado = this.ope.multiplicacion(5, 10);
		assertEquals(50, resultado);
		resultado = this.ope.multiplicacion(10, 0);
		assertEquals(1, resultado);
		resultado = this.ope.multiplicacion(0, 10);
		assertEquals(0, resultado);
		//Div
		resultado = this.ope.division(10, 0);
		assertEquals(0, resultado);
		resultado = this.ope.division(10, 5);
		assertEquals(2, resultado);
		resultado = this.ope.division(0, 5);
		assertEquals(0, resultado);
		resultado = this.ope.division(5, 5);
		assertEquals(1, resultado);
		
		
		
	}
	
	
	

}
