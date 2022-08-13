package ContaHeranca;
import ContaHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                null, "[1] - CONTA POUPANCA\n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DA CONTA: ",
                "MENU", JOptionPane.INFORMATION_MESSAGE));

        if(opcao != 1 && opcao != 2) {
            JOptionPane.showMessageDialog(
                    null, "OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String titular = JOptionPane.showInputDialog(
                null, "DIGITE O TITULAR DA CONTA: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);

        String operacao = JOptionPane.showInputDialog(
                null, "[SC] - SACAR  |  [DP] - DEPOSITAR\nDIGITE A OPERACAO DESEJADA: ",
                "OPERACAO", JOptionPane.QUESTION_MESSAGE);
        double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog(
                null, "DIGITE O VALOR DA TRANSACAO: R$", "OPERACAO", JOptionPane.QUESTION_MESSAGE));

        if(opcao == 1)
            executaConta(new ContaPoupanca(geraNumAgenciaConta(100000), geraNumAgenciaConta(1000000000), titular), operacao, valorTransacao);
        else
            executaConta(new ContaCorrente(geraNumAgenciaConta(100000), geraNumAgenciaConta(1000000000), titular), operacao, valorTransacao);
    }

    public static void executaConta(Conta conta, String operacao, double valor){
        conta.setSaldoConta(200);

        if (conta instanceof ContaCorrente)
            ((ContaCorrente) conta).setLimite(1000);

        if(operacao.equalsIgnoreCase("SC")) {
            JOptionPane.showMessageDialog(
                    null, conta.sacar(valor), "OPERACAO", JOptionPane.INFORMATION_MESSAGE);
        }else if (operacao.equalsIgnoreCase("DP")) {
            JOptionPane.showMessageDialog(
                    null, conta.depositar(valor), "OPERACAO", JOptionPane.INFORMATION_MESSAGE);
        }

        JOptionPane.showMessageDialog(
                null, conta, "CONTA", JOptionPane.INFORMATION_MESSAGE);
    }

    private static int geraNumAgenciaConta(int digitos){
        return (int) (Math.random() * digitos);
    }
}
