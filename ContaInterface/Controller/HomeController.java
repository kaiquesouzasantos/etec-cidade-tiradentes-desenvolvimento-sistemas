package ContaInterface.Controller;
import ContaInterface.Entidades.*;
import ContaInterface.Factory.FactoryCompartilhada;
import ContaInterface.Pattern.Pattern;
import javax.swing.*;

public class HomeController {
    private final Lucros lucros = new Lucros();

    public void cadastraContas(){
        int continua;

        do{
            Object opcao = FactoryCompartilhada.exibeMenuRecebeResposta(
                    "SELECIONE O TIPO DE CONTA: ", "MENU", new Object[]{"NENHUM", "CONTA POUPANCA", "CONTA CORRENTE", "CONTA PREMIUM"}
            );

            if(!opcao.equals("NENHUM"))
                recebeInformacoesConta(opcao);

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR? ");
        } while(continua == JOptionPane.YES_NO_OPTION);

        FactoryCompartilhada.exibeMensagem(lucros.getRelatorio(), "RELATORIO");
    }

    private void recebeInformacoesConta(Object opcao){
        String titular = FactoryCompartilhada.exibePerguntaRecebeResposta("DIGITE O TITULAR: ", "CADASTRO");
        String cpf = FactoryCompartilhada.exibePerguntaRecebeResposta("DIGITE O SEU CPF: ", "CADASTRO");
        int senha = Integer.parseInt(FactoryCompartilhada.exibePerguntaRecebeResposta("DIGITE UMA SENHA DE 4 DIGITOS NUMERICOS: ", "CADASTRO"));

        if(Pattern.verificaCPF(cpf) && Pattern.verificaTitular(titular) && Pattern.verificaSenha(senha)){
            Object operacao = FactoryCompartilhada.exibeMenuRecebeResposta("SELECIONA A OPERACAO: ", "OPERACAO", new Object[]{"NENHUM","SAQUE", "DEPOSITO"});

            if(!operacao.equals("NENHUM")){
                double valor = Double.parseDouble(FactoryCompartilhada.exibePerguntaRecebeResposta("VALOR: R$", "OPERACAO"));

                registraConta(
                        FactoryCompartilhada.criaObjetoConta(opcao),
                        titular, senha, cpf, operacao, valor
                );
            }
        }else{
            FactoryCompartilhada.exibeMensagem("INFORMACAOS INVALIDAS, CADASTRO DESCONTINUADO!", "CADASTRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void registraConta(
            Conta contaGenerica, String titular, int senha, String cpf,
            Object operacao, double valor
    ){
        if (contaGenerica instanceof ContaCorrente) {
            ContaCorrente contaCorrente = FactoryCompartilhada.retornaContaCorrente(senha, titular, cpf);
            executaOperacao(contaCorrente, operacao, valor);
        } else if (contaGenerica instanceof ContaPremium) {
            ContaPremium contaPremium = FactoryCompartilhada.retornaContaPremium(senha, titular, cpf);
            executaOperacao(contaPremium, operacao, valor);
        } else {
            ContaPoupanca contaPoupanca = FactoryCompartilhada.retornaContaPoupanca(senha, titular, cpf);
            executaOperacao(contaPoupanca, operacao, valor);
        }
    }

    private void executaOperacao(Conta conta, Object operacao, double valor){
        if(operacao.equals("SAQUE"))
            FactoryCompartilhada.exibeMensagem(conta.sacar(valor), "OPERACAO");
        else if (operacao.equals("DEPOSITO"))
            FactoryCompartilhada.exibeMensagem(conta.depositar(valor), "OPERACAO");

        FactoryCompartilhada.exibeMensagem(conta.toString(), "INFORMACOES DA CONTA");
        atualizaMetricas(conta);
    }

    private void atualizaMetricas(Conta conta){
        lucros.add(conta);
    }
}