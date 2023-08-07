package javaPilha;

public class TesteContaExcessao {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		try {
			c.depositar();
		} catch (MinhaExcessao e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
