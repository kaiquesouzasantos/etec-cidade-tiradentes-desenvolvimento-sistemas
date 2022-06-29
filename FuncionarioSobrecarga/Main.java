package FuncionarioSobrecarga;
import javax.swing.*;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        String nome = JOptionPane.showInputDialog("Digite o Nome: ");
        funcionario.setNome(nome);
        // funcionario.setNome(nome, true);
        // funcionario.setNome(nome, false);
        // funcionario.setNome(nome, "");
        // funcionario.setNome(nome, true, "");
        // funcionario.setNome(nome, false, "");

        funcionario.setCpf(JOptionPane.showInputDialog("Digite o CPF: "));
        funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Salario: ")));

        JOptionPane.showMessageDialog(null,
                "Nome: "+funcionario.getNome()+
                "\n"+"CPF: "+funcionario.getCpf()+
                "\n"+"Salario BR: "+funcionario.getSalario()+
                "\n"+"Salario USA: "+funcionario.getSalario("US")
        );
    }
}
