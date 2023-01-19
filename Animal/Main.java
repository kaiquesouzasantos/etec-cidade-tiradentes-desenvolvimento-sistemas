package Animal;
import Animal.Entidade.Animal;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();

		animal.nome = exibePerguntaRecebeResposta("DIGITE O NOME DO ANIMAL: ", "INFORMACAO");
		animal.especie = exibePerguntaRecebeResposta("DIGITE O ESPECIE DO ANIMAL: ", "INFORMACAO");
		animal.quantPatas = Integer.parseInt(exibePerguntaRecebeResposta("DIGITE A QUANTIDADE DE PATAS DO ANIMAL: ", "INFORMACAO"));
		animal.peso = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE O PESO EM KG(QUILOGRAMA): ", "INFORMACAO"));

		JOptionPane.showMessageDialog(
				null, animal, "ANIMAL", JOptionPane.INFORMATION_MESSAGE
		);
	}

	private static String exibePerguntaRecebeResposta(String message, String title){
		return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
	}
}
