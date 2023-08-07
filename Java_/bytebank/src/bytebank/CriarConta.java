package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
		primeiraConta.deposita(200);
		
		System.out.println(primeiraConta.getSaldo());
		
		//primeiraConta.getSaldo() += 100;
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta SegundaConta = new Conta();
		SegundaConta.deposita(50);
		
		System.out.println("Saldo da primeira conta " + primeiraConta.getSaldo());
		System.out.println("Saldo da segunda conta " + SegundaConta.getSaldo());
	}
}
