package Pessoa;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(exibePerguntaRecebeResposta("DIGITE SEU NOME: "));
        pessoa.setAltura(Double.parseDouble(exibePerguntaRecebeResposta("DIGITE SUA ALTURA(M): ")));
        pessoa.setAnoNascimento(Integer.parseInt(exibePerguntaRecebeResposta("DIGITE SEU ANO DE NASCIMENTO: ")));

        JOptionPane.showMessageDialog(
                null, pessoa, "PESSOA", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String exibePerguntaRecebeResposta(String message){
        return JOptionPane.showInputDialog(null, message, "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
    }
}
