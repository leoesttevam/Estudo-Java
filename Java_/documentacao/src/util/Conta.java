package util;

public class Conta {

	private double saldo;
	
	int agencia;
	int numero;
	String titular;
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
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
}
