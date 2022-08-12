package ContaPolimorfismo.Controller;
import ContaPolimorfismo.Entidades.*;
import javax.swing.*;
import java.util.Map;

public class HomeController {
    private Lucros lucros = new Lucros();

    public void cadastraContas(){
        int continua;

        do{
            cadastraConta();
            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR? ");
        } while(continua == JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null, getRelatorio());
    }

    private void cadastraConta(){
        int opcao = Integer.parseInt(
                JOptionPane.showInputDialog("[1] - CONTA POUPANCA\n[2] - CONTA CORRENTE\n\nDIGITE O TIPO DE CONTA: ")
        );
        if(opcao != 1 && opcao != 2) System.exit(0);

        String titular = JOptionPane.showInputDialog("DIGITE O TITULAR: ");
        int numAgencia = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA AGENCIA: "));
        int numConta = Integer.parseInt(JOptionPane.showInputDialog("NUMERO DA CONTA: "));

        String operacao = JOptionPane.showInputDialog("[SC] - SAQUE\n[DP] - DEPOSITO\n\nDIGITE A OPERAÇÃO: ");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("VALOR: R$"));

        if(opcao == 1)
            executaConta(new ContaPoupanca(numAgencia, numConta, titular), operacao, valor);
        else
            executaConta(new ContaCorrente(numAgencia, numConta, titular), operacao, valor);
    }

    private String executaConta(Conta conta, String operacao, double valor){
        lucros.add(conta);

        conta.setSaldoConta(200);
        if (conta instanceof ContaCorrente)
            ((ContaCorrente) conta).setLimite(1000);

        if(operacao.equalsIgnoreCase("SC"))
            return conta.sacar(valor);
        else if (operacao.equalsIgnoreCase("DP"))
            return conta.depositar(valor);
        return "-------------------------------------\nOPERACAO INEXISTENTE\n-------------------------------------";
    }

    public String getRelatorio(){
        String tipoConta = "";

        for(Map.Entry<String, Integer> conta:lucros.quantidadeTipoConta().entrySet()){
            tipoConta += conta.getKey()+" : "+conta.getValue()+"\n";
        }

        return
                "SUMARIZACAO DOS DADOS\n\n"+
                "SOMA DE SALDO: R$"+lucros.getSoma()+"\n"+
                "MEDIA MONETARIA: R$"+lucros.getMedia()+"\n"+
                "QUANTIDADE DE CADA TIPO DE CONTA\n"+tipoConta;
    }
}
