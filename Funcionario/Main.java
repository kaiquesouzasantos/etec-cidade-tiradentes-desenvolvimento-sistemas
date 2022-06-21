package Funcionario;
import javax.swing.*;

public class Main {
    public static Funcionario Pedro = new Funcionario();
    public static Funcionario Vagner = new Funcionario();

    public static void main(String[] args) {
        for(int i = 0; i < 2; i++){
            double salario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SALARIO BRUTO: R$"));
            double imposto = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A PORCENTAGEM DO IMPOSTO APLICADO: "));

            if(i == 0) {atribuiObjeto(Pedro, "Pedro", salario, imposto);
            }else{atribuiObjeto(Vagner, "Vagner", salario, imposto);}
        }
    }

    public static void atribuiObjeto(Funcionario funcionario, String nome, double salario, double imposto){
        funcionario.nome = nome;
        funcionario.salarioBruto = salario;
        funcionario.imposto = imposto;

        JOptionPane.showInputDialog(null,
                funcionario.salarioLiquido()+
                funcionario.calcularComissao()
        );
    }
}
