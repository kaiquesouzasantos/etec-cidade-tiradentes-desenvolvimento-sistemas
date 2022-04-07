package Filme;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // 01 - FILME
        Filme filme1 = new Filme();
        filme1.setTituloFilme("Os Vingadores");
        filme1.setDuracaoEmMinutos(123);

        // 02 - FILME
        Filme filme2 = new Filme();
        filme2.setTituloFilme("Hotel Transilvania");
        filme2.setDuracaoEmMinutos(93);

        System.out.println("Os filme em cartazs são "+filme1.getTituloFilme()+" e "+filme2.getTituloFilme());

        // 03
        Filme filme3 = new Filme();
        filme3.setTituloFilme(JOptionPane.showInputDialog(null, "Digite o nome do filme: "));
        filme3.setDuracaoEmMinutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duracao do filme: ")));

        // 04
        Filme filme4 = new Filme();
        filme4.setTituloFilme(JOptionPane.showInputDialog(null, "Digite o nome do filme: "));
        filme4.setDuracaoEmMinutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duracao do filme: ")));

        // 05
        Filme filme5 = new Filme();
        filme5.setTituloFilme(JOptionPane.showInputDialog(null, "Digite o nome do filme: "));
        filme5.setDuracaoEmMinutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duracao do filme: ")));

        // 06
        Filme filme6 = new Filme();
        filme6.setTituloFilme(JOptionPane.showInputDialog(null, "Digite o nome do filme: "));
        filme6.setDuracaoEmMinutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duracao do filme: ")));

        // 07
        Filme filme7 = new Filme();
        filme7.setTituloFilme(JOptionPane.showInputDialog(null, "Digite o nome do filme: "));
        filme7.setDuracaoEmMinutos(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a duracao do filme: ")));

        JOptionPane.showMessageDialog(null, "Os filme em cartazs são: \n"+
                filme1.getTituloFilme()+" | "+filme1.exibirDuracaoEmHoras()+"\n"+
                filme2.getTituloFilme()+" | "+filme2.exibirDuracaoEmHoras()+"\n"+
                filme3.getTituloFilme()+" | "+filme3.exibirDuracaoEmHoras()+"\n"+
                filme4.getTituloFilme()+" | "+filme4.exibirDuracaoEmHoras()+"\n"+
                filme5.getTituloFilme()+" | "+filme5.exibirDuracaoEmHoras()+"\n"+
                filme6.getTituloFilme()+" | "+filme6.exibirDuracaoEmHoras()+"\n"+
                filme7.getTituloFilme()+" | "+filme7.exibirDuracaoEmHoras()+"\n"
        );
    }
}
