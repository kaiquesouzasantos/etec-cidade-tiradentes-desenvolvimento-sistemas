package Conta;
import Conta.Entidades.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog(
				null, "[1] - CONTA COMUM\n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DA CONTA: ",
				"MENU", JOptionPane.INFORMATION_MESSAGE));

		if(opcao != 1 && opcao != 2) {
			JOptionPane.showMessageDialog(
					null, "OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		String titular = JOptionPane.showInputDialog(
				null, "DIGITE O TITULAR DA CONTA: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);

		String operacao = JOptionPane.showInputDialog(
				null, "[S] - SACAR  |  [D] - DEPOSITAR\nDIGITE A OPERACAO DESEJADA: ",
				"OPERACAO", JOptionPane.QUESTION_MESSAGE);
		double valorTransacao = Double.parseDouble(JOptionPane.showInputDialog(
				null, "DIGITE O VALOR DA TRANSACAO: R$", "OPERACAO", JOptionPane.QUESTION_MESSAGE));

		if(opcao == 1){
			Conta contaComum = new Conta(1000, geraNumAgenciaConta(100000), geraNumAgenciaConta(1000000000), titular);

			if(operacao.equalsIgnoreCase("S")) {
				JOptionPane.showMessageDialog(
						null, contaComum.sacar(valorTransacao), "OPERACAO", JOptionPane.INFORMATION_MESSAGE);
			}else if(operacao.equalsIgnoreCase("D")) {
				contaComum.depositar(valorTransacao);
				JOptionPane.showMessageDialog(
						null, "DEPOSITO REALIZADO COM SUCESSO", "OPERACAO", JOptionPane.INFORMATION_MESSAGE);
			}

			JOptionPane.showMessageDialog(
					null, contaComum, "CONTA", JOptionPane.INFORMATION_MESSAGE);

		}else{
			ContaCorrente contaCorrente = new ContaCorrente(1000, 2000,  geraNumAgenciaConta(100000), geraNumAgenciaConta(1000000000), titular);

			if(operacao.equalsIgnoreCase("S")) {
				JOptionPane.showMessageDialog(
						null, contaCorrente.sacar(valorTransacao), "OPERACAO", JOptionPane.INFORMATION_MESSAGE);
			}else if(operacao.equalsIgnoreCase("D")) {
				contaCorrente.depositar(valorTransacao);
				JOptionPane.showMessageDialog(
						null, "DEPOSITO REALIZADO COM SUCESSO", "OPERACAO", JOptionPane.INFORMATION_MESSAGE);
			}
			contaCorrente.taxarConta();

			JOptionPane.showMessageDialog(null, contaCorrente, "CONTA", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private static int geraNumAgenciaConta(int digitos){
		return (int) (Math.random() * digitos);
	}
}
