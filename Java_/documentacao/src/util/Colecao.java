package util;

import java.util.ArrayList;
import java.util.Collection;

public class Colecao {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Collection<String> nome = new ArrayList<>();
		
		// Garante que esta coleção contenha o elemento especificado (operação opcional).
		nome.add("Leo");
		System.out.println(nome);
		
		// Remove todos os elementos desta coleção (operação opcional).
		//nome.clear();
		
		// Retorna verdadeiro se esta coleção contiver o elemento especificado.
		System.out.println(nome.contains("L"));
		
		// Retorna verdadeiro se esta coleção contiver todos os elementos da coleção especificada.
		System.out.println(nome.containsAll(nome));
		
		// Retorna verdadeiro se esta coleção não contém elementos.
		System.out.println(nome.isEmpty());
		
		// Retorna um iterador sobre os elementos desta coleção.
		System.out.println(nome.iterator());
		
		// Retorna um Stream possivelmente paralelo com esta coleção como fonte.
		System.out.println(nome.parallelStream());
		
		// Removes a single instance of the specified element from this collection, if it is present (optional operation).
		//System.out.println(nome.remove("Leo"));
		
		// Remove todos os elementos desta coleção que também estão contidos na coleção especificada (operação opcional).
		//System.out.println(nome.removeAll(nome));
		
		// Remove todos os elementos desta coleção que atendem ao predicado fornecido.
		//System.out.println(nome.removeIf(null));
		
		// Retém apenas os elementos desta coleção que estão contidos na coleção especificada (operação opcional).
		System.out.println(nome.retainAll(nome));
		
		// Cria um Spliterator sobre os elementos desta coleção.
		System.out.println(nome.spliterator());
		
		// Retorna um Stream sequencial com esta coleção como origem.
		System.out.println(nome.stream().filter(n -> n.equals(nome)));
		
		// Retorna um array contendo todos os elementos desta coleção.
		System.out.println(nome.toArray());
		
		// Retorna um array contendo todos os elementos desta coleção; o tipo de tempo de execução da matriz retornada é o da matriz especificada.
		System.out.println(nome.toArray());
	}
}
