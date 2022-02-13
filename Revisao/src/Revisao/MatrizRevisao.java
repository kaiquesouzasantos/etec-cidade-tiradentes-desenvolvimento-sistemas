package Revisao;
import java.util.*;

public class MatrizRevisao {
    public Scanner in = new Scanner(System.in);
    public double matriz[][] = new double[3][4];
    public String aluno[] = {"A","B","C"};

    public void recebeNotas() {
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print("\u001B[31mDigite uma nota: ");
                matriz[i][k] = in.nextDouble();
            }
        }
    }

    public void exibeNotas(){
        System.out.println("\nNOTAS");
        for(int i = 0; i < 3; i++){
            System.out.print("\u001B[33mALUNO: \u001B[32m"+aluno[i]+"\u001B[33m | NOTAS: ");
            for(int k = 0; k < 4; k++){
                System.out.print("\u001B[36m"+matriz[i][k]+"  ");
            }
            System.out.println("\033[0m");
        }
    }
}
