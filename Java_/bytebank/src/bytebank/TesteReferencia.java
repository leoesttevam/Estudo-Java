package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.deposita(300);
		System.out.println("Saldo da primeira conta: " + primeiraConta.getSaldo());
	}
}
