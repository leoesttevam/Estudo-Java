package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;

public class Mapa {

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
		
		Map<Integer, Aluno> aluno = new HashMap<>();
		
		aluno.put(1 , alunoA1);
		aluno.put(2 , alunoA2);
		aluno.put(3 , alunoA3);
		aluno.put(4 , alunoA4);
		aluno.put(5 , alunoA5);
		aluno.put(6 , alunoM1);
		aluno.put(7 , alunoM2);
		aluno.put(8 , alunoM3);
		aluno.put(9 , alunoM4);
		aluno.put(10 , alunoM5);
		
		System.out.println(aluno.size());
		
		System.out.println(aluno.isEmpty());
		
		System.out.println(aluno.keySet());
		
		System.out.println(aluno.values());
		
		System.out.println(aluno.entrySet());
		
		System.out.println(aluno.containsKey(7));
		
		System.out.println(aluno.containsValue(alunoA5));
		
		System.out.println(aluno.get(4));
		
		for(int chave : aluno.keySet()) {
			System.out.println(chave);
		}
		
		for(Aluno valor : aluno.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, Aluno> registro : aluno.entrySet()) {
			//Aluno a1 = new Aluno();
			//System.out.println(aluno.getOrDefault("a " + registro.getKey(), registro.getValue()));
			System.out.println(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
		
		
	}
}
