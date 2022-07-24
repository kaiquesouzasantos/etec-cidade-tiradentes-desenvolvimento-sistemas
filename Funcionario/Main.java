package Funcionario;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Funcionario[] listaFuncionaios = new Funcionario[]{new Funcionario("Pedro"), new Funcionario("Vagner")};

        for(Funcionario funcionario:listaFuncionaios){
            funcionario.salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SALARIO BRUTO: R$"));
            funcionario.imposto = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A PORCENTAGEM DO IMPOSTO APLICADO: "));

            JOptionPane.showMessageDialog(null, funcionario);
        }
    }
}
