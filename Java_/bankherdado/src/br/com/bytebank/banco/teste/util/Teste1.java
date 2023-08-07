package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste1 {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(22, 10);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 11);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
		
		for(int i = 0; i < lista.size(); i++) {
			
			System.out.println(lista.get(i));
		}
		
		for(Object list : lista) {
			System.out.println(list);
		}
		
		lista.remove(0);
		
		System.out.println(lista.size());
	}

}
