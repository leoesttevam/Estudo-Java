package util;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Teste {
	
	@Test
	public void deveriaSomarNumeroPositivos() {
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(3, 7);
		
		Assert.assertEquals(10, soma);
	}
	
	
}
