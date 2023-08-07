package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		int idades[] = new int[5];
		String nomes[] = new String[5];
		
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		int valor = idadeRef.intValue();
		
		System.out.println(valor);
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(idade);
	}

}
