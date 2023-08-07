package lang;

public class Inter {

	public static void main(String[] args) {
		
		Integer valor = 529;
		Integer dinheiro = 224;
		String vl = "300";
		
		// Retorna o número de bits um na representação binária de complemento de dois do valor int especificado.
		System.out.println(Integer.bitCount(valor));
		
		// Retorna o valor deste Integer como um byte após uma conversão primitiva de restrição.
		System.out.println(valor.byteValue());
		
		// Compara dois objetos Integer numericamente.
		System.out.println(valor.compareTo(dinheiro));
		
		// Compara dois valores int numericamente tratando os valores como não assinados.
		System.out.println(Integer.compareUnsigned(valor, dinheiro));
		
		// Decodifica uma String em um Integer.
		System.out.println(Integer.decode(vl));
		
		// Retorna o quociente sem sinal da divisão do primeiro argumento pelo segundo, 
		// onde cada argumento e o resultado são interpretados como um valor sem sinal.
		System.out.println(Integer.divideUnsigned(valor, dinheiro));
		
		// Retorna o valor deste Integer como um duplo após uma conversão primitiva de ampliação.
		System.out.println(dinheiro.doubleValue());
		
		// Compara este objeto com o objeto especificado.
		System.out.println(valor.equals(dinheiro));
		
		// Retorna o valor deste Integer como um float após uma conversão primitiva de alargamento.
		System.out.println(valor.floatValue());
		
		// Determina o valor inteiro da propriedade do sistema com o nome especificado.
		System.out.println(Integer.getInteger(vl));
		
		// Retorna o valor inteiro da propriedade do sistema com o nome especificado.
		System.out.println(Integer.getInteger(vl, valor));
		
		// Retorna um código hash para este inteiro.
		System.out.println(dinheiro.hashCode());
		
		// Retorna um código hash para um valor int; compatível com Integer.hashCode().
		System.out.println(Integer.hashCode(dinheiro));
		
		// Retorna um valor int com no máximo um único bit, na posição do bit de ordem mais alta 
		// ("mais à esquerda") no valor int especificado.
		System.out.println(Integer.highestOneBit(dinheiro));
		
		// Retorna o valor deste Integer como um int.
		System.out.println(dinheiro.intValue());
		
		// Retorna o valor desse inteiro como um longo após uma conversão primitiva de ampliação.
		System.out.println(dinheiro.longValue());
		
		// Retorna um valor int com no máximo um único bit, na posição do bit de ordem mais baixa 
		// ("mais à direita") no valor int especificado.
		System.out.println(Integer.lowestOneBit(dinheiro));
		
		// Retorna o maior de dois valores int como se chamando
		System.out.println(Integer.max(valor, dinheiro));
		
		// Retorna o menor de dois valores int como se chamando
		System.out.println(Integer.min(valor, dinheiro));
		
		// OU
		System.out.println(Math.max(valor, dinheiro));
		System.out.println(Math.min(valor, dinheiro));
		
		// Retorna o número de bits zero que precedem o bit um de ordem mais alta 
		// ("mais à esquerda") na representação binária de complemento de dois do valor int especificado.
		System.out.println(Integer.numberOfLeadingZeros(dinheiro));
		
		// Retorna o número de bits zero seguindo o bit de ordem mais baixa ("mais à direita") 
		// na representação binária de complemento de dois do valor int especificado.
		System.out.println(Integer.numberOfTrailingZeros(valor));
		
		// Analisa o argumento de string como um inteiro decimal com sinal.
		System.out.println(Integer.parseInt(vl));
		
		// Analisa o argumento de string como um inteiro com sinal na base especificada pelo segundo argumento.
		System.out.println(Integer.parseInt(vl, 30));
		
		// Analisa o argumento de string como um inteiro decimal sem sinal.
		System.out.println(Integer.parseUnsignedInt(vl));
		
		// Analisa o argumento de string como um inteiro sem sinal na raiz especificada pelo segundo argumento.
		System.out.println(Integer.parseInt(vl, 30));
		
		// Retorna o resto sem sinal da divisão do primeiro argumento pelo segundo, 
		// onde cada argumento e o resultado são interpretados como um valor sem sinal.
		System.out.println(Integer.remainderUnsigned(dinheiro, valor));
		
		// Retorna o valor obtido invertendo a ordem dos bits na representação 
		// binária de complemento de dois do valor int especificado.
		System.out.println(Integer.reverse(valor));
		
		// Retorna o valor obtido invertendo a ordem dos bytes na representação de complemento de dois do valor int especificado.
		System.out.println(Integer.reverseBytes(valor));
		
		// Retorna o valor obtido pela rotação da representação binária de complemento de dois do valor int especificado deixado pelo número especificado de bits.
		System.out.println(Integer.rotateRight(dinheiro, valor));
		
		// Retorna o valor deste Integer como um curto após uma conversão primitiva de restrição.
		System.out.println(valor.shortValue());
		
		// Retorna a função signum do valor int especificado.
		System.out.println(Integer.signum(dinheiro));
		
		// Adiciona dois inteiros de acordo com o operador +.
		System.out.println(Integer.sum(valor, dinheiro));
		
		// Retorna uma representação de string do argumento inteiro como um inteiro sem sinal na base 2.
		System.out.println(Integer.toBinaryString(dinheiro));
		
		// Retorna uma representação de string do argumento inteiro como um inteiro sem sinal na base 16.
		System.out.println(Integer.toHexString(valor));
		
		// Retorna uma instância Integer representando o valor int especificado.
		System.out.println(Integer.valueOf(dinheiro));
	}
}
