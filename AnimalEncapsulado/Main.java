package AnimalEncapsulado;
import AnimalEncapsulado.Entidade.Animal;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();

		animal.setNome(JOptionPane.showInputDialog("DIGITE O NOME DO ANIMAL: "));
		animal.setEspecie(JOptionPane.showInputDialog("DIGITE A ESPÉCIE: "));
		animal.setQuantPatas(Integer.parseInt(JOptionPane.showInputDialog("DIGITE A QUANTIDADE DE PATAS: ")));
		animal.setPeso(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PESO EM KG(QUILOGRAMA): "))) ;

		animal.imprimirValoresAnimal();
	}
}