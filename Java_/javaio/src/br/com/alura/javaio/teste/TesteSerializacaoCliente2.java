package br.com.alura.javaio.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) oi.readObject();
		oi.close();
		System.out.println(cliente.getCpf());
	}
}
