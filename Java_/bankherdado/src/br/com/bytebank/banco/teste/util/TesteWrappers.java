package br.com.bytebank.banco.teste.util;

public class TesteWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());
		
		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
	}
}
