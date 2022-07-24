package ContaHeranca;
import ContaHeranca.Entidades.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - CONTA POUPANCA\n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DE CONTA: "));
        if(opcao != 1 && opcao != 2) System.exit(0);

        String titular = JOptionPane.showInputDialog("DIGITE O TITULAR: ");
        int numAgencia = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA AGENCIA: "));
        int numConta = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA CONTA: "));

        String operacao = JOptionPane.showInputDialog("[SC] - SAQUE\n[DP] - DEPOSITO\n\nDIGITE A OPERAÇÃO: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("VALOR: R$"));

        List<Conta> conta = new ArrayList<>();
        if(opcao == 1) conta.add(new ContaPoupanca(numAgencia, numConta, titular));
        else conta.add(new ContaCorrente(numAgencia, numConta, titular));

        executaConta(conta, operacao, valor);
    }

    public static void executaConta(List<? extends Conta> contas, String operacao, double valor){
        contas.forEach(conta -> {
            conta.setSaldoConta(200);
            if (conta instanceof ContaCorrente) ((ContaCorrente) conta).setLimite(1000);

            if(operacao.equalsIgnoreCase("SC")){
                if(conta.sacar(valor)){
                    conta.sacar(valor);
                    JOptionPane.showMessageDialog(null, "-- SAQUE REALIZADO COM SUCESSO --");
                }else{
                    JOptionPane.showMessageDialog(null, "-- VALOR INDISPONIVEL --");
                }
            } else if (operacao.equalsIgnoreCase("DP")) {
                conta.depositar(valor);
                JOptionPane.showMessageDialog(null, "-- DEPOSITO REALIZADO COM SUCESSO --");
            }

            JOptionPane.showMessageDialog(null, conta.informacoes());
        });
    }
}
