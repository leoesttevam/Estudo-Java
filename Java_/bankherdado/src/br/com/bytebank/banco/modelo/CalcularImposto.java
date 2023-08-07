package br.com.bytebank.banco.modelo;

public class CalcularImposto {
	
	private double totalImposto;
	
	public void registro(Tributo t) {
		
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		
		return totalImposto;
	}
}
