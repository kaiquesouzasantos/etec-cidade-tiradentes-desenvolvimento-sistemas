package PessoaRevisao;
import javax.swing.JOptionPane;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(JOptionPane.showInputDialog("DIGITE SEU NOME: "));
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA ALTURA: ")));
        String frase = JOptionPane.showInputDialog("DIGITE UMA FRASE: ");
        pessoa.setFrase(frase);

        System.out.println(pessoa.retornaAtributos());

        if(pessoa.getFrase().equalsIgnoreCase("")){JOptionPane.showMessageDialog(null, pessoa.retornaFrase("FRASE DEFUALT"));
        }else{JOptionPane.showMessageDialog(null, pessoa.retornaFrase());}
    }
}
