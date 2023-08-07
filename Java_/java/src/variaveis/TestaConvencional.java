package variaveis;

public class TestaConvencional {

	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		
		if(idade >= 18) {
			System.out.println("Você tem mais de 18 anos.");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("Você tem menos de 18 anos, mais pode entrar pois está acompanhado!");
			} else {
				System.out.println("Você tem menos de 18 anos, e não está acompanhado");
			}
		}
	}
}
