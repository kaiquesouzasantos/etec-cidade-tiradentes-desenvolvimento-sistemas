package Revisao;
import java.util.*;

public class WhileRevisao {
    private final Scanner in = new Scanner(System.in);
    private final int senha = 2002;
    private int opcao = 0;

    public void recebeSenha(){
        while(opcao != senha){
            System.out.print("\u001B[31mDigite a senha: ");
            opcao = in.nextInt();

            if(opcao != senha){
                System.out.println("\u001B[35mSENHA INCORRETA!");
            }
        }
        System.out.println("\u001B[32mACESSO PERMITIDO!");
    }
}
