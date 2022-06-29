package ProdutoEncapsulado;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Produto produto = new Produto();

		System.out.print("INFORME O NOME DO PRODUTO: ");
		produto.setNomeProduto(in.next());
		do{
			System.out.print("INFORME O PRECO DE CUSTO: ");
			produto.setPrecoCusto(in.nextDouble());
			System.out.print("INFORME O PRECO DE VENDA: ");
			produto.setPrecoVenda(in.nextDouble());
		}while(!produto.precoVendaValidacao);

		produto.calcularMargemLucro();
		System.out.println(produto);
	}
}
