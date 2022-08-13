package Funcionario;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Funcionario[] listaFuncionaios = new Funcionario[]{new Funcionario("Pedro"), new Funcionario("Vagner")};

        for(Funcionario funcionario:listaFuncionaios){
            funcionario.salarioBruto = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "DIGITE SEU SALARIO BRUTO: R$", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));
            funcionario.imposto = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "DIGITE A PORCENTAGEM DO IMPOSTO APLICADO: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));

            JOptionPane.showMessageDialog(null, funcionario, "FUNCIONARIO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
