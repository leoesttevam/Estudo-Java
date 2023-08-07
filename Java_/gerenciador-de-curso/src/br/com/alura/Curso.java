package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public String getInstrutor() {
		
		return instrutor;
	}
	
	public List<Aula> getAula() {
		
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		
        this.aulas.add(aula);
    }
	
	public Set<Aluno> getAlunos() {
		
		return Collections.unmodifiableSet(alunos);
	}
	
	public int getTempoTotal() {
		
		 return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }

	public void matricula(Aluno aluno) {
		
		this.alunos.add(aluno);
		 this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno aluno) {
		
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatriculado(int numero) {
	   
		return matriculaParaAluno.get(numero);
	}
}
