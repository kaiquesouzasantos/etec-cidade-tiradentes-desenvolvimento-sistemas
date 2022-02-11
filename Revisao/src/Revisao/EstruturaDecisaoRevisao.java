package Revisao;
import java.util.*;

public class EstruturaDecisaoRevisao {
    public Scanner in = new Scanner(System.in);

    public EstruturaDecisaoRevisao(){
        System.out.print("\u001B[31mDigite um numero: ");
        int numero = in.nextInt();

        numNegativo(numero);
        numImpar(numero);
    }

    public void numNegativo(int numero){
        if(numero < 0){
            System.out.println("\u001B[34mNumero NEGATIVO!");
        }else{
            System.out.println("\u001B[34mNumero POSITIVO!");
        }
    }

    public void numImpar(int numero){
        if(numero % 2 == 0){
            System.out.println("\u001B[34mNumero PAR");
        }else{
            System.out.println("\u001B[34mNumero IMPAR");
        }
    }
}
