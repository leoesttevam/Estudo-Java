package bankHeranca;

public class Administrador extends Funcionario implements AutenticarSenha {
	
	private AutenticaUtil util;
	
	public Administrador() {
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
	
	@Override
	public double getBonificacao() {
		
		return 50;
	}
	
}
