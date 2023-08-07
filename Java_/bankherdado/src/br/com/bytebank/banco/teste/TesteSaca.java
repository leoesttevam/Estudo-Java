package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsulficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 320);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(220.0);
		} catch (SaldoInsulficienteException e) {
			System.out.println("Saldo insulfiente " + e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
