package PessoaRevisao;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(exibePerguntaRecebeResposta("DIGITE SEU NOME: "));
        pessoa.setAltura(Double.parseDouble(exibePerguntaRecebeResposta("DIGITE SUA ALTURA EM METROS: ")));
        pessoa.setFrase(exibePerguntaRecebeResposta("DIGITE UMA FRASE: "));

        JOptionPane.showMessageDialog(
                null, pessoa.retornaAtributos(), "PESSOA", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String exibePerguntaRecebeResposta(String message){
        return JOptionPane.showInputDialog(null, message, "INFROMACAO", JOptionPane.QUESTION_MESSAGE);
    }
}
