package Conta;
import Conta.Entidades.*;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		int opcao = Integer.parseInt(exibePerguntaRecebeResposta("[1] - CONTA COMUM\n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DA CONTA: ", "MENU"));

		if(opcao != 1 && opcao != 2) {
			exibeMensagem("OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}

		String titular = exibePerguntaRecebeResposta("DIGITE O TITULAR DA CONTA: ", "INFORMACAO");
		String operacao = exibePerguntaRecebeResposta("[S] - SACAR  |  [D] - DEPOSITAR\nDIGITE A OPERACAO DESEJADA: ", "OPERACAO");
		double valorTransacao = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE O VALOR DA TRANSACAO: R$", "OPERACAO"));

		if(opcao == 1){
			Conta contaComum = new Conta(1000, geraNumAgenciaConta(100000), geraNumAgenciaConta(1000000000), titular);

			if(operacao.equalsIgnoreCase("S")) {
				exibeMensagem(contaComum.sacar(valorTransacao), "OPERACAO");
			}else if(operacao.equalsIgnoreCase("D")) {
				contaComum.depositar(valorTransacao);
				exibeMensagem("DEPOSITO REALIZADO COM SUCESSO", "OPERACAO");
			}

			exibeMensagem(contaComum.toString(), "CONTA");
		}else{
			ContaCorrente contaCorrente = new ContaCorrente(1000, 2000,  geraNumAgenciaConta(100000), geraNumAgenciaConta(1000000000), titular);

			if(operacao.equalsIgnoreCase("S")) {
				exibeMensagem(contaCorrente.sacar(valorTransacao), "OPERACAO");
			}else if(operacao.equalsIgnoreCase("D")) {
				contaCorrente.depositar(valorTransacao);
				exibeMensagem("DEPOSITO REALIZADO COM SUCESSO", "OPERACAO");
			}

			contaCorrente.taxarConta();
			exibeMensagem(contaCorrente.toString(), "CONTA");
		}
	}

	private static int geraNumAgenciaConta(int digitos){
		return (int) (Math.random() * digitos);
	}

	public static String exibePerguntaRecebeResposta(String message, String title){
		return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
	}

	public static void exibeMensagem(String message, String title){
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibeMensagem(String message, String title, int option){
		JOptionPane.showMessageDialog(null, message, title, option);
	}
}
