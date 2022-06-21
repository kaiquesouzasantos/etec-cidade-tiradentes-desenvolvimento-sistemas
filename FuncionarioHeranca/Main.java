package FuncionarioHeranca;
import FuncionarioHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome(JOptionPane.showInputDialog("DIGITE SEU NOME: "));
        gerente.setCpf(JOptionPane.showInputDialog("DIGITE SEU CPF: "));
        gerente.setSalario(Double.parseDouble(JOptionPane.showInputDialog("DIGITE SEU SALARIO: R$")));

        int senha = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A SENHA: "));
        gerente.setSenha(12345);

        if(gerente.autenticaSenha(senha)){
            JOptionPane.showMessageDialog(null, "VALOR COMISSAO: R$"+gerente.valorComissao());
        }
    }
}