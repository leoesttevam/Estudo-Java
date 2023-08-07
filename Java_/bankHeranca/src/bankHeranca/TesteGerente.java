package bankHeranca;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gr = new Gerente();
		
		gr.setNome("Leonardo Estevam");
		gr.setCpf("42256897425");
		gr.setSalario(5320.85);
		
		System.out.println(gr.getNome());
		System.out.println(gr.getCpf());
		System.out.println(gr.getSalario());
		
		gr.setSenha(110913);
		boolean autentica = gr.autenticar(110913);
		
		System.out.println(autentica);
		
		System.out.println(gr.getBonificacao());
	}
}
