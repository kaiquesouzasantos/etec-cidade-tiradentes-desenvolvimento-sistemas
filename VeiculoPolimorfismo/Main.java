package VeiculoPolimorfismo;
import VeiculoPolimorfismo.Entidades.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        int continua;

        Object[] opcoes = {"NENHUM", "CARRO", "MOTO"};

        do{
            Object opcao = JOptionPane.showInputDialog(
                    null, "SELECIONE O TIPO VEICULO: ",
                    "MENU", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
            );

            if(!opcao.equals("CARRO") && !opcao.equals("MOTO")) {
                JOptionPane.showMessageDialog(
                        null, "OPERACAO INVALIDA, CADASTRO DESCONTINUADO!", "MENU", JOptionPane.ERROR_MESSAGE);
            }else{
                String modelo = JOptionPane.showInputDialog(
                        null, "DIGITE O MODELO: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
                String cor = JOptionPane.showInputDialog(
                        null, "DIGITE A COR: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
                String combustivel = JOptionPane.showInputDialog(
                        null, "DIGITE O TIPO DE COMBUSTIVEL: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
                double valor = Double.parseDouble(JOptionPane.showInputDialog(
                        null,"DIGITE O VALOR: R$", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));

                if(opcao.equals("CARRO")){
                    veiculos.add(new Carro(modelo,cor,combustivel,valor));
                }else {
                    veiculos.add(new Motocicleta(modelo,cor,combustivel,valor));
                }
            }

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR CADASTRANDO VEICULOS?");
        }while (continua == JOptionPane.YES_NO_OPTION);

        veiculos.forEach(v -> JOptionPane.showMessageDialog(null, v, "VEICULO", JOptionPane.INFORMATION_MESSAGE));
    }
}
