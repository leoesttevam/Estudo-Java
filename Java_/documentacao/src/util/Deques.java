package util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Deques {

	public static void main(String[] args) {
		
		Aluno teste = new Aluno();
		
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
		
		//Deque<Aluno> aluno = new LinkedList<>();
		//Deque<Aluno> aluno = new ArrayDeque<>();
		  Deque<Aluno> aluno = new ConcurrentLinkedDeque<>();
		
		// Insere o elemento especificado na fila representada por este deque 
		// (em outras palavras, no final deste deque) se for possível fazê-lo imediatamente
		// sem violar as restrições de capacidade, retornando verdadeiro em caso de sucesso
		// e lançando um IllegalStateException se não houver espaço disponível no momento .
		aluno.add(alunoA1);
		aluno.add(alunoA2);
		aluno.add(alunoA3);
		aluno.add(alunoA4);
		aluno.add(alunoA5);
		
		aluno.add(alunoM1);
		aluno.add(alunoM2);
		aluno.add(alunoM3);
		aluno.add(alunoM4);
		aluno.add(alunoM5);
		
		System.out.println(aluno);
		
		// Insere o elemento especificado na frente deste deque se for possível fazê-lo 
		// imediatamente sem violar as restrições de capacidade,
		// lançando um IllegalStateException se não houver espaço disponível no momento.
	/*	aluno.addFirst(alunoD1);
		aluno.addFirst(alunoD2);
		aluno.addFirst(alunoD3);
		
		System.out.println(aluno);
		
		// Insere o elemento especificado no final deste deque se for possível fazê-lo 
		// imediatamente sem violar as restrições de capacidade,
		// lançando um IllegalStateException se não houver espaço disponível no momento.
		aluno.addLast(alunoJ1);
		aluno.addLast(alunoJ2);
		aluno.addLast(alunoJ3);
		aluno.addLast(alunoJ4);
		aluno.addLast(alunoJ5);
		aluno.addLast(alunoJ6);
		
		System.out.println(aluno);
		
		// Retorna verdadeiro se este deque contiver o elemento especificado.
	  	System.out.println(aluno.contains(alunoJ6));
		
		// Retorna um iterador sobre os elementos neste deque em ordem sequencial reversa.
		Iterator<Aluno> al = aluno.descendingIterator();
		
		System.out.println(al.next());
		
		System.out.println();
		// Recupera, mas não remove, a cabeça da fila representada por este deque 
		// (ou seja, o primeiro elemento deste deque).
		System.out.println(aluno.element().getNome());
		
		// Recupera, mas não remove, o primeiro elemento deste deque.
		System.out.println(aluno.getFirst().getNome());
		
		// Recupera, mas não remove, o último elemento deste deque.
		System.out.println(aluno.getLast().getNome());
		
		// Insere o elemento especificado na fila representada por este deque 
		// (ou seja, no final deste deque) se for possível fazê-lo imediatamente 
		// sem violar as restrições de capacidade, retornando true em caso de sucesso 
		// e false se não houver espaço disponível no momento.
		System.out.println(aluno.offer(teste));
		
		// Insere o elemento especificado na frente deste deque, 
		// a menos que viole as restrições de capacidade.
		System.out.println(aluno.offerFirst(teste));
		
		// Insere o elemento especificado no final deste deque, 
		// a menos que viole as restrições de capacidade.
		System.out.println(aluno.offerLast(alunoA5));
		
		// Recupera, mas não remove, a cabeça da fila representada por este deque 
		// (ou seja, o primeiro elemento deste deque), 
		// ou retorna nulo se este deque estiver vazio.
		System.out.println(aluno.peek());
		
		// Recupera, mas não remove, o primeiro elemento deste deque, 
		// ou retorna nulo se este deque estiver vazio.
		System.out.println(aluno.peekFirst());
		
		// Recupera, mas não remove, o último elemento deste deque, 
		// ou retorna null se este deque estiver vazio.
		System.out.println(aluno.peekLast());
		
		// Recupera e remove a cabeça da fila representada por este deque 
		// (ou seja, o primeiro elemento deste deque), ou retorna nulo se este deque estiver vazio.
		System.out.println(aluno.poll());
		
		// Recupera e remove o primeiro elemento deste deque ou retorna null se este deque estiver vazio.
		System.out.println(aluno.pollFirst());
		
		// Recupera e remove o ultimo elemento deste deque ou retorna null se este deque estiver vazio.
		System.out.println(aluno.pollLast());
		
		// Retira um elemento da pilha representada por este deque.
		System.out.println(aluno.pop());
		
		// Empurra um elemento para a pilha representada por este deque 
		// (em outras palavras, no início deste deque) se for possível fazê-lo 
		// imediatamente sem violar as restrições de capacidade, 
		// lançando um IllegalStateException se não houver espaço disponível no momento.
		System.out.println(aluno);
		
		// Recupera e remove a cabeça da fila representada por este deque (ou seja, o primeiro elemento deste deque).
		System.out.println(aluno.remove(teste));
		
		// Recupera e remove o primeiro elemento deste deque.
		System.out.println(aluno.removeFirst());
		
		// Remove a primeira ocorrência do elemento especificado deste deque.
		System.out.println(aluno.removeFirstOccurrence(alunoJ6));
		
		// Recupera e remove o último elemento deste deque.
		System.out.println(aluno.removeLast());
		
		// Remove a última ocorrência do elemento especificado deste deque.
		System.out.println(aluno.removeLastOccurrence(alunoJ4));
		
		//  Retorna o número de elementos neste deque.
		System.out.println(aluno.size()); */
	}
}
