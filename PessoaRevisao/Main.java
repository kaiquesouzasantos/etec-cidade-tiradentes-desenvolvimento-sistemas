package PessoaRevisao;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(JOptionPane.showInputDialog(
                null, "DIGITE SEU NOME: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog(
                null, "DIGITE SUA ALTURA EM METROS: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE)));
        String frase = JOptionPane.showInputDialog(
                null, "DIGITE UMA FRASE: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
        pessoa.setFrase(frase);

        JOptionPane.showMessageDialog(
                null, pessoa.retornaAtributos(), "PESSOA", JOptionPane.INFORMATION_MESSAGE);
    }
}
