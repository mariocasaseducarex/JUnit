package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import mce.cuenta.*;

public class CuentaTest {

	
	@Test
	public void testRetirar() {
		
		Cuenta cuenta=new Cuenta("Mario", "12345", 2000.00, 0);
		
		try {
			cuenta.retirar(500.00);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
		
		double resultado=cuenta.estado();
		double esperado=2000.00;
		assertEquals(esperado, resultado, 0);
		
	}

}
