package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteObject {

	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaCorrente(33, 22);
		//Object cliente = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		
		//println(cc);
	}

}
