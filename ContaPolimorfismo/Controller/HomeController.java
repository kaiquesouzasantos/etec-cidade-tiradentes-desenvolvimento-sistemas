package ContaPolimorfismo.Controller;
import ContaPolimorfismo.Entidades.*;
import ContaPolimorfismo.Pattern.Pattern;
import javax.swing.*;

public class HomeController {
    private final Lucros lucros = new Lucros();

    // cadastraContas > recebeInformacoesConta > registraConta(criaObjetoConta - geraNumAgenciaConta) > executaOperacao
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
        String titular = JOptionPane.showInputDialog(
                null, "DIGITE O TITULAR: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
        String cpf = JOptionPane.showInputDialog(
                null, "DIGITE O SEU CPF: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
        int senha = Integer.parseInt(JOptionPane.showInputDialog(
                null, "DIGITE UMA SENHA NUMERICA DE 4 DIGITOS: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE));

        if(verificaCPF(cpf) && verificaTitular(titular) && verificaSenha(senha)){
            Object[] operacoes = {"NENHUM","SAQUE", "DEPOSITO"};

            Object operacao = JOptionPane.showInputDialog(
                    null, "SELECIONE A OPERA플O: ", "OPERA플O",
                    JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);

            if(!operacao.equals("NENHUM")){
                double valor = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "VALOR: R$", "OPERA플O", JOptionPane.QUESTION_MESSAGE));

                registraConta(
                        criaObjetoConta(opcao),
                        titular, senha, cpf, operacao, valor
                );
            }
        }else{
            JOptionPane.showMessageDialog(
                    null, "INFORMACAOS INVALIDAS, CADASTRO DESCONTINUADO!", "CADASTRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registraConta(
            Conta conta, String titular, int senha, String cpf,
            Object operacao, double valor
    ){
        conta.setAgenciaConta(geraNumAgenciaConta(100000));
        conta.setNumConta(geraNumAgenciaConta(1000000000));
        conta.setTitularConta(titular);
        conta.setSenha(senha);
        conta.setCpf(cpf);
        conta.setSaldoConta(200);

        if (conta instanceof ContaCorrente)
            ((ContaCorrente) conta).setLimite(1000);

        executaOperacao(conta, operacao, valor);

        JOptionPane.showMessageDialog(
                null, conta, "INFORMA함ES DA CONTA", JOptionPane.INFORMATION_MESSAGE);

        lucros.add(conta);
    }

    private void executaOperacao(Conta conta, Object operacao, double valor){
        if(operacao.equals("SAQUE"))
            JOptionPane.showMessageDialog(
                    null, conta.sacar(valor), "OPERA플O", JOptionPane.INFORMATION_MESSAGE);
        else if (operacao.equals("DEPOSITO"))
            JOptionPane.showMessageDialog(
                    null, conta.depositar(valor), "OPERA플O", JOptionPane.INFORMATION_MESSAGE);
    }

    private Conta criaObjetoConta(Object opcao){
        if(opcao.equals("CONTA POUPANCA"))
            return new ContaPoupanca();
        else if(opcao.equals("CONTA CORRENTE"))
            return new ContaCorrente();
        return null;
    }

    private int geraNumAgenciaConta(int digitos){
        return (int) (Math.random() * digitos);
    }

    private boolean verificaCPF(String cpf){
        return new Pattern().verificaCPF(cpf);
    }

    private boolean verificaTitular(String titular){
        return new Pattern().verificaTitular(titular);
    }

    private boolean verificaSenha(int senha){
        return new Pattern().verificaSenha(senha);
    }
}