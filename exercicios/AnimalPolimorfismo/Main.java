package AnimalPolimorfismo;

import AnimalPolimorfismo.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(exibePerguntaRecebeResposta("[1] - Elefante | [2] - Cachorro | [3] - Jaguar\n\nDIGITE QUAL ANIMAL DESEJA CADASTRAR: ", "MENU"));

        if(opcao != 1 && opcao != 2 && opcao != 3) {
            exibeMensagem("OPCAO INVALIDA", "MENU", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String nome = exibePerguntaRecebeResposta("DIGITE O NOME DO ANIMAL: ", "INFORMACAO");
        String cor = exibePerguntaRecebeResposta("DIGITE A COR DO ANIMAL: ", "INFORMACAO");
        double peso = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE O PESO EM KG(QUILOGRAMA): ", "INFORMACAO"));

        if(opcao == 1)
            exibeMensagem(new Elefante(nome, cor, peso).toString(), "ANIMAL");
        else if(opcao == 2)
            exibeMensagem(new Cachorro(nome, cor, peso).toString(), "ANIMAL");
        else
            exibeMensagem(new Jaguar(nome, cor, peso).toString(), "ANIMAL");
    }

    private static String exibePerguntaRecebeResposta(String message, String title){
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
    }

    private static void exibeMensagem(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void exibeMensagem(String message, String title, int option){
        JOptionPane.showMessageDialog(null, message, title, option);
    }
}
