package Revisao;
import java.util.*;

public class EstruturaDecisaoRevisao {
    private final Scanner in = new Scanner(System.in);
    private int numero = 0;

    public void recebeNumero(){
        System.out.print("\u001B[31mDigite um numero: ");
        numero = in.nextInt();
    }

    public void numNegativo(){
        if(numero < 0){
            System.out.println("\u001B[34mNumero NEGATIVO!");
        }else{
            System.out.println("\u001B[34mNumero POSITIVO!");
        }
    }

    public void numImpar(){
        if(numero % 2 == 0){
            System.out.println("\u001B[34mNumero PAR");
        }else{
            System.out.println("\u001B[34mNumero IMPAR");
        }
    }
}
