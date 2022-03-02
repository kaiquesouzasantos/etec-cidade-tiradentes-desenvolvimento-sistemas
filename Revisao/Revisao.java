package Revisao;
import java.util.*;

public class Revisao {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("=============== PROCEDIMENTOS POSSIVEIS ===============" +
                "\n[1] - Exercicio 1 e 2 com Estrutura de Decisao" +
                "\n[2] - Exercicio 3 com Estrutura de Repeticao" +
                "\n[3] - Desafio" +
                "\n[4] - Exercicio com Matriz" +
                "\n[5] - Exercicio com Vetor" +
                "\n\nQual procedimento deseja realizar: ");
        int opcaoProcedimento = in.nextInt();
        procedimentosRevisao(opcaoProcedimento);
    }

    public static void procedimentosRevisao(int opcaoProcedimento){
        switch(opcaoProcedimento){
            case 1:
                System.out.println("\nExercicio 1 e 2 com Estrutura de Decisao");
                EstruturaDecisaoRevisao e = new EstruturaDecisaoRevisao();
                e.recebeNumero();
                e.numImpar();
                e.numNegativo();
                break;
            case 2:
                System.out.println("\nExercicio 3 com Estrutura de Repeticao");
                WhileRevisao w = new WhileRevisao();
                w.recebeSenha();
                break;
            case 3:
                System.out.println("\nDesafio");
                DesafioRevisao d = new DesafioRevisao();
                d.idadeDesafio();
                break;
            case 4:
                System.out.println("\nExercicio com Matriz");
                MatrizRevisao m = new MatrizRevisao();
                m.recebeNotas();
                m.exibeNotas();
                break;
            case 5:
                System.out.println("\nExercicio com Vetor");
                VetorRevisao v = new VetorRevisao();
                v.outVetor();
                break;
            default:
                System.out.println("\nOPCAO INVALIDA, PROGRAMA ENCERRADO!");
        }
    }
}
