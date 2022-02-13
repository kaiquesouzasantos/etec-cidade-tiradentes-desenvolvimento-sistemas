package Revisao;
import java.util.*;

public class Revisao {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("\u001B[36m=============== PROCEDIMENTOS POSSIVEIS ===============" +
                "\n\u001B[33m[1] - Exercicio 1 e 2 com Estrutura de Decisao" +
                "\n[2] - Exercicio 3 com Estrutura de Repeticao" +
                "\n[3] - Desafio" +
                "\n[4] - Exercicio com Matriz" +
                "\n[5] - Exercicio com Vetor" +
                "\n\n\u001B[31mQual procedimento deseja realizar: ");
        int opcaoProcedimento = in.nextInt();
        procedimentosRevisao(opcaoProcedimento);
    }

    public static void procedimentosRevisao(int opcaoProcedimento){
        switch(opcaoProcedimento){
            case 1:
                System.out.println("\n\u001B[36mExercicio 1 e 2 com Estrutura de Decisao");
                EstruturaDecisaoRevisao e = new EstruturaDecisaoRevisao();
                e.recebeNumero();
                e.numImpar();
                e.numNegativo();
                break;
            case 2:
                System.out.println("\n\u001B[36mExercicio 3 com Estrutura de Repeticao");
                WhileRevisao w = new WhileRevisao();
                w.recebeSenha();
                break;
            case 3:
                System.out.println("\n\u001B[36mDesafio");
                DesafioRevisao d = new DesafioRevisao();
                d.idadeDesafio();
                break;
            case 4:
                System.out.println("\n\u001B[36mExercicio com Matriz");
                MatrizRevisao m = new MatrizRevisao();
                m.recebeNotas();
                m.exibeNotas();
                break;
            case 5:
                System.out.println("\n\u001B[36mExercicio com Vetor");
                VetorRevisao v = new VetorRevisao();
                v.outVetor();
                break;
            default:
                System.out.println("\033[0m\nOPCAO INVALIDA, PROGRAMA ENCERRADO!");
        }
    }
}
