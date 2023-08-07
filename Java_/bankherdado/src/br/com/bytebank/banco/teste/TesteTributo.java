package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalcularImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributo {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.00);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalcularImposto calc = new CalcularImposto();
		
		calc.registro(cc);
		calc.registro(sv);
		
		System.out.println(calc.getTotalImposto());
	}

}
