package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuarda {

	public static void main(String[] args) {
		
		GuardadorDeContas guarda = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 10);
		guarda.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 11);
		guarda.adiciona(cc2);
		
		int tamanho = guarda.getQuantidadeElementos();
		System.out.println(tamanho);
		
		Conta ref = guarda.getReferencia(0);
		
		System.out.println(ref.getNumero());
	}

}
