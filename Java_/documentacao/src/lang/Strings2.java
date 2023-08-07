package lang;

public class Strings2 {

	public static void main(String[] args) {
		             // 0    1    2    3    4    5    6    7    8    9   10   11   12   13   14   15   16   17   18   19   20   21   22   23   24   25
		char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'z', 'w', 'y'};
		
		String nome = "luis";
		String sob = "luis";
		String str = new String(data);
		
		// Retorna o valor char no índice especificado.
		System.out.println(str.charAt(0));
		
		// Retorna o caractere (ponto de código Unicode) no índice especificado.
		System.out.println(str.codePointAt(0));
		
		// Retorna o caractere (ponto de código Unicode) antes do índice especificado.
		System.out.println(str.codePointBefore(1));
		
		// Compara duas strings lexicograficamente.
		System.out.println(sob.compareTo(nome));
		
		// Compara duas strings lexicograficamente, ignorando as diferenças entre maiúsculas e minúsculas.
		System.out.println(sob.compareToIgnoreCase(nome));
		
		// Concatena a string especificada ao final desta string.
		System.out.println(sob.concat(" " + str));
		
		// Retorna true se e somente se esta string contiver a sequência especificada de valores char.
		System.out.println(sob.contains(nome));
		
		// Compara esta string com a CharSequence especificada.
		System.out.println(nome.contentEquals(sob));
		
		// Testa se esta string termina com o sufixo especificado.
		System.out.println(nome.endsWith(str));
		
		//Codifica esta String em uma sequência de bytes usando o conjunto de caracteres padrão da plataforma, armazenando o resultado em uma nova matriz de bytes.
		System.out.println(nome.getBytes());
		
		// Retorna um código hash para esta string.
		System.out.println(nome.hashCode());
	}
}
