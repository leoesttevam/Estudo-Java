package bankHeranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente adm = new Gerente();
		
		adm.setNome("Ana Francisca");
		adm.setCpf("44425314788");
		adm.setSalario(2590.80);
		
		System.out.println(adm.getNome());
		System.out.println(adm.getBonificacao());
		
	}

}
