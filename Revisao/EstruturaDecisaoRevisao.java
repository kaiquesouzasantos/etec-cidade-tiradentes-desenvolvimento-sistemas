package Revisao;
import java.util.*;

public class EstruturaDecisaoRevisao {
    private final Scanner in = new Scanner(System.in);
    private int numero = 0;

    public void recebeNumero(){
        System.out.print("Digite um numero: ");
        numero = in.nextInt();
    }

    public void numNegativo(){
        if(numero < 0){
            System.out.println("Numero NEGATIVO!");
        }else{
            System.out.println("Numero POSITIVO!");
        }
    }

    public void numImpar(){
        if(numero % 2 == 0){
            System.out.println("Numero PAR");
        }else{
            System.out.println("Numero IMPAR");
        }
    }
}
