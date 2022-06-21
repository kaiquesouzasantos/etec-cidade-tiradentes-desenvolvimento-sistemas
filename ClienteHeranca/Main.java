package ClienteHeranca;
import ClienteHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - CLIENTE\n[2] - CLIENTE PREMIUM\n\nDIGITE O TIPO DE CLIENTE: "));

            if(opcao == 1){cliente(new Cliente());
            }else if(opcao == 2) {cliente(new ClientePremium());
            }else{System.exit(0);}
        }catch (Exception e){System.exit(0);}
    }

    public static void cliente(Cliente cliente){
        cliente.setNome(JOptionPane.showInputDialog("DIGITE SEU NOME: "));
        cliente.setEndereco(JOptionPane.showInputDialog("DIGITE SEU ENDEREÇO: "));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA IDADE: ")));
        cliente.setValorPedido(Double.parseDouble(JOptionPane.showInputDialog("VALOR DOS PEDIDOS: R$")));
        cliente.calculaDesconto();

        JOptionPane.showMessageDialog(null, "DESCONTO: R$"+cliente.getDesconto());
    }
}
