package VeiculoPolimorfismo;
import VeiculoPolimorfismo.Entidades.*;

import javax.swing.*;

public class Main {
    private static final Relatorio controller = new Relatorio();

    public static void main(String[] args) {
        run();
    }

    private static void run(){
        Object opcao = exibeMenuRecebeResposta("SELECIONE A OPERACAO: ", "MENU", new Object[]{"NENHUM", "CADASTRAR", "VISUALIZAR"});

        if(opcao.equals("CADASTRAR")){
            cadastraVeiculos();
        } else if (opcao.equals("VISUALIZAR")) {
            exibeMensagem(controller.listagemVeiculos(), "VEICULOS");
        }
    }

    private static void cadastraVeiculos(){
        int continua;

        do{
            Object opcao = exibeMenuRecebeResposta("SELECIONE O TIPO VEICULO: ", "MENU", new Object[]{"NENHUM", "CARRO", "MOTO"});

            if(!opcao.equals("CARRO") && !opcao.equals("MOTO")) {
                exibeMensagem("OPERACAO INVALIDA, CADASTRO DESCONTINUADO!", "MENU", JOptionPane.ERROR_MESSAGE);
                run();
            }else {
                cadastraVeiculo(opcao);
            }

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR CADASTRANDO VEICULOS?");
        }while (continua == JOptionPane.YES_NO_OPTION);

        run();
    }

    private static void cadastraVeiculo(Object tipo){
        String modelo = exibePerguntaRecebeResposta("DIGITE O MODELO: ");
        String cor = exibePerguntaRecebeResposta("DIGITE A COR: ");
        String combustivel = exibePerguntaRecebeResposta("DIGITE O TIPO DE COMBUSTIVEL: ");
        double valor = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE O VALOR: R$"));

        if(tipo.equals("CARRO")) {
            controller.add(new Carro(modelo, cor, combustivel, valor));
        }else {
            controller.add(new Motocicleta(modelo, cor, combustivel, valor));
        }
    }

    private static String exibePerguntaRecebeResposta(String message){
        return JOptionPane.showInputDialog(null, message, "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
    }

    private static void exibeMensagem(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void exibeMensagem(String message, String title, int option){
        JOptionPane.showMessageDialog(null, message, title, option);
    }

    private static Object exibeMenuRecebeResposta(String message, String title, Object[] opcoes) {
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }
}