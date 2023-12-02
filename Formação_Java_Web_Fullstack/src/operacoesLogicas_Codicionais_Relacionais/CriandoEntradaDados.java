package operacoesLogicas_Codicionais_Relacionais;

import javax.swing.JOptionPane;

public class CriandoEntradaDados {
	/* Main é um método auto-executável em Java */
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		JOptionPane.showMessageDialog(null, "Divisão para " + pessoas + " pessoas deu " + divisao + " carros e sobrou " + resto + " carros.");
		
		//System.out.println("Divisão para " + pessoas + " pessoas deu " + divisao + " carros e sobrou " + resto + " carros.");
	}
}
