package VeiculoPolimorfismo;
import VeiculoPolimorfismo.Entidades.*;
import VeiculoPolimorfismo.Controller.*;
import javax.swing.*;

public class Main {
    private static final Controller controller = new Controller();

    public static void main(String[] args) {
        run();
    }

    private static void run(){
        Object[] opcoes = {"NENHUM", "CADASTRAR", "VISUALIZAR"};

        Object opcao = JOptionPane.showInputDialog(
                null, "SELECIONE A OPERACAO: ",
                "MENU", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]
        );

        if(opcao.equals("CADASTRAR")){
            cadastrarVeiculos();
        } else if (opcao.equals("VISUALIZAR")) {
            JOptionPane.showMessageDialog(
                    null, controller.listagemVeiculos(), "VEICULOS", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void cadastrarVeiculos(){
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
                run();
            }else {
                cadastraVeiculo(opcao);
            }

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR CADASTRANDO VEICULOS?");
        }while (continua == JOptionPane.YES_NO_OPTION);

        run();
    }

    private static void cadastraVeiculo(Object tipo){
        String modelo = JOptionPane.showInputDialog(
                null, "DIGITE O MODELO: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
        String cor = JOptionPane.showInputDialog(
                null, "DIGITE A COR: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
        String combustivel = JOptionPane.showInputDialog(
                null, "DIGITE O TIPO DE COMBUSTIVEL: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
        double valor = Double.parseDouble(JOptionPane.showInputDialog(
                null,"DIGITE O VALOR: R$", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));

        if(tipo.equals("CARRO")) {
            controller.add(new Carro(modelo, cor, combustivel, valor));
        }else {
            controller.add(new Motocicleta(modelo, cor, combustivel, valor));
        }
    }
}
