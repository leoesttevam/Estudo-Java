package br.com.alura;

public class TestaCursoAluno {

	public static void main(String[] args) {
		
		Curso java = new Curso("Dominando as coleções", "Paulo Silveira");
		
		java.adiciona(new Aula("Trabalhando com ArrayList", 21));
	    java.adiciona(new Aula("Criando uma Aula", 20));
	    java.adiciona(new Aula("Modelando com coleções", 24));
	    
	    Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        
        java.matricula(a1);
        java.matricula(a2);
        java.matricula(a3);
        
        System.out.println("Todos alunos matriculados: " );
        java.getAlunos().forEach(a -> {
        	System.out.println(a);
        });
        
        System.out.println();
        System.out.println(java.estaMatriculado(a1));
        
        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        //System.out.println("E esse Turini, está matriculado?");
        System.out.println(java.estaMatriculado(turini));
        
        
	}
}
