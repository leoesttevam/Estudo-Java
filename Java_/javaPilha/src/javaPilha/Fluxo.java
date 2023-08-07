package javaPilha;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		
		try {
			metodo1();
		} catch (Exception ex) {
			String msg = ex.getMessage();
			System.out.println("Exception " + msg);
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaExcessao {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	private static void metodo2() throws MinhaExcessao {
		System.out.println("Inicio do metodo 2");
		
		throw new MinhaExcessao("Deu errado");
		
		//System.out.println("Fim do metodo 2");
	}
}
