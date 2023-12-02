package operacoesLogicas_Codicionais_Relacionais;

public class OperacoesLogicasComIfElse1 {
	/* Main é um método auto-executável em Java */
	public static void main(String[] args) {
		int mediaAluno = 89;
		String nome = "Rodrigo";
		
		if (mediaAluno >= 70 && nome.equals("Rodrig")) {
			System.out.println("Você está aprovado, parabéns!");
		} else if (mediaAluno < 70) {
			System.out.println("Você está reprovado.");
		} else {
			System.out.println("Aluno não encontrado.");
		}
	}
}
