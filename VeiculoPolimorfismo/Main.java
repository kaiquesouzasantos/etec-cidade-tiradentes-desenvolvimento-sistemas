package VeiculoPolimorfismo;
import VeiculoPolimorfismo.Entidades.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        int continua;

        do{
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("[1] - CARRO\n[2] - MOTOCICLETA\n\nDIGITE O TIPO DE VEICULO: "));
            if(opcao != 1 && opcao != 2){System.exit(0);}

            String modelo = JOptionPane.showInputDialog("DIGITE O MODELO: ");
            String cor = JOptionPane.showInputDialog("DIGITE A COR: ");
            String combustivel = JOptionPane.showInputDialog("DIGITE O TIPO DE COMBUSTIVEL: ");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR: R$"));

            if(opcao == 1){
                veiculos.add(new Carro(modelo,cor,combustivel,valor));
            }else {
                veiculos.add(new Motocicleta(modelo,cor,combustivel,valor));
            }

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR CADASTRANDO VEICULOS?");
        }while (continua == JOptionPane.YES_NO_OPTION);

        executaParticularidades(veiculos);
    }

    public static void executaParticularidades(List<? extends Veiculo> veiculos){
        for(Veiculo veiculo:veiculos){
            System.out.println("--------------------------------------------------------------------------");
            System.out.println(veiculo);
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
