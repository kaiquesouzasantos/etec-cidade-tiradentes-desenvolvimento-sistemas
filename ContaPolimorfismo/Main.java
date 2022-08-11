package ContaPolimorfismo;
import ContaPolimorfismo.Entidades.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        int continua;

        do{
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - CONTA POUPANCA\n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DE CONTA: "));
            if(opcao != 1 && opcao != 2) System.exit(0);

            String titular = JOptionPane.showInputDialog("DIGITE O TITULAR: ");
            int numAgencia = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA AGENCIA: "));
            int numConta = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA CONTA: "));

            String operacao = JOptionPane.showInputDialog("[SC] - SAQUE\n[DP] - DEPOSITO\n\nDIGITE A OPERAÇÃO: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("VALOR: R$"));

            if(opcao == 1) executaConta(new ContaPoupanca(numAgencia, numConta, titular), operacao, valor);
            else executaConta(new ContaCorrente(numAgencia, numConta, titular), operacao, valor);

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR? ");
        } while(continua == JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null, new Lucros().getSoma(contas));
    }

    public static void executaConta(Conta conta, String operacao, double valor){
        contas.add(conta);

        conta.setSaldoConta(200);
        if (conta instanceof ContaCorrente) ((ContaCorrente) conta).setLimite(1000);

        if(operacao.equalsIgnoreCase("SC")) JOptionPane.showMessageDialog(null, conta.sacar(valor));
        else if (operacao.equalsIgnoreCase("DP")) JOptionPane.showMessageDialog(null, conta.depositar(valor));

        JOptionPane.showMessageDialog(null, conta.informacoes());
    }
}
