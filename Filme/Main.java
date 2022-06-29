package Filme;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        StringBuilder saida = new StringBuilder();

        for(int i = 0; i < 8; i++){
            filme.setTituloFilme(JOptionPane.showInputDialog(null, "Digite o nome do filme: "));
            filme.setDuracaoEmMinutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duracao do filme: ")));

            saida.append(filme.exibirDuracaoEmHoras()+"  |  "+filme.getTituloFilme()+"\n");
        }
        JOptionPane.showMessageDialog(null, "Os filme em cartazs sao: \n\nDURACAO | NOME\n\n"+saida);
    }
}
