package Pessoa.PropostaSolucao_02;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(JOptionPane.showInputDialog(
                null, "DIGITE SEU NOME: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog(
                null,"DIGITE SUA ALTURA: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE)));
        pessoa.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog(
                null, "DIGITE SUA DATA DE NASCIMENTO: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE)));

        JOptionPane.showMessageDialog(
                null, pessoa, "PESSOA", JOptionPane.INFORMATION_MESSAGE);
    }
}
