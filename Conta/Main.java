package Conta;
import Conta.Entidades.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - CONTA COMUM  |  \n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DA CONTA: "));
		if(opcao != 1 && opcao != 2) System.exit(0);

		String titular = JOptionPane.showInputDialog("DIGITE O TITULAR DA CONTA: ");
		int numConta = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO DA CONTA: "));
		int agencia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO DA AGENCIA: "));

		String operacao = JOptionPane.showInputDialog("[S] - SACAR  |  [D] - DEPOSITAR\nDIGITE A OPERACAO DESEJADA: ");
		double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA TRANSACAO: R$"));

		if(opcao == 1){
			Conta contaComum = new Conta(1000, agencia, numConta, titular);

			if(operacao.equalsIgnoreCase("S")) JOptionPane.showMessageDialog(null, contaComum.sacar(valorTransacao));
			else if(operacao.equalsIgnoreCase("D")) contaComum.depositar(valorTransacao);

			JOptionPane.showMessageDialog(null, contaComum);

		}else{
			ContaCorrente contaCorrente = new ContaCorrente(1000, 2000, agencia, numConta, titular);

			if(operacao.equalsIgnoreCase("S")) JOptionPane.showMessageDialog(null, contaCorrente.sacar(valorTransacao));
			else if(operacao.equalsIgnoreCase("D")) contaCorrente.depositar(valorTransacao);
			contaCorrente.taxarConta();

			JOptionPane.showMessageDialog(null, contaCorrente);
		}
	}
}
