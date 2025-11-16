import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Heroi {

	public static void main(String[] args) {

		String nome;
		String nivel = "";
		int xp;

		nome = JOptionPane.showInputDialog(null, "Digite o nome do heroi");
		xp = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o XP do heroi")));

		if (xp <= 1000) {
			nivel = "ferro";
		} else if (xp > 1000 && xp <= 2000) {
			nivel = "Bronze";
		} else if (xp > 2000 && xp <= 5000) {
			nivel = "prata";
		} else if (xp > 5000 && xp <= 7000) {
			nivel = "ouro";
		} else if (xp > 7000 && xp <= 8000) {
			nivel = "platina";
		} else if (xp > 8000 && xp <= 9000) {
			nivel = "Asendente";
		} else if (xp > 9000 && xp <= 10000) {
			nivel = "Imortal";
		} else if (xp > 10000) {
			nivel = "Radiante";
		}

		JOptionPane.showMessageDialog(null, "O Herói de nome " + nome + " está no nível de " + nivel);

	}

}
