package pruebacodigos;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCodigosTest {

	@Test
	public void testControlMail() {
		
		String resultado=PruebaCodigos.controlMail("mario");
		String esperado="El mail introducido es correcto";
		assertEquals(null, esperado, resultado);
		
		
	}

}
