package br.com.alura.javaio.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("lorem.txt");
		
		InputStreamReader irs = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(irs);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}
}
