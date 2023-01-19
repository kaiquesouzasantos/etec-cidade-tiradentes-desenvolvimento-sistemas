package ContaPolimorfismoRefatorada.Controller;
import ContaPolimorfismoRefatorada.Entidades.*;
import ContaPolimorfismoRefatorada.Factory.FactoryGeneric;
import ContaPolimorfismoRefatorada.Pattern.Pattern;
import javax.swing.*;

public class HomeController {
    private final Lucros lucros = new Lucros();

    public void cadastraContas(){
        int continua;
        Object[] opcoes = {"NENHUM", "CONTA POUPANCA", "CONTA CORRENTE"};

        do{
            Object opcao = JOptionPane.showInputDialog(
                    null, "SELECIONE O TIPO DE CONTA: ",
                            "MENU", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if(!opcao.equals("NENHUM"))
                recebeInformacoesConta(opcao);

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR? ");
        } while(continua == JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(
                null, lucros.getRelatorio(), "RELATORIO", JOptionPane.INFORMATION_MESSAGE);
    }

    private void recebeInformacoesConta(Object opcao){
        String titular = JOptionPane.showInputDialog(null, "DIGITE O TITULAR: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
        String cpf = JOptionPane.showInputDialog(null, "DIGITE O SEU CPF: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
        int senha = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE UMA SENHA NUMERICA DE 4 DIGITOS: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE));

        if(Pattern.verificaCPF(cpf) && Pattern.verificaTitular(titular) && Pattern.verificaSenha(senha)){
            Object[] operacoes = {"NENHUM","SAQUE", "DEPOSITO"};

            Object operacao = JOptionPane.showInputDialog(null, "SELECIONE A OPERA플O: ", "OPERA플O", JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);

            if(!operacao.equals("NENHUM")){
                double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "VALOR: R$", "OPERA플O", JOptionPane.QUESTION_MESSAGE));

                registraConta(
                        FactoryGeneric.criaObjetoConta(opcao),
                        titular, senha, cpf, operacao, valor
                );
            }
        }else{
            JOptionPane.showMessageDialog(null, "INFORMACAOS INVALIDAS, CADASTRO DESCONTINUADO!", "CADASTRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registraConta(
            Conta contaGenerica, String titular, int senha, String cpf,
            Object operacao, double valor
    ){
        if (contaGenerica instanceof ContaCorrente) {
            ContaCorrente contaCorrente = FactoryGeneric.retornaContaCorrente(senha, titular, cpf);
            executaOperacao(contaCorrente, operacao, valor);
        } else {
            ContaPoupanca contaPoupanca = FactoryGeneric.retornaContaPoupanca(senha, titular, cpf);
            executaOperacao(contaPoupanca, operacao, valor);
        }
    }

    private void executaOperacao(Conta conta, Object operacao, double valor){
        if(operacao.equals("SAQUE"))
            JOptionPane.showMessageDialog(null, conta.sacar(valor), "OPERA플O", JOptionPane.INFORMATION_MESSAGE);
        else if (operacao.equals("DEPOSITO"))
            JOptionPane.showMessageDialog(null, conta.depositar(valor), "OPERA플O", JOptionPane.INFORMATION_MESSAGE);

        exibeInformacoesConta(conta);
        atualizaMetricas(conta);
    }

    private void atualizaMetricas(Conta conta){
        lucros.add(conta);
    }

    private void exibeInformacoesConta(Conta conta){
        JOptionPane.showMessageDialog(null, conta, "INFORMA함ES DA CONTA", JOptionPane.INFORMATION_MESSAGE);
    }
}