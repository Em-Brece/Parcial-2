// Eclipse no me dejo agregar la libreria jUnit al proyecto.

package src.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import src.Logica.Parcial;

public class ParcialTest {

	private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
		
	}

	@Test
	public void testPotencia() throws Exception {
		assertEquals(8, parcial.potencia(2, 3));
	}

	@Test
	public void testExceptionPotencia() {
		assertThrows(Exception.class, () -> parcial.potencia(100000, 10));
	}
}