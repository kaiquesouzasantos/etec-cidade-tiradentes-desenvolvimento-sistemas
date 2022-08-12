package ContaHeranca;
import ContaHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(
                JOptionPane.showInputDialog("[1] - CONTA POUPANCA\n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DE CONTA: ")
        );
        if(opcao != 1 && opcao != 2) System.exit(0);

        String titular = JOptionPane.showInputDialog("DIGITE O TITULAR: ");
        int numAgencia = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA AGENCIA: "));
        int numConta = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA CONTA: "));

        String operacao = JOptionPane.showInputDialog("[SC] - SAQUE\n[DP] - DEPOSITO\n\nDIGITE A OPERAÇÃO: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("VALOR: R$"));

        if(opcao == 1)
            executaConta(new ContaPoupanca(numAgencia, numConta, titular), operacao, valor);
        else
            executaConta(new ContaCorrente(numAgencia, numConta, titular), operacao, valor);
    }

    public static void executaConta(Conta conta, String operacao, double valor){
        conta.setSaldoConta(200);
        if (conta instanceof ContaCorrente)
            ((ContaCorrente) conta).setLimite(1000);

        if(operacao.equalsIgnoreCase("SC"))
            JOptionPane.showMessageDialog(null, conta.sacar(valor));
        else if (operacao.equalsIgnoreCase("DP"))
            JOptionPane.showMessageDialog(null, conta.depositar(valor));

        JOptionPane.showMessageDialog(null, conta);
    }
}
