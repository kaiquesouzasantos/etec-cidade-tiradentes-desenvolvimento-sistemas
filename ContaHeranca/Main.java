package ContaHeranca;
import ContaHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - CONTA COMUM\n[2] - CONTA POUPANCA\n[3] - CONTA CORRENTE\n\nDIGITE O TIPO DE CONTA: "));

        String titular = JOptionPane.showInputDialog("DIGITE O TITULAR: ");
        int numAgencia = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA AGENCIA: "));
        int numConta = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA CONTA: "));

        String operacao = JOptionPane.showInputDialog("[SC] - SAQUE\n[DP] - DEPOSITO\n\nDIGITE A OPERAÇÃO: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("VALOR: R$"));

        if(opcao == 1){
            executaContaComum(new Conta(numAgencia, numConta, titular), operacao, valor, 150);
        } else if (opcao == 2) {
            executaContaPoupanca(new ContaPoupanca(numAgencia, numConta, titular), operacao, valor, 150);
        }else if (opcao == 3){
            executaContaCorrente(new ContaCorrente(numAgencia, numConta, titular), operacao, valor, 1000, 100);
        }else {
            System.exit(0);
        }
    }

    public static void executaContaPoupanca(ContaPoupanca conta, String operacao, double valor, double saldo){
        conta.setSaldoConta(saldo);

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
    }

    public static void executaContaComum(Conta conta, String operacao, double valor, double saldo){
        conta.setSaldoConta(saldo);

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
    }

    public static void executaContaCorrente(ContaCorrente conta, String operacao, double valor, double limite, double saldo){
        conta.setSaldoConta(saldo);
        conta.setLimite(limite);

        if(operacao.equalsIgnoreCase("SC")){
            if(conta.sacar(valor)){
                conta.sacar(valor);
                JOptionPane.showMessageDialog(null, "-- SAQUE REALIZADO COM SUCESSO --\n");
            }else{
                JOptionPane.showMessageDialog(null, "-- VALOR INDISPONIVEL --\n");
            }
        } else if (operacao.equalsIgnoreCase("DP")) {
            conta.depositar(valor);
            JOptionPane.showMessageDialog(null, "-- DEPOSITO REALIZADO COM SUCESSO --\n");
        }

        JOptionPane.showMessageDialog(null, conta.informacoes());
    }
}
