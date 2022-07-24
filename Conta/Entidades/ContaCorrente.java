package Conta.Entidades;

public class ContaCorrente {
	public double saldoConta, creditoConta;
	public int agenciaConta, numConta;
	public String titularConta;

	public ContaCorrente(double saldoConta, double creditoConta, int agenciaConta, int numConta, String titularConta) {
		this.saldoConta = saldoConta;
		this.creditoConta = creditoConta;
		this.agenciaConta = agenciaConta;
		this.numConta = numConta;
		this.titularConta = titularConta;
	}

	public void taxarConta() {
		this.saldoConta -= 42.72;
	}

	public void depositar(double depositoValor) {
		this.saldoConta += depositoValor;
	}

	public String sacar(double saqueValor) {
		if(saqueValor <= saldoConta) {
			saldoConta = saldoConta - saqueValor;
			return "SAQUE REALIZADO COM SUCESSO";
		}else if(saqueValor <= saldoConta + creditoConta){
			saqueValor = saldoConta - saqueValor;
			saldoConta = 0;
			creditoConta = creditoConta - saqueValor;
			return "SAQUE REALIZADO COM SUCESSO";
		}

		return  "SALDO INSUFICIENTE - A OPERACAO NAO PODE SER CONCLUIDA!";
	}

	@Override
	public String toString() {
		return "TIPO: CONTA CORRENTE\nTITULAR: "+titularConta+"\nAGENCIA: "+agenciaConta+"\nNUMERO DA CONTA: "+numConta+"\nSALDO: R$"+saldoConta+"\nCREDITO: R$"+creditoConta;
	}
}
