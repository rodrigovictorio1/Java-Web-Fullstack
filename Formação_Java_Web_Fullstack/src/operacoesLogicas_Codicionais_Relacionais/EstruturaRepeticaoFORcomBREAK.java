package operacoesLogicas_Codicionais_Relacionais;

public class EstruturaRepeticaoFORcomBREAK {
	/* Main é um método auto-executável em Java */
	public static void main(String[] args) {
		/* Estrutura de Repetição FOR c/ BREAK*/
		for (int numero = 1; numero <= 10; numero++) {
			if (numero == 8) {
				System.out.println("Obaaa, encontrei o número 8! "
						+ "\nEstou parando de executar...");
				break;
			}
		}
	}
}
