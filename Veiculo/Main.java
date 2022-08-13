package Veiculo;
import Veiculo.Entidades.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                null, "[1] - CARRO  |  [2] - MOTOCICLETA  |  [3] - CAMINHAO\n\nDIGITE O QUE DESEJA CADASTRAR: ",
                "MENU", JOptionPane.INFORMATION_MESSAGE
        ));

        if(opcao != 1 && opcao != 2 && opcao != 3){
            JOptionPane.showMessageDialog(
                    null, "OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String modelo = JOptionPane.showInputDialog(
                null,"DIGITE O MODELO: ", "INFORMACAO", JOptionPane.INFORMATION_MESSAGE);
        String marca = JOptionPane.showInputDialog(
                null, "DIGITE A MARCA: ", "INFORMACAO", JOptionPane.INFORMATION_MESSAGE);

        if(opcao == 1 || opcao == 2){
            String cor = JOptionPane.showInputDialog(
                    null, "DIGITE A COR: ", "INFORMACAO", JOptionPane.INFORMATION_MESSAGE);

            if(opcao == 1) apresentaVeiculo(new Carro(modelo, marca, cor));
            else apresentaVeiculo(new Moto(modelo, marca, cor));
        }else{
            int potencia = Integer.parseInt(JOptionPane.showInputDialog(
                    null,"DIGITE A POTENCIA: ", "INFORMACAO", JOptionPane.INFORMATION_MESSAGE));
            apresentaVeiculo(new Caminhao(modelo, marca, potencia));
        }
    }

    public static void apresentaVeiculo(Object veiculo){
        JOptionPane.showMessageDialog(null, veiculo, "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
    }
}