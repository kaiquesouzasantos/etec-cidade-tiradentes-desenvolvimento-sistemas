package ClienteHeranca;
import ClienteHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(exibePerguntaRecebeMensagem("[1] - CLIENTE\n[2] - CLIENTE PREMIUM\n\nDIGITE O TIPO DE CLIENTE: ", "Menu"));

        if(opcao != 1 && opcao != 2) {
            exibeMensagem("OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String nome = exibePerguntaRecebeMensagem("DIGITE SEU NOME: ", "INFORMACAO");
        String endereco = exibePerguntaRecebeMensagem("DIGITE SEU ENDERECO: ", "INFORMACAO");
        int idade = Integer.parseInt(exibePerguntaRecebeMensagem("DIGITE SUA IDADE: ", "INFORMACAO"));
        double valorPedido = Double.parseDouble(exibePerguntaRecebeMensagem("VALOR DOS PEDIDOS: R$", "INFORMACAO"));

        if(opcao == 1)
            exibeMensagem(new Cliente(nome, endereco, idade, valorPedido).toString(), "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
        else
            exibeMensagem(new ClientePremium(nome, endereco, idade, valorPedido).toString(), "CLIENTE", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void exibeMensagem(String messege, String title, int option){
        JOptionPane.showMessageDialog(null, messege, title, option);
    }

    private static String exibePerguntaRecebeMensagem(String messege, String title){
        return JOptionPane.showInputDialog(null, messege, title, JOptionPane.QUESTION_MESSAGE);
    }
}
