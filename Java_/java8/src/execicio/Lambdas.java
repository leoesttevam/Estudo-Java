package execicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		palavras.sort((s1, s2) -> {
			
		        if (s1.length() < s2.length())
		            return -1;
		        if (s1.length() > s2.length())
		            return 1;
		        return 0;
		});
		
		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s1.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		System.out.println(palavras);
		
		
		palavras.forEach((String s) -> System.out.println(s));
		
	}
}
