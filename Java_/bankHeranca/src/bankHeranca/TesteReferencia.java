package bankHeranca;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Gerente gr = new Gerente();
		
		gr.setNome("Manoel");
		gr.setSalario(5000.00);
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(2500.00);
		
		Designer ds = new Designer();
		ds.setSalario(2000.00);
		
		Financeiro controle = new Financeiro();
		controle.registro(gr);
		controle.registro(ed);
		controle.registro(ds);
		
		System.out.println(controle.getSoma());
	}

}
