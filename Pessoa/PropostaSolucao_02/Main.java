package Pessoa.PropostaSolucao_02;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(JOptionPane.showInputDialog("DIGITE SEU NOME: "));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA ALTURA: ")));
        pessoa.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SUA DATA DE NASCIMENTO: ")));

        JOptionPane.showMessageDialog(null, pessoa);
    }
}
