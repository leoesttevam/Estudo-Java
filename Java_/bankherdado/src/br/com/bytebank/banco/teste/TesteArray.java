package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArray {

	public static void main(String[] args) {
		
		Conta contas[] = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 10);
		ContaCorrente cc2 = new ContaCorrente(23, 11);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		//System.out.println(cc2.getNumero());
		System.out.println(contas[1].getNumero());
	}

}
