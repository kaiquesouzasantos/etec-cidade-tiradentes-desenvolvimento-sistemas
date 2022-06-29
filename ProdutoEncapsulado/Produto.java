package ProdutoEncapsulado;

public class Produto {
	private String nomeProduto;
	private double precoCusto, margemLucro, precoVenda;
	public boolean precoVendaValidacao;

	public Produto(){}

	// GET's
	public String getNomeProduto() {return this.nomeProduto;}
	public double getPrecoCusto() {return this.precoCusto;}
	public double getPrecoVenda() {return this.precoVenda;}
	public double getMargemLucro() {return this.margemLucro;}
	
	// SET's
	public void setNomeProduto(String nomeProduto) {this.nomeProduto = nomeProduto;}
	public void setPrecoCusto(double precoCusto) {this.precoCusto = precoCusto;}
	public void setPrecoVenda(double precoVenda) {
		if(precoVenda < precoCusto) {
			System.out.println("VALOR DE VENDA INCOMPATIVEL, DIGITE NOVAMENTE!");
			precoVendaValidacao = false;
		}else {
			this.precoVenda = precoVenda;
			precoVendaValidacao = true;
		}
	}

	// MARGEM DE LUCRO
	public void calcularMargemLucro() {this.margemLucro = (precoVenda - precoCusto);}
	public double getMargemLucroPorcentagem() {return this.margemLucro/(precoCusto/100);}

	@Override
	public String toString() {
		return "NOME DO PRODUTO: "+nomeProduto+
				"\nVALOR DE CUSTO: R$"+precoCusto+
				"\nVALOR DE VENDA: R$"+precoVenda+
				"\nMARGEM DE LUCRO: R$"+margemLucro+
				"\nPERCENTUAL DE MARGEM DE LUCRO: "+getMargemLucroPorcentagem()+"%";
	}
}
