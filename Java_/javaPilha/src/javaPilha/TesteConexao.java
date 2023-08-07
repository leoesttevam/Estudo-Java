package javaPilha;

public class TesteConexao {

	public static void main(String[] args) throws Exception {
		
		try(Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (Exception e) {
			System.out.println("Erro na conexão!");
		}
		
		Conexao cnx = null;
		
		try {
			
			cnx = new Conexao();
			cnx.leDados();
			
			
		} catch (IllegalStateException e) {
			
			System.out.println("Erro na conexão!");
			
			
		} finally {
			if(cnx != null) {				
				cnx.close();
			}
		}
		
	}
}
