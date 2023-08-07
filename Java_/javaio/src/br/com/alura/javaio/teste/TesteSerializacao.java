package br.com.alura.javaio.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//String nome = "Nico Steppat";
		
		//ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		//os.writeObject(nome);
		//os.close();
		
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nome = (String) oi.readObject();
		oi.close();
		System.out.println(nome);
	}
}
