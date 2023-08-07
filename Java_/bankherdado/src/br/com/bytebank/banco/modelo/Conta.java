package br.com.bytebank.banco.modelo;

import java.io.Serializable;
import java.util.Objects;

public abstract class Conta extends Object implements Serializable ,Comparable<Conta> {

	private static final long serialVersionUID = 1L;
	protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular;
    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsulficienteException {
    	
        if(this.saldo < valor) {
        	
        	throw new SaldoInsulficienteException("Saldo " + this.saldo + ", Valor: " + valor);
            
        } else {
        	
        	this.saldo -= valor;
        }
    }

    public void transfere(double valor, Conta destino) throws SaldoInsulficienteException {
    	
        this.saca(valor);
        
        destino.deposita(valor);
        
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

	@Override
	public int hashCode() {
		return Objects.hash(agencia, numero, titular);
	}
	
	@Override
	public int compareTo(Conta o) {
		
		return Double.compare(this.saldo, o.saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return agencia == other.agencia && numero == other.numero && Objects.equals(titular, other.titular);
	}
    
    

}