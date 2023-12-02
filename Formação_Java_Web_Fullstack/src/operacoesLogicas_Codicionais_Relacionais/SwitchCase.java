package operacoesLogicas_Codicionais_Relacionais;

public class SwitchCase {
	/* Main é um método auto-executável em Java */
	public static void main(String[] args) {
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		@SuppressWarnings("unused")
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Switch Case: Operações exatas */
		int dia = 4;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;

		default:
			System.out.println(
					"Selecione um dia da semana: " + "\n 1. Domingo" + "\n 2. Segunda-feira" + "\n 3. Terça-feira"
							+ "\n 4. Quarta-feira" + "\n 5. Quinta-feira" + "\n 6. Sexta-feira" + "\n 7. Sábado");
			break;
		}
	}
}
