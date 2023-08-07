package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {

	public static void main(String[] args) {
		
		Curso java = new Curso("Dominando as coleções", "Paulo");
		
		
		java.adiciona(new Aula("Trabalhando com ArrayList", 21));
	    java.adiciona(new Aula("Criando uma Aula", 20));
	    java.adiciona(new Aula("Modelando com coleções", 24));
	     
	    List<Aula> aulasImutaveis = java.getAula();
	    System.out.println(aulasImutaveis);
	    
	    List<Aula> aulas = new ArrayList<>(aulasImutaveis);
	    
	    Collections.sort(aulas);
	    System.out.println(aulas);
	    System.out.println(java.getTempoTotal());
	    
	    System.out.println(java);
	}
}
