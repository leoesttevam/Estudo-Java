package br.com.alura.javaio.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {
		
		//OutputStream fos = new FileOutputStream("lorem2.txt");
		
		//Writer ows = new OutputStreamWriter(fos);
		
		//BufferedWriter bw = new BufferedWriter(ows);
		
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		ps.println("Olá");
		ps.println();
		ps.println("Bom dia!");
		
		
		
		ps.close();
	}
}
