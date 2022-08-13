package AnimalPolimorfismo;

import AnimalPolimorfismo.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                null, "[1] - Elefante | [2] - Cachorro | [3] - Jaguar\n\nDIGITE QUAL ANIMAL DESEJA CADASTRAR: ",
                "MENU", JOptionPane.QUESTION_MESSAGE
        ));
        if(opcao != 1 && opcao != 2 && opcao != 3) {
            JOptionPane.showMessageDialog(
                    null, "OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String nome = JOptionPane.showInputDialog(
                null, "DIGITE O NOME DO ANIMAL: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
        String cor = JOptionPane.showInputDialog(
                null, "DIGITE A COR: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
        double peso = Double.parseDouble(JOptionPane.showInputDialog(
                null, "DIGITE O PESO EM KG(QUILOGRAMA): ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));

        if(opcao == 1)
            apresentaAnimal(new Elefante(nome, cor, peso));
        else if(opcao == 2)
            apresentaAnimal(new Cachorro(nome, cor, peso));
        else
            apresentaAnimal(new Jaguar(nome, cor, peso));
    }

    public static void apresentaAnimal(Animal animal){
        JOptionPane.showMessageDialog(
                null, animal, "ANIMAL", JOptionPane.INFORMATION_MESSAGE
        );
    }
}
