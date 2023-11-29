package tiposVariaveis;

public class CancatenandoVariaveis {
	/* Main é um método auto-executável em Java */
	public static void main(String[] args) {

		/* Concatenacao */
		String nome = "Rodrigo Victório";
		String cpf = "123.456.789.88";
		String telefone = "21 91234-5678";
		String endereco = "Rio de Janeiro - RJ";
		int idade = 35;
		
		String saida = "Meu nome: " + nome
				+ "\nIdade: " + idade
				+ "\nCPF: " + cpf
				+ "\nContato: " + telefone
				+ "\nEndereço: " + endereco;
		
		System.out.println(saida);

	}
}
