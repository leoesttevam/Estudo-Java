package util;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Lista {

	public static void main(String[] args) {
		
		Aluno alunoM1 = new Aluno(1, "Carlos Eduardo", "87652418", "Marketing", 25, 587.70, 8.75);
		Aluno alunoM2 = new Aluno(2, "Pedro Sampaio", "78999418", "Marketing", 20, 587.70, 7.20);
		Aluno alunoM3 = new Aluno(3, "Ana Carolina", "24501118", "Marketing", 25, 587.70, 6.0);
		Aluno alunoM4 = new Aluno(4, "Marcia Silva", "29033318", "Marketing", 26, 587.70, 4.9);
		Aluno alunoM5 = new Aluno(5, "Barbara Dias", "22220018", "Marketing", 22, 587.70, 7.0);
		
		Aluno alunoA1 = new Aluno(6, "Lucas Oliveira", "5554100", "Admnistração", 18, 701.49, 5.0);
		Aluno alunoA2 = new Aluno(7, "Amanda Silas Nascimento", "3349257", "Admnistração", 22, 870.70, 5.79);
		Aluno alunoA3 = new Aluno(8, "Carol Alencar", "9267425", "Admnistração", 22, 701.49, 4.0);
		Aluno alunoA4 = new Aluno(9, "Tais Nunes", "1204879", "Admnistração", 19, 635.78, 9.0);
		Aluno alunoA5 = new Aluno(10, "Ricardo Lopes", "2364800", "Admnistração", 26, 701.49, 8.25);
		
		Aluno alunoD1 = new Aluno(11, "leonardo Estevam", "2223450", "Desenvolvimento de Sistema", 30, 99.99, 5.0);
		Aluno alunoD2 = new Aluno(12, "Matheus Henrique", "2267985", "Desenvolvimento de Sistema", 27, 287.70, 6.50);
		Aluno alunoD3 = new Aluno(13, "Carlos Vinicius", "2207822", "Desenvolvimento de Sistema", 23, 287.70, 7.0);
		
		Aluno alunoJ1 = new Aluno(14, "Eduardo Silveira", "4001263", "Jornalismo", 25, 397.70, 9.0);
		Aluno alunoJ2 = new Aluno(15, "Carol Peixoto", "4036785", "Jornalismo", 28, 430.00, 4.0);
		Aluno alunoJ3 = new Aluno(16, "Enzo Fernandes", "4390015", "Jornalismo", 22, 397.90, 6.8);
		Aluno alunoJ4 = new Aluno(17, "Maria Oliveira", "4992228", "Jornalismo", 18, 430.00, 10);
		Aluno alunoJ5 = new Aluno(18, "Marcela Coimbra", "4553488", "Jornalismo", 18, 659.99, 5.0);
		Aluno alunoJ6 = new Aluno(19, "Carla Dias", "4673000", "Jornalismo", 23, 377.90, 5.5);
		
		List<Aluno> aluno = new ArrayList<>();
		//List<Aluno> aluno = new CopyOnWriteArrayList<>();
		//List<Aluno> aluno = new LinkedList<>();
		//List<Aluno> aluno = new Stack<>();
		//List<Aluno> aluno = new Vector<>();
		aluno.add(alunoA1);
		aluno.add(alunoA2);
		aluno.add(alunoA3);
		aluno.add(alunoA4);
		aluno.add(alunoA5);
		aluno.add(alunoD1);
		aluno.add(alunoD2);
		aluno.add(alunoD3);
		aluno.add(alunoJ1);
		aluno.add(alunoJ2);
		aluno.add(alunoJ3);
		aluno.add(alunoJ4);
		aluno.add(alunoJ5);
		aluno.add(alunoJ6);
		aluno.add(alunoM1);
		aluno.add(alunoM2);
		aluno.add(alunoM3);
		aluno.add(alunoM4);
		aluno.add(alunoM5);
		
		aluno.sort((o1, o2) -> o1.compare(o1, o2));
		
		System.out.println("Usando forEach");
		for(Aluno al : aluno) {
			System.out.println(al);
		}
		
		
		// Retorna um iterador de lista sobre os elementos dessa lista (na sequência adequada).
		//ListIterator<Aluno> al = aluno.listIterator();
		
		//while(al.hasNext()) {
			//System.out.println(al.next());
		//}
		
		// Retorna um iterador de lista sobre os elementos dessa lista (na sequência adequada), 
		// começando na posição especificada na lista.
		//ListIterator<Aluno> al = aluno.listIterator(1);
		
		//while(al.hasNext()) {
		//      System.out.println(al.next());
	    //}
		
		// Substitui cada elemento desta lista pelo resultado da aplicação do operador a esse elemento.
		//System.out.println(aluno.replaceAll(null));
		
		// Retém apenas os elementos desta lista que estão contidos na coleção especificada (operação opcional).
		//System.out.println(aluno.retainAll(aluno));
		
		// Substitui o elemento na posição especificada nesta lista pelo elemento especificado (operação opcional).
		//System.out.println(aluno.set(10, alunoJ6));
		
		// Classifica esta lista de acordo com a ordem induzida pelo especificado
		//aluno.sort(Comparator.comparing(Aluno::getId));
		
		// Cria um Spliterator sobre os elementos desta lista.
		//Spliterator<Aluno> al = aluno.spliterator();
		//al.forEachRemaining(a -> System.out.println(a.getNome()));
		
		// Retorna uma visão da parte desta lista entre o especificado fromIndex, inclusive, e toIndex, exclusivo.
		//System.out.println(aluno.subList(1, 10));
		
		// Retorna um array contendo todos os elementos desta lista na sequência correta (do primeiro ao último elemento).
		//System.out.println(aluno.toArray());
		
		
	}
}
