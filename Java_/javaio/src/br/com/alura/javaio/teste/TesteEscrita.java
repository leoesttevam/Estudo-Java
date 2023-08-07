package br.com.alura.javaio.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		
		Writer ows = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(ows);
		
		bw.write("Bom dia!");
		bw.newLine();
		bw.newLine();
		bw.write("Boa tarde!");
		bw.newLine();
		bw.newLine();
		bw.write("Boa noite!");
		
		
		
		bw.close();
	}
}
