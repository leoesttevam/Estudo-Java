package br.com.bytebank.banco.teste.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSeriarizacao {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("23413131");
        
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);
		
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		os.writeObject(cliente);
		os.close();
	}

}
