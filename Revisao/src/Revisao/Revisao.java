package Revisao;
import java.util.*;

public class Revisao {
    public static Scanner in = new Scanner(System.in);
    public static DesafioRevisao d = new DesafioRevisao();
    public static MatrizRevisao m = new MatrizRevisao();
    public static WhileRevisao w = new WhileRevisao();
    public static VetorRevisao v = new VetorRevisao();
    public static EstruturaDecisaoRevisao e = new EstruturaDecisaoRevisao();

    public static void main(String[] args) {
        System.out.print("\u001B[36m===============PROCEDIMENTOS POSSIVEIS===============" +
                "\n\u001B[33m[1] - Exercicio 1 e 2 com Estrutura de Decisao" +
                "\n[2] - Exercicio 3 com Estrutura de Repeticao" +
                "\n[3] - Desafio" +
                "\n[4] - Exercicio com Matriz" +
                "\n[5] - Exercicio com Vetor" +
                "\n\n\u001B[31mQual procedimento deseja realizar: ");
        int opcaoProcedimento = in.nextInt();

        if(opcaoProcedimento == 1) {
            System.out.println("\n\u001B[36mExercicio 1 e 2 com Estrutura de Decisao");
            e.recebeNumero();
            e.numImpar();
            e.numNegativo();
        }else if(opcaoProcedimento == 2) {
            System.out.println("\n\u001B[36mExercicio 3 com Estrutura de Repeticao");
            w.whileSenha();
        }else if(opcaoProcedimento == 3) {
            System.out.println("\n\u001B[36mDesafio");
            d.idadeDesafio();
        }else if(opcaoProcedimento == 4) {
            System.out.println("\n\u001B[36mExercicio com Matriz");
            m.recebeNotas();
            m.exibeNotas();
        }else if(opcaoProcedimento == 5) {
            System.out.println("\n\u001B[36mExercicio com Vetor");
            v.outVetor();
        }else{
            System.out.println("\033[0m\nOPCAO INVALIDA, PROGRAMA ENCERRADO!");
        }
    }
}
