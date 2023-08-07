package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(500);
		
		System.out.println(conta.getSaldo());
		
		conta.sacar(550);
		System.out.println(conta.getSaldo());
		
		Conta conta1 = new Conta();
		conta1.deposita(1000);
		
		conta1.transfere(-5, conta);
				
	}
}
