import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calcu = new Calculadora();
	@Test
	void testSumar() {
		
		float resultado = calcu.sumar(20f, 10f);
		assertEquals(30f, resultado);
		
		float resultado2 = calcu.sumar(-10f, 10f);
		assertEquals(0f, resultado2);
		
		float resultado3 = calcu.sumar(-10f, 5f);
		assertEquals(-5f, resultado3);
	}

	@Test
	void testRestar() {
		float resultado = calcu.restar(20f, 10f);
		assertEquals(10f, resultado);
		
		float resultado2 = calcu.restar(-10f, 10f);
		assertEquals(-20f, resultado2);
		
		float resultado3 = calcu.restar(-10f, -10f);
		assertEquals(0f, resultado3);
	}

	@Test
	void testMultiplicar() {
		float resultado = calcu.multiplicar(20f, 10f);
		assertEquals(200f, resultado);
		
		float resultado2 = calcu.multiplicar(-10f, 10f);
		assertEquals(-100f, resultado2);
		
		float resultado3 = calcu.multiplicar(20f, 0f);
		assertEquals(0f, resultado3);
	}

	@Test
	void testDividir() {
		float resultado = calcu.dividir(20f, 10f);
		assertEquals(2f, resultado);
		
		float resultado2 = calcu.dividir(-10f, 10f);
		assertEquals(-1f, resultado2);
		
		float resultado3 = calcu.dividir(0f, 10f);
		assertEquals(0f, resultado3);
	}

}
