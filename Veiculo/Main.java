package Veiculo;
import Veiculo.Entidades.*;
import javax.swing.*;

public class Main{
    public static void main(String[] args){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - CARRO  |  [2] - MOTOCICLETA  |  [3] - CAMINHAO\n\nDIGITE O QUE DESEJA CADASTRAR: "));

        if(opcao != 1 && opcao != 2 && opcao != 3) System.exit(0);

        String modelo = JOptionPane.showInputDialog("DIGITE O MODELO: ");
        String marca = JOptionPane.showInputDialog("DIGITE A MARCA: ");

        if(opcao == 1 || opcao == 2){
            String cor = JOptionPane.showInputDialog("DIGITE A COR: ");

            if(opcao == 1) apresentaVeiculo(new Carro(modelo, marca, cor));
            else apresentaVeiculo(new Moto(modelo, marca, cor));
        }else{
            int potencia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A POTENCIA: "));
            apresentaVeiculo(new Caminhao(modelo, marca, potencia));
        }
    }

    public static void apresentaVeiculo(Object veiculo){
        JOptionPane.showMessageDialog(null, veiculo);
    }
}