package FuncionarioHeranca;
import FuncionarioHeranca.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int tipoFuncionario = Integer.parseInt(exibePerguntaRecebeResposta("[1] - FUNCIONARIO\n[2] - GERENTE\n\nDIGITE O TIPO DE CONTA: "));

        if(tipoFuncionario != 1 && tipoFuncionario != 2){
            exibeMensagem("OPCAO INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        String nomeFuncionario = exibePerguntaRecebeResposta("DIGITE SEU NOME: ");
        String cpfFuncionario = exibePerguntaRecebeResposta("DIGITE SEU CPF: ");
        double salarioFuncionario = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE SEU SALARIO: R$"));

        if(tipoFuncionario == 1){
            exibeMensagem(
                    "VALOR COMISSAO: R$" + new Funcionario(nomeFuncionario, cpfFuncionario, salarioFuncionario).valorComissao(),
                    "COMISSAO"
            );

        }else{
            Gerente gerente = new Gerente(nomeFuncionario, cpfFuncionario, salarioFuncionario);

            int senha = Integer.parseInt(exibePerguntaRecebeResposta("DIGITE A SENHA: "));
            gerente.setSenha(12345);

            if(gerente.autenticaSenha(senha))
                exibeMensagem(
                        "VALOR COMISSAO: R$"+gerente.valorComissao(), "COMISSAO"
                );
            else {
                exibeMensagem("SENHA INCORRETA!", "AVISO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static String exibePerguntaRecebeResposta(String message){
        return JOptionPane.showInputDialog(null, message, "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
    }

    public static void exibeMensagem(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void exibeMensagem(String message, String title, int option){
        JOptionPane.showMessageDialog(null, message, title, option);
    }
}