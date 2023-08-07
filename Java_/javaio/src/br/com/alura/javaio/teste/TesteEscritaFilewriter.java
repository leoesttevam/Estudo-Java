package br.com.alura.javaio.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFilewriter {

	public static void main(String[] args) throws IOException {
		
		//OutputStream fos = new FileOutputStream("lorem2.txt");
		
		//Writer ows = new OutputStreamWriter(fos);
		
		//BufferedWriter bw = new BufferedWriter(ows);
		
		FileWriter fw = new FileWriter("lorem.txt");
		
		fw.write("Bom dia!");
		fw.write(System.lineSeparator());
		fw.write("\n");
		fw.write("Boa tarde!");
		fw.write("\n");
		fw.write("Boa noite!");
		
		
		
		fw.close();
	}
}
