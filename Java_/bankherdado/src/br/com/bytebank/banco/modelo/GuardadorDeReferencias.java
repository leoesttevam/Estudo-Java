package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

	private Object referencia[];
	private int posicaoLivre;
	
	public GuardadorDeReferencias() {
		
		this.referencia = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		
		this.referencia[this.posicaoLivre] = ref;
		this.posicaoLivre = 0;
	}
	
	public int getQuantidadeElemento() {
		
		 return this.posicaoLivre;
	}
	
	public Object getReferencia(int i) {
		
		return this.referencia[i];
	}
}
