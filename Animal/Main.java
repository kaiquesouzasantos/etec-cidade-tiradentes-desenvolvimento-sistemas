package Animal;
import Animal.Entidade.Animal;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();

		animal.nome = JOptionPane.showInputDialog("DIGITE O NOME DO ANIMAL: ");
		animal.especie = JOptionPane.showInputDialog("DIGITE A ESPÉCIE: ");
		animal.quantPatas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE PATAS: "));
		animal.peso = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PESO EM KG(QUILOGRAMA): "));

		animal.imprimirValoresAnimal();
	}
}