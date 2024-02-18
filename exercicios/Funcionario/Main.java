package Funcionario;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Funcionario[] listaFuncionaios = new Funcionario[]{new Funcionario("Pedro"), new Funcionario("Vagner")};

        for(Funcionario funcionario:listaFuncionaios){
            funcionario.salarioBruto = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE SEU SALARIO BRUTO: R$"));
            funcionario.imposto = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE A PORCENTAGEM DO IMPOSTO APLICADO: "));

            JOptionPane.showMessageDialog(null, funcionario, "FUNCIONARIO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static String exibePerguntaRecebeResposta(String message){
        return JOptionPane.showInputDialog(null, message, "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
    }
}
