package operacoesLogicas_Codicionais_Relacionais;

public class EstruturaRepeticaoFORcomCONTINUE {
	/* Main é um método auto-executável em Java */
	public static void main(String[] args) {
		/* Estrutura de Repetição FOR c/ CONTINUE */
		for (int numero = 1; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Obaaa, encontrei o número " + numero);
				continue;
			}
			
			System.out.println("Processando laço de repetição.");
		}
	}
}
