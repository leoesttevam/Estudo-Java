package br.com.alura.javaio.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
        while(scanner.hasNextLine()) {
        	
              String linha = scanner.nextLine();
//            System.out.println(linha);

              Scanner linhaScanner = new Scanner(linha);
              linhaScanner.useLocale(Locale.US);
              linhaScanner.useDelimiter(",");

              String valor1 = linhaScanner.next();
              int valor2 = linhaScanner.nextInt();
              int valor3 = linhaScanner.nextInt();
              String valor4 = linhaScanner.next();
              double valor5 = linhaScanner.nextDouble();

              String valorFormatado = String.format(new Locale("pt","BR") , "%s - %04d-%08d %s - %08.2f", valor1, valor2, valor3, valor4, valor5);
              System.out.println(valorFormatado);

              linhaScanner.close();
			//String[] valores = linha.split(",");
			//System.out.println(Arrays.toString(valores));
		}
		
		//System.out.println(linha);
		
		scanner.close();
	}
}
