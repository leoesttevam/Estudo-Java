package lang;

public class Doubles {

	public static void main(String[] args) {
	
		Double salario = 2235.89;
		Double decimo = 2235.89;
		int mesada = 350;
		String conta = "327.89";
		
		// Retorna o valor deste Double como um byte após uma conversão primitiva de restrição.
		System.out.println(salario.byteValue());
		
		// Compara os dois valores duplos especificados.
		System.out.println(Double.compare(decimo, salario));
		
		// Compara dois objetos Double numericamente.
		System.out.println(salario.compareTo(decimo));
		
		// Retorna uma representação do valor de ponto flutuante especificado de acordo com o layout de bit de "formato duplo" de ponto flutuante IEEE 754.
		System.out.println(Double.doubleToLongBits(decimo));
		
		// Retorna uma representação do valor de ponto flutuante especificado de acordo com o layout de bit de "formato duplo" de ponto flutuante IEEE 754, preservando valores não numéricos (NaN).
		System.out.println(Double.doubleToRawLongBits(salario));
		
		// Retorna o valor double deste objeto Double.
		System.out.println(salario.doubleValue());
		
		// Compara este objeto com o objeto especificado.
		System.out.println(salario.equals(decimo));
		
		// Retorna o valor deste Double como um float após uma conversão primitiva de estreitamento.
		System.out.println(salario.floatValue());
		
		// Retorna um código hash para este objeto Double.
		System.out.println(decimo.hashCode());
		
		// Retorna o valor deste Double como um int após uma conversão primitiva de restrição.
		System.out.println(salario.intValue());
		
		// Retorna true se o argumento for um valor de ponto flutuante finito; retorna falso caso contrário (para argumentos NaN e infinito).
		System.out.println(Double.isFinite(decimo.intValue()));
		
		// Retorna true se este valor Double for infinitamente grande em magnitude, false caso contrário.
		System.out.println(Double.isInfinite(salario));
		
		// Retorna true se este valor Double for um Not-a-Number (NaN), false caso contrário.
		System.out.println(Double.isNaN(mesada));
		
		// Retorna o valor duplo correspondente a uma determinada representação de bit.
		System.out.println(Double.longBitsToDouble(mesada));
		
		// Retorna o valor deste Double como um long após uma conversão primitiva de estreitamento.
		System.out.println(salario.longValue());
		
		// Retorna um novo double inicializado com o valor representado pela String especificada, conforme realizado pelo método valueOf da classe Double.
		System.out.println(Double.parseDouble(conta));
		
		// Retorna o valor deste Double como um curto após uma conversão primitiva de restrição.
		System.out.println(salario.shortValue());
		
		// Adiciona dois valores duplos de acordo com o operador +
		System.out.println(Double.sum(salario, decimo));
		
		// Retorna uma representação de string hexadecimal do argumento duplo.
		System.out.println(Double.toHexString(salario));
		
		// Retorna uma representação de string deste objeto Double.
		System.out.println(Double.toString(decimo));
		
		// Retorna uma instância Double representando o valor double especificado.
		System.out.println(Double.valueOf(decimo));
		
		// Retorna um objeto Double contendo o valor double representado pela string de argumento s.
		System.out.println(Double.valueOf(conta));
	}

}
