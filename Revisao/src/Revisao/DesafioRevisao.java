package Revisao;
import java.util.*;

public class DesafioRevisao {
    public Scanner in = new Scanner(System.in);
    public int anoNascimento, anoAtual;
    public String opcaoContinua;

    public void idadeDesafio(){
        do{
            System.out.print("\u001B[31mDigite o ano atual: ");
            anoAtual = in.nextInt();

            System.out.print("\u001B[31mDigite seu ano de nasciemnto: ");
            anoNascimento = in.nextInt();

            decideMaioridade();

            System.out.print("\u001B[39mDeseja calcular mais alguma idade[SIM - NAO]? ");
            opcaoContinua = in.next();

        }while(opcaoContinua.equalsIgnoreCase("sim"));
    }

    public void decideMaioridade(){
        if(anoAtual - anoNascimento < 18){
            System.out.println("\u001B[34mMenor de Idade.");
        }else{
            System.out.println("\u001B[34mMaior de Idade.");
        }
    }
}
