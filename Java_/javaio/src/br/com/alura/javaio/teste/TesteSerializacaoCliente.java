package br.com.alura.javaio.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("23413131");
		
		//String nome = "Nico Steppat";
		
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		os.writeObject(cliente);
		os.close();
		
	}
}
