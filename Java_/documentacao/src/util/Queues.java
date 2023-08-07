package util;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Queues {

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
		
		Queue<Aluno> aluno = new LinkedList<>();
		//Queue<Aluno> aluno = new ConcurrentLinkedQueue<>();
		//Queue<Aluno> aluno = new ConcurrentLinkedQueue<Aluno>();
		
		
		// Insere o elemento especificado nesta fila se for possível fazê-lo 
		// imediatamente sem violar as restrições de capacidade.
		aluno.offer(alunoA1);
		aluno.offer(alunoA2);
		aluno.offer(alunoA3);
		aluno.offer(alunoA4);
		aluno.offer(alunoA5);
		
		aluno.add(alunoM1);
		aluno.add(alunoM2);
		aluno.add(alunoM3);
		aluno.add(alunoM4);
		aluno.add(alunoM5);
		
		// Recupera, mas não remove, o cabeçalho desta fila ou retorna nulo se esta fila estiver vazia.
		System.out.println(aluno.peek());
		
		// Recupera e remove o início desta fila, e lança uma exception na fila vazia.
		System.out.println(aluno.element());
		
		// Recupera e remove o início desta fila ou retorna nulo se esta fila estiver vazia.
		System.out.println(aluno.poll());
		System.out.println(aluno.poll());
		System.out.println(aluno.poll());
		System.out.println(aluno.poll());
		
	}
}
