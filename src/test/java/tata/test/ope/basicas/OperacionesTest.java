package tata.test.ope.basicas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tata.ope.basicas.Operaciones;

public class OperacionesTest {
	private Operaciones ope;
	@Before
	public void setUp() throws Exception {
		this.ope = new Operaciones();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("TERMINAMOS CON LAS PRUEBAS");
	}

	@Test
	public void test() {
//		int resultado = this.ope.sumar(10, 10);
//		assertEquals(20, resultado);
//		int resultado2 = this.ope.sumar(0, 10);
//		assertEquals(0, resultado2);
//		resultado = this.ope.sumar(10, 0);
//		assertEquals(0, resultado);
//		int resultado = this.ope.restar(10, 15);
//		assertEquals(0, resultado);
		
//		int resultado = this.ope.multiplicar(10, 0);
//		assertEquals(1, resultado);
		
		int resultado = this.ope.division(10, 0);
		assertEquals(0, resultado);
	}

}
