package Revisao;
import java.util.*;

public class WhileRevisao {
    private final Scanner in = new Scanner(System.in);
    private final int senha = 2002;
    private int opcao = 0;

    public void recebeSenha(){
        while(opcao != senha){
            System.out.print("Digite a senha: ");
            opcao = in.nextInt();

            if(opcao != senha){
                System.out.println("SENHA INCORRETA!");
            }
        }
        System.out.println("ACESSO PERMITIDO!");
    }
}
