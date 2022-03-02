package Revisao;
import java.util.*;

public class MatrizRevisao {
    private final Scanner in = new Scanner(System.in);
    private double matriz[][] = new double[3][4];
    private final String aluno[] = {"A","B","C"};

    public void recebeNotas() {
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print("Digite uma nota: ");
                matriz[i][k] = in.nextDouble();
            }
        }
    }

    public void exibeNotas(){
        System.out.println("\nNOTAS");
        for(int i = 0; i < 3; i++){
            System.out.print("ALUNO: "+aluno[i]+" | NOTAS: ");
            for(int k = 0; k < 4; k++){
                System.out.print(matriz[i][k]+"  ");
            }
            System.out.println("");
        }
    }
}
