package Revisao;

public class VetorRevisao {
    private final int vetor[] = {3,2,8,7,5,4};

    public void outVetor(){
        for(int i = 0; i < vetor.length; i++){
            System.out.println("\u001B[34mNa posicao \u001B[32m"+i+"\u001B[34m teremos o valor \u001B[36m"+vetor[i]);
        }
    }
}
