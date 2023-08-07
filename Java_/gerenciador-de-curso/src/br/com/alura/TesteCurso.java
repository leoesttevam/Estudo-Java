package br.com.alura;

import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		
		Curso java = new Curso("Dominando as coleções", "Paulo");
		List<Aula> aulas = java.getAula();
		
		System.out.println(aulas);
		
		 java.adiciona(new Aula("Trabalhando com ArrayList", 21));
	     java.adiciona(new Aula("Criando uma Aula", 20));
	     java.adiciona(new Aula("Modelando com coleções", 24));
	     
	     System.out.println(java.getAula());
	}
}
