package bank;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public Conta() {
		
	}

	public Conta(int agencia, int numero) {
		Conta.total++; 
		
		System.out.println("Total de contas " + total);
		this.agencia = agencia;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		
		if(numero <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			
			return;
		}
		
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			
			return;
		}
		
		this.agencia = agencia;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public void deposita(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			
			if(valor > 0) {
				
				this.saldo -= valor;
				destino.deposita(valor);
				
				System.out.println("Transferencia realizada com sucesso!");
				
			} else {
				
				System.out.println("Valor não permitido");
			}
			
			return true;
			
		} else if(valor > this.saldo) {
			
			System.out.println("Saldo insulficiente");
			
			return false;
			
		} else {
			
			return false;
		}
	}

	public static int getTotal(){
	    return Conta.total;
	}
}
