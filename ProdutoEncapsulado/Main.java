package ProdutoEncapsulado;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto();

		produto.setNomeProduto(JOptionPane.showInputDialog(
				null, "INFORME O NOME DO PRODUTO: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));
		do{
			produto.setPrecoCusto(Double.parseDouble(JOptionPane.showInputDialog(
					null, "INFORME O PRECO DE CUSTO: R$", "INFORMACAO", JOptionPane.QUESTION_MESSAGE)));

			produto.setPrecoVenda(Double.parseDouble(JOptionPane.showInputDialog(
					null, "INFORME O PRECO DE VENDA: R$", "INFORMACAO", JOptionPane.QUESTION_MESSAGE)));

			if(!produto.precoVendaValidacao)
				JOptionPane.showMessageDialog(
						null, "PRECO INVIAVEL, DIGITE NOVAMENTE!", "AVISO", JOptionPane.WARNING_MESSAGE);
		}while(!produto.precoVendaValidacao);

		produto.calcularMargemLucro();
		JOptionPane.showMessageDialog(
				null, produto, "PRODUTO", JOptionPane.INFORMATION_MESSAGE);
	}
}
