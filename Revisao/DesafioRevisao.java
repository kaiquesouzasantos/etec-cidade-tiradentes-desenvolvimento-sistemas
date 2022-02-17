package Revisao;
import java.util.*;

public class DesafioRevisao {
    private final Scanner in = new Scanner(System.in);
    private int anoNascimento = 0;
    private int anoAtual = 0;
    private String opcaoContinua = "";
    private String resultado = "";


    public void idadeDesafio(){
        do{
            System.out.print("\u001B[31mDigite o ano atual: ");
            anoAtual = in.nextInt();

            System.out.print("\u001B[31mDigite seu ano de nascimento: ");
            anoNascimento = in.nextInt();

            decideMaioridade();

            System.out.print("\u001B[39mDeseja calcular mais alguma idade[SIM - NAO]? ");
            opcaoContinua = in.next();

        }while(opcaoContinua.equalsIgnoreCase("sim"));
    }

    public void decideMaioridade(){
        resultado = (anoAtual - anoNascimento < 18)? "\u001B[34mMenor de Idade.":"\u001B[34mMaior de Idade.";
        System.out.println(resultado);
    }
}
