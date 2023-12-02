package operacoesLogicas_Codicionais_Relacionais;

import javax.swing.JOptionPane;

public class CalculandoMedia {
	/* Main é um método auto-executável em Java */
	public static void main(String[] args) {
		String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");
		
		double doubleNota1 = Double.parseDouble(nota1);
		double doubleNota2 = Double.parseDouble(nota2);
		double doubleNota3 = Double.parseDouble(nota3);
		double doubleNota4 = Double.parseDouble(nota4);
		
		double media = (doubleNota1 + doubleNota2 + doubleNota3 + doubleNota4) / 4;
		
		/* Média para aprovação é 70 */
		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno está aprovado com média " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno está em recuperação com média " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Aluno está reprovado com média " + media);	
		}
	}
}
