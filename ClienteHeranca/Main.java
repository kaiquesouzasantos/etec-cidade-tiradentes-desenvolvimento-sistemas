package ClienteHeranca;
import ClienteHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - CLIENTE\n[2] - CLIENTE PREMIUM\n\nDIGITE O TIPO DE CLIENTE: "));
        if(opcao != 1 && opcao != 2) System.exit(0);

        String nome = JOptionPane.showInputDialog("DIGITE SEU NOME: ");
        String endereco = JOptionPane.showInputDialog("DIGITE SEU ENDEREÇO: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE: "));
        double valorPedido = Double.parseDouble(JOptionPane.showInputDialog("VALOR DOS PEDIDOS: R$"));

        if(opcao == 1)
            JOptionPane.showMessageDialog(
                    null, "DESCONTO: R$"+new Cliente(nome, endereco, idade, valorPedido).getDesconto());
        else
            JOptionPane.showMessageDialog(
                null, "DESCONTO: R$"+new ClientePremium(nome, endereco, idade, valorPedido).getDesconto());
    }
}
