package bankHeranca;

public class Cliente implements AutenticarSenha {

	private AutenticaUtil util;
	
	public Cliente() {
		this.util = new AutenticaUtil();
	}
	
	@Override
	public boolean autenticar(int senha) {
		
		return this.util.autenticar(senha);
	}

	@Override
	public void setSenha(int senha) {
		
		this.util.setSenha(senha);
	}


}
