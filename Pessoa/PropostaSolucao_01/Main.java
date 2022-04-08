package Pessoa.PropostaSolucao_01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("DIGITE SEU NOME: ");
        pessoa.setNome(in.next());
        System.out.print("DIGITE SUA ALTURA EM METROS: ");
        pessoa.setAltura(in.nextDouble());
        System.out.print("DIGITE SUA DATA DE NASCIMENTO: ");
        pessoa.setAnoNascimento(in.nextInt());

        System.out.println("\nNOME: "+pessoa.getNome());
        System.out.println("ALTURA: "+pessoa.getAltura());
        System.out.println("DATA DE NASCIMENTO: "+pessoa.getAnoNascimento());
        System.out.println("IDADE: "+pessoa.calculoIdade()+" anos");
    }
}
