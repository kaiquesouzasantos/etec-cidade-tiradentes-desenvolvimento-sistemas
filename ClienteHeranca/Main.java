package ClienteHeranca;
import ClienteHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                null, "[1] - CLIENTE\n[2] - CLIENTE PREMIUM\n\nDIGITE O TIPO DE CLIENTE: ",
                "MENU", JOptionPane.QUESTION_MESSAGE
        ));

        if(opcao != 1 && opcao != 2) {
            JOptionPane.showMessageDialog(
                    null, "OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String nome = JOptionPane.showInputDialog(
                null, "DIGITE SEU NOME: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
        String endereco = JOptionPane.showInputDialog(
                null, "DIGITE SEU ENDEREÇO: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.parseInt(JOptionPane.showInputDialog(
                null, "DIGITE SUA IDADE: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));
        double valorPedido = Double.parseDouble(JOptionPane.showInputDialog(
                null, "VALOR DOS PEDIDOS: R$", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));

        if(opcao == 1)
            apresentaCliente(new Cliente(nome, endereco, idade, valorPedido));
        else
            apresentaCliente(new ClientePremium(nome, endereco, idade, valorPedido));
    }

    private static void apresentaCliente(Cliente cliente){
        JOptionPane.showMessageDialog(
                null, cliente, "CLIENTE", JOptionPane.INFORMATION_MESSAGE
        );
    }
}
