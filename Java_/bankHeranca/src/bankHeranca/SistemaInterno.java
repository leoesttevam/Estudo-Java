package bankHeranca;

public class SistemaInterno {

	private int senha = 2222;
	
	public void autentica(AutenticarSenha fa) {
		
		boolean autentic = fa.autenticar(this.senha);
		
		if(autentic) {
			System.out.println("Pode entra no sistema!");
		} else {
			System.out.println("Não pode entra no sistema!");
		}
		
	}
}
