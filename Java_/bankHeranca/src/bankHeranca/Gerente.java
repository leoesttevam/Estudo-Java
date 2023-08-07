package bankHeranca;

public class Gerente extends Funcionario implements AutenticarSenha {
	
	private AutenticaUtil util;
	
	public Gerente() {
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

	public double getBonificacao() {
		
		return super.getSalario();
	}
}
