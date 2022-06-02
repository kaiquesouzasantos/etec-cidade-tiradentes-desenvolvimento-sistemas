package PessoaRevisao;
import javax.swing.*;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(JOptionPane.showInputDialog("DIGITE SEU NOME: "));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA ALTURA EM METROS: ")));
        String frase = JOptionPane.showInputDialog("DIGITE UMA FRASE: ");
        pessoa.setFrase(frase);

        JOptionPane.showMessageDialog(null, pessoa.retornaAtributos());

        if(pessoa.getFrase().equalsIgnoreCase("")){JOptionPane.showMessageDialog(null, pessoa.retornaFrase("FRASE DEFUALT"));
        }else{JOptionPane.showMessageDialog(null, pessoa.retornaFrase());}
    }
}
