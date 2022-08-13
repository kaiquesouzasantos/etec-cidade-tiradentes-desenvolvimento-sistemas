package Animal;
import Animal.Entidade.Animal;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();

		animal.nome = JOptionPane.showInputDialog(
				null, "DIGITE O NOME DO ANIMAL: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
		animal.especie = JOptionPane.showInputDialog(
				null, "DIGITE A ESPÉCIE: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
		animal.quantPatas = Integer.parseInt(JOptionPane.showInputDialog(
				null, "DIGITE A QUANTIDADE DE PATAS: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));
		animal.peso = Double.parseDouble(JOptionPane.showInputDialog(
				null, "DIGITE O PESO EM KG(QUILOGRAMA): ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));

		JOptionPane.showMessageDialog(
				null, animal, "ANIMAL", JOptionPane.INFORMATION_MESSAGE
		);
	}
}