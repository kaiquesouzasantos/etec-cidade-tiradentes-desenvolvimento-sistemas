package ProdutoEncapsulado;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto();

		produto.setNomeProduto(exibePerguntaRecebeResposta("INFORME O NOME DO PRODUTO: "));

		do{
			produto.setPrecoCusto(Double.parseDouble(exibePerguntaRecebeResposta("INFORME O PRECO DE CUSTO: R$")));

			produto.setPrecoVenda(Double.parseDouble(exibePerguntaRecebeResposta("INFORME O PRECO DE VENDA: R$")));

			if(!produto.precoVendaValidacao)
				exibeMensagem("PRECO INVIAVEL, DIGITE NOVAMENTE!", "AVISO", JOptionPane.WARNING_MESSAGE);
		}while(!produto.precoVendaValidacao);

		produto.calcularMargemLucro();
		exibeMensagem(produto.toString(), "PRODUTO", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void exibeMensagem(String message, String title, int option){
		JOptionPane.showMessageDialog(null, message, title, option);
	}
	
	private static String exibePerguntaRecebeResposta(String message){
		return JOptionPane.showInputDialog(null, message, "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
	}
}
