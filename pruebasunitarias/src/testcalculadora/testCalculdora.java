package testcalculadora;
import ejemplo.Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculdora {

	@Test
	public void testSuma() {
		
		int resultado=Calculadora.suma(5,2);
		int esperado=7;
		assertEquals(esperado,resultado);
	}
	
	@Test
	public void testFactorial() {
		
		int resultado=Calculadora.factorial(4);
		int esperado=24;
		assertEquals(esperado,resultado);
	}

}
