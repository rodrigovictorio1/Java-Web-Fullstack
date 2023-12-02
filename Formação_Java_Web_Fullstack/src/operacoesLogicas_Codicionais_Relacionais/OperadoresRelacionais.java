package operacoesLogicas_Codicionais_Relacionais;

public class OperadoresRelacionais {
	/* Main é um método auto-executável em Java */
	public static void main(String[] args) {
		int nota1 = 50;
		int nota2 = 90;
		
		if (nota1 == nota2) {
			System.out.println("As notas sao iguais.");
		} else {
			System.out.println("As notas são diferentes");
		}
		
		if (nota1 != nota2) {
			System.out.println("As notas sao diferentes.");
		} else {
			System.out.println("As notas são iguais");
		}
		
		if (nota1 > nota2) {
			System.out.println("A nota1 é maior do que a nota2.");
		} else {
			System.out.println("A nota1 é menor do que a nota2.");
		}
		
		if (nota1 < nota2) {
			System.out.println("A nota1 é menor do que a nota2.");
		} else {
			System.out.println("A nota1 é maior do que a nota2.");
		}
		
		if (nota1 >= nota2) {
			System.out.println("A nota1 é maior ou igual do que a nota2.");
		} else {
			System.out.println("A nota1 é menor ou igual do que a nota2.");
		}
		
		if (nota1 <= nota2) {
			System.out.println("A nota1 é menor ou igual do que a nota2.");
		} else {
			System.out.println("A nota1 é maior ou igual do que a nota2.");
		}
	}
}
