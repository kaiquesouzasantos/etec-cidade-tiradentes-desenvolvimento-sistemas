package Conta.Entidades;

public class Conta {
	public double saldoConta;
	public int agenciaConta, numConta;
	public String titularConta;

	public Conta(double saldoConta, int agenciaConta, int numConta, String titularConta) {
		this.saldoConta = saldoConta;
		this.agenciaConta = agenciaConta;
		this.numConta = numConta;
		this.titularConta = titularConta;
	}

	public void depositar(double depositoValor) {
		this.saldoConta += depositoValor; 
	}
	
	public String sacar(double saqueValor) {
		if(saqueValor <= this.saldoConta) {
			this.saldoConta -= saqueValor;
			return "SAQUE REALIZADO COM SUCESSO";
		}

		return  "SALDO INSUFICIENTE - A OPERACAO NAO PODE SER CONCLUIDA!";
	}

	@Override
	public String toString() {
		return "TIPO: CONTA COMUM\nTITULAR: "+titularConta+"\nAGENCIA: "+agenciaConta+"\nNUMERO DA CONTA: "+numConta+"\nSALDO: R$"+saldoConta;
	}
}
