package ContaPolimorfismo.Controller;
import ContaPolimorfismo.Entidades.*;
import ContaPolimorfismo.Pattern.Pattern;
import javax.swing.*;

public class HomeController {
    private final Lucros lucros = new Lucros();

    // cadastraContas > recebeInformacoesConta > registraConta(criaObjetoConta - geraNumAgenciaConta) > executaOperacao
    public void cadastraContas(){
        int continua;

        do{
            int opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null, "[1] - CONTA POUPANCA\n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DE CONTA: ",
                            "MENU", JOptionPane.QUESTION_MESSAGE));

            if(opcao != 1 && opcao != 2)
                JOptionPane.showMessageDialog(
                        null, "OPCAO INVALIDA, CADASTRO DESCONTINUADO!", "MENU", JOptionPane.ERROR_MESSAGE);
            else
                recebeInformacoesConta(opcao);

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR? ");
        } while(continua == JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(
                null, lucros.getRelatorio(), "RELATORIO", JOptionPane.INFORMATION_MESSAGE);
    }

    private void recebeInformacoesConta(int opcao){
        String titular = JOptionPane.showInputDialog(
                null, "DIGITE O TITULAR: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
        String cpf = JOptionPane.showInputDialog(
                null, "DIGITE O SEU CPF: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE);
        int senha = Integer.parseInt(JOptionPane.showInputDialog(
                null, "DIGITE UMA SENHA NUMERICA DE 4 DIGITOS: ", "CADASTRO", JOptionPane.QUESTION_MESSAGE));

        if(verificaCPF(cpf) && verificaTitular(titular) && verificaSenha(senha)){
            String operacao = JOptionPane.showInputDialog(
                    null, "[SC] - SAQUE\n[DP] - DEPOSITO\n\nDIGITE A OPERA플O: ", "OPERA플O", JOptionPane.QUESTION_MESSAGE);
            double valor = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "VALOR: R$", "OPERA플O", JOptionPane.QUESTION_MESSAGE));

            registraConta(
                    criaObjetoConta(opcao),
                    titular, senha, cpf, operacao, valor
            );
        }else{
            JOptionPane.showMessageDialog(
                    null, "INFORMACAOS INVALIDAS, CADASTRO DESCONTINUADO!", "CADASTRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registraConta(
            Conta conta, String titular, int senha, String cpf,
            String operacao, double valor
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

    private void executaOperacao(Conta conta, String operacao, double valor){
        if(operacao.equalsIgnoreCase("SC"))
            JOptionPane.showMessageDialog(
                    null, conta.sacar(valor), "OPERA플O", JOptionPane.INFORMATION_MESSAGE);
        else if (operacao.equalsIgnoreCase("DP"))
            JOptionPane.showMessageDialog(
                    null, conta.depositar(valor), "OPERA플O", JOptionPane.INFORMATION_MESSAGE);
    }

    private Conta criaObjetoConta(int opcao){
        if(opcao == 1)
            return new ContaPoupanca();
        return new ContaCorrente();
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