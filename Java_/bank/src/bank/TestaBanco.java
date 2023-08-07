package bank;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Paulo Fonseca");
		cliente.setCpf("12345678");
		cliente.setProfissao("Engenheiro");
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		conta.setTitular(cliente);
		System.out.println(conta.getTitular().getNome());
		
		
	}
}
