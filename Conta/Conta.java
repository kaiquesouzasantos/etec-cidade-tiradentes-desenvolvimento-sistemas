package Conta;

public class Conta {
	public double saldoConta;
	public int agenciaConta, numConta;
	public String titularConta;
	
	public void depositar(double depositoValor) {
		this.saldoConta += depositoValor; 
	}
	
	public void sacar(double saqueValor) {
		if(saqueValor <= this.saldoConta) {
			this.saldoConta -= saqueValor;
		}
	}
}
