package Conta;
import java.util.Scanner;

public class Main {
	public static final Scanner in = new Scanner(System.in);
	public static Conta conta = new Conta();
	public static ContaCorrente contaCorrente = new ContaCorrente();
	
	public static void main(String[] args) {
		System.out.print("======== CONTA ========\n[C] - CONTA COMUM\n[CC] - CONTA CORRENTE\n\nDIGITE O TIPO DA CONTA: ");
		String opcao = in.next();
		
		if(opcao.equalsIgnoreCase("C")) {
			contaComum();
		}else if(opcao.equalsIgnoreCase("CC")){
			contaCorrente();
		}
	}
	
	public static void contaComum() {
		conta.saldoConta = 1000;
		
		System.out.print("DIGITE O TITULAR DA CONTA: ");
		conta.titularConta = in.next();
		System.out.print("DIGITE O NÚMERO DA CONTA: ");
		conta.numConta = in.nextInt();
		System.out.print("DIGITE O NÚMERO DA AGÊNCIA: ");
		conta.agenciaConta = in.nextInt();
		
		System.out.print("\n[S] - SACAR | [D] - DEPOSITAR\nDIGITE A OPERACAO DESEJADA: ");
		String opcao = in.next();
		
		if(opcao.equalsIgnoreCase("S")) {
			System.out.print("VALOR SAQUE: ");
			double valorSaque = in.nextDouble();
			conta.sacar(valorSaque);
		}else if(opcao.equalsIgnoreCase("D")) {
			System.out.print("VALOR DEPOSITO: ");
			double deposito = in.nextDouble();
			conta.depositar(deposito);
		}
		
		System.out.print("\nSALDO EM CONTA: "+conta.saldoConta);
	}
	
	public static void contaCorrente() {
		System.out.print("DIGITE O TITULAR DA CONTA: ");
		contaCorrente.titularConta = in.next();
		System.out.print("DIGITE O NÚMERO DA AGÊNCIA: ");
		contaCorrente.agenciaConta = in.nextInt();
		
		contaCorrente.saldoConta = 1000;
		contaCorrente.creditoConta = 200;
		
		contaCorrente.taxarConta();
		contaCorrente.consultarConta();
	}

}
