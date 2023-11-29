package tiposVariaveis;

public class VariavelLocalGlobal {
	
	/* Variável Global é acessível a todos e o seu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	/* Main é um método auto executável em Java */
	public static void main(String[] args) {
		
		/* Variável local por pertencer somente a este método, o valor fica somente dentro deste método */
		int maiorIdade = 18;
		System.out.println("Valor variável local = " + maiorIdade);
		metodo2();
	}
	
	public static void metodo2() {
		@SuppressWarnings("unused")
		int mediaAno = 50;
		System.out.println("Valor da variável Global = " + maiorIdadeGlobal);
	}
	
}
