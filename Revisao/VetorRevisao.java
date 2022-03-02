package Revisao;

public class VetorRevisao {
    private final int vetor[] = {3,2,8,7,5,4};

    public void outVetor(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Na posicao "+i+" teremos o valor "+vetor[i]);
        }
    }
}
