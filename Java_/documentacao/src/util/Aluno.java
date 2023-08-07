package util;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno>, Comparator<Aluno>{

	private long id;
	private String nome;
	private String matricula;
	private String curso;
	private int idade;
	private double mensalidade;
	private double nota;
	
	public Aluno() {
		super();
	}

	public Aluno(long id, String nome, String matricula, String curso, int idade, double mensalidade, double nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.idade = idade;
		this.mensalidade = mensalidade;
		this.nota = nota;
	}
	
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCurso() {
		return curso;
	}

	public int getIdade() {
		return idade;
	}

	public double getMensalidade() {
		return mensalidade;
	}
	
	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Id = " + id + "\nNome = " + nome + "\nIdade = " + idade + "\nCurso = " + curso + "\nMatricula = " + matricula
				+ "\nMensalidade = " + mensalidade + "\nNota = " + nota + "\n\n";
	}

	@Override
	public int compareTo(Aluno outro) {
		
		return this.nome.compareTo(outro.nome);
	}

	@Override
	public int compare(Aluno p1, Aluno p2) {
				
				if(p1.getId() < p2.getId())
					
					return -1;
				
				else if(p1.getId() > p2.getId())
					
					return 1;
				
				else
					return 0;
				
	}

	
}
