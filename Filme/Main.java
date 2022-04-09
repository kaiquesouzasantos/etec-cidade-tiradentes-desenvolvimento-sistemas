package Filme;
import javax.swing.*;

public class Main {
    public static void recebeFilmes(Filme filme){
        filme.setTituloFilme(JOptionPane.showInputDialog(null, "Digite o nome do filme: "));
        filme.setDuracaoEmMinutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duracao do filme: ")));
    }

    public static void main(String[] args) {
        // 01 - FILME
        Filme filme1 = new Filme();
        filme1.setTituloFilme("Os Vingadores");
        filme1.setDuracaoEmMinutos(123);

        // 02 - FILME
        Filme filme2 = new Filme();
        filme2.setTituloFilme("Hotel Transilvania");
        filme2.setDuracaoEmMinutos(93);

        System.out.println("Os filme em cartazs sao "+filme1.getTituloFilme()+" e "+filme2.getTituloFilme());

        // 03 | 08 - FILMES
        Filme filme3 = new Filme();
        Filme filme4 = new Filme();
        Filme filme5 = new Filme();
        Filme filme6 = new Filme();
        Filme filme7 = new Filme();

        recebeFilmes(filme3);
        recebeFilmes(filme4);
        recebeFilmes(filme5);
        recebeFilmes(filme6);
        recebeFilmes(filme7);

        JOptionPane.showMessageDialog(null, "Os filme em cartazs sao: \n\nDURACAO | NOME\n\n"+
                filme1.exibirDuracaoEmHoras()+"  |  "+filme1.getTituloFilme()+"\n"+
                filme2.exibirDuracaoEmHoras()+"  |  "+filme2.getTituloFilme()+"\n"+
                filme3.exibirDuracaoEmHoras()+"  |  "+filme3.getTituloFilme()+"\n"+
                filme4.exibirDuracaoEmHoras()+"  |  "+filme4.getTituloFilme()+"\n"+
                filme5.exibirDuracaoEmHoras()+"  |  "+filme5.getTituloFilme()+"\n"+
                filme6.exibirDuracaoEmHoras()+"  |  "+filme6.getTituloFilme()+"\n"+
                filme7.exibirDuracaoEmHoras()+"  |  "+filme7.getTituloFilme()+"\n"
        );
    }
}
