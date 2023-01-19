package Veiculo;
import Veiculo.Entidades.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args){
        int opcao = Integer.parseInt(exibePerguntaRecebeResposta("[1] - CARRO  |  [2] - MOTOCICLETA  |  [3] - CAMINHAO\n\nDIGITE O QUE DESEJA CADASTRAR: "));

        if(opcao != 1 && opcao != 2 && opcao != 3){
            exibeMensagem("OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String modelo = exibePerguntaRecebeResposta("DIGITE O MODELO: ");
        String marca = exibePerguntaRecebeResposta("DIGITE A MARCA: ");

        if(opcao == 1 || opcao == 2){
            String cor = exibePerguntaRecebeResposta("DIGITE A COR: ");

            if(opcao == 1)
                exibeMensagem(new Carro(modelo, marca, cor).toString(), "REGISTRO");
            else
                exibeMensagem(new Moto(modelo, marca, cor).toString(), "REGISTRO");
        }else{
            int potencia = Integer.parseInt(exibePerguntaRecebeResposta("DIGITE A POTENCIA: "));

            exibeMensagem(new Caminhao(modelo, marca, potencia).toString(), "REGISTRO");
        }
    }

    public static String exibePerguntaRecebeResposta(String message){
        return JOptionPane.showInputDialog(null, message,"INFORMACAO", JOptionPane.QUESTION_MESSAGE);
    }

    private static void exibeMensagem(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exibeMensagem(String message, String title, int option){
        JOptionPane.showMessageDialog(null, message, title, option);
    }
}
