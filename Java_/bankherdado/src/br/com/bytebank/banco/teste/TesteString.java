package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		//int a = 3;
		//String vazio = "";
		//String nome = "Alura";
		
		//String c = nome.substring(1);
		//int c = nome.indexOf("ur");
		//char c = nome.charAt(2);
		//char c = 'A';
		//char d = 'a';
		
		//String outro = nome.replace(c, d);
		
		//System.out.println(nome.replace("A", "a"));
		//System.out.println(nome.toLowerCase());
		
		//System.out.println(vazio.isEmpty());
		//System.out.println(nome.length());
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
	}
}
