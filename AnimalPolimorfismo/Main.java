package AnimalPolimorfismo;

import AnimalPolimorfismo.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - Elefante | [2] - Cachorro | [3] - Jaguar\n\nDIGITE QUAL ANIMAL DESEJA CADASTRAR: "));
        if(opcao != 1 && opcao != 2 && opcao != 3) System.exit(0);

        String nome = JOptionPane.showInputDialog("DIGITE O NOME: ");
        String cor = JOptionPane.showInputDialog("DIGITE A COR: ");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PESO: "));

        if(opcao == 1) apresentaAnimal(new Elefante(nome, cor, peso));
        else if(opcao == 2) apresentaAnimal(new Cachorro(nome, cor, peso));
        else apresentaAnimal(new Jaguar(nome, cor, peso));
    }

    public static void apresentaAnimal(Animal animal){
        JOptionPane.showMessageDialog(null, animal);
    }
}
