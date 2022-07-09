package FuncionarioHeranca;
import FuncionarioHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int tipoFuncionario = Integer.parseInt(JOptionPane.showInputDialog("[1] - FUNCIONARIO\n[2] - GERENTE\n\nDIGITE O TIPO DE CONTA: "));
        if(tipoFuncionario != 1 && tipoFuncionario != 2){System.exit(0);}

        String nomeFuncionario = JOptionPane.showInputDialog("DIGITE SEU NOME: ");
        String cpfFuncionario = JOptionPane.showInputDialog("DIGITE SEU CPF: ");
        double salarioFuncionario = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SALARIO: R$"));

        if(tipoFuncionario == 1){
            Funcionario funcionario = new Funcionario(nomeFuncionario, cpfFuncionario, salarioFuncionario);
            JOptionPane.showMessageDialog(null, "VALOR COMISSAO: R$"+funcionario.valorComissao());

        }else{
            Gerente gerente = new Gerente(nomeFuncionario, cpfFuncionario, salarioFuncionario);

            int senha = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A SENHA: "));
            gerente.setSenha(12345);

            if(gerente.autenticaSenha(senha)){
                JOptionPane.showMessageDialog(null, "VALOR COMISSAO: R$"+gerente.valorComissao());
            }
        }
    }
}
