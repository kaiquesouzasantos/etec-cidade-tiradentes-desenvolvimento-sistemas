package Revisao;
import java.util.*;

public class DesafioRevisao {
    private final Scanner in = new Scanner(System.in);
    private int anoNascimento = 0;
    private int anoAtual = 0;
    private String opcaoContinua;
    private String resultado;


    public void idadeDesafio(){
        do{
            System.out.print("Digite o ano atual: ");
            anoAtual = in.nextInt();

            System.out.print("Digite seu ano de nascimento: ");
            anoNascimento = in.nextInt();

            decideMaioridade();

            System.out.print("Deseja calcular mais alguma idade[SIM - NAO]? ");
            opcaoContinua = in.next();

        }while(opcaoContinua.equalsIgnoreCase("sim"));
    }

    public void decideMaioridade(){
        resultado = (anoAtual - anoNascimento < 18)? "Menor de Idade.":"Maior de Idade.";
        System.out.println(resultado);
    }
}
