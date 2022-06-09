package ClienteHeranca;

import javax.swing.*;

public class TesteCliente {
    public static void main(String[] args) {
        // CLIENTE
        Cliente cliente = new Cliente();

        cliente.setNome(JOptionPane.showInputDialog("DIGITE SEU NOME: "));
        cliente.setEndereco(JOptionPane.showInputDialog("DIGITE SEU ENDEREÇO: "));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE: ")));
        cliente.setValorPedido(Double.parseDouble(JOptionPane.showInputDialog("VALOR DOS PEDIDOS: R$")));
        cliente.calculaDesconto();

        JOptionPane.showMessageDialog(null, "DESCONTO: R$"+cliente.getDesconto());

        // CLIENTE PREMIUM
        ClientePremium clientePremium = new ClientePremium();

        clientePremium.setNome(JOptionPane.showInputDialog("DIGITE SEU NOME: "));
        clientePremium.setEndereco(JOptionPane.showInputDialog("DIGITE SEU ENDEREÇO: "));
        clientePremium.setIdade(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE: ")));
        clientePremium.setValorPedido(Double.parseDouble(JOptionPane.showInputDialog("VALOR DOS PEDIDOS: R$")));
        clientePremium.calculaDesconto();

        JOptionPane.showMessageDialog(null, "DESCONTO: R$"+clientePremium.getDesconto());
    }
}
