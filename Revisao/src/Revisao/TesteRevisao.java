package Revisao;
import java.util.*;

public class TesteRevisao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\u001B[36m===============PROCEDIMENTOS POSSIVEIS===============\n" +
                "\n\u001B[33m[1] - Exercicio 1 e 2 com Estrutura de Decisao" +
                "\n[2] - Exercicio 3 com Estrutura de Repeticao" +
                "\n[3] - Desafio" +
                "\n[4] - Exercicio com Matriz" +
                "\n[5] - Exercicio com Vetor" +
                "\n\n\u001B[31mQual procedimento deseja realizar: ");
        int opcaoProcedimento = in.nextInt();

        if(opcaoProcedimento == 1) {
            System.out.println("\n\u001B[36mExercicio 1 e 2 com Estrutura de Decisao");
            new EstruturaDecisaoRevisao();
        }else if(opcaoProcedimento == 2) {
            System.out.println("\n\u001B[36mExercicio 3 com Estrutura de Repeticao");
            WhileRevisao w = new WhileRevisao();
            w.whileSenha();
        }else if(opcaoProcedimento == 3) {
            System.out.println("\n\u001B[36mDesafio");
            DesafioRevisao d = new DesafioRevisao();
            d.idadeDesafio();
        }else if(opcaoProcedimento == 4) {
            System.out.println("\n\u001B[36mExercicio com Matriz");
            MatrizRevisao m = new MatrizRevisao();
            m.matriz();
        }else if(opcaoProcedimento == 5) {
            System.out.println("\n\u001B[36mExercicio com Vetor");
            VetorRevisao v = new VetorRevisao();
            v.outVetor();
        }else{
            System.out.println("\033[0m\nOPCAO INVALIDA, PROGRAMA ENCERRADO!");
        }
    }
}
