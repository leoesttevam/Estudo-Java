package execicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		
		palavras.sort(comparador);
		System.out.println(palavras);
		
		System.out.println();
		
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
	}
}

class ConsumidorDeString implements Consumer<String> {
	
    public void accept(String s) {
    	
        System.out.println(s);
    }
}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.length() < s2.length())
			return -1;
		
		if(s1.length() > s2.length())
			return 1;
		
		return 0;
	}
	
}
