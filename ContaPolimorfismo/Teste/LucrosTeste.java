package ContaPolimorfismo.Teste;
import ContaPolimorfismo.Entidades.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class LucrosTeste {
    private final List<Conta> contas = new ArrayList<>();
    private String caminhoArquivo;

    public void add(Conta conta){
        this.contas.add(conta);
    }

    public void add(List<Conta> contas){
        for(Conta conta : contas){
            add(conta);
        }
    }

    private double getSoma(){
        return contas.stream()
                .map(Conta::getSaldoConta)
                .reduce((x, y) -> x + y)
                .get();
    }

    private int getMedia(){
        return (int) getSoma()/this.contas.size();
    }

    private double getMenorSaldo(){
        return contas.stream()
                .map(Conta::getSaldoConta)
                .min(Double::compare)
                .get();
    }

    private double getMaiorSaldo(){
        return contas.stream()
                .map(Conta::getSaldoConta)
                .max(Double::compare)
                .get();
    }

    private int quantidadeContaCorrente(){
        return (int) contas.stream().filter(
                conta -> conta instanceof ContaCorrente).count();
    }

    private int quantidadeContaPoupanca(){
        return (int) contas.stream().filter(
                conta -> conta instanceof ContaPoupanca).count();
    }

    private double getSomaSaldoContaCorrente(){
        return contas.stream()
                .filter(conta -> conta instanceof ContaCorrente)
                .map(Conta::getSaldoConta)
                .reduce((x, y) -> x + y)
                .get();
    }

    private double getSomaSaldoContaPoupanca(){
        return contas.stream()
                .filter(conta -> conta instanceof ContaPoupanca)
                .map(Conta::getSaldoConta)
                .reduce((x, y) -> x + y)
                .get();
    }

    public String getRelatorio(){
        if(contas.size() == 0)
            return "RELATORIO DEFAULT";
        getRelatorioArquivo();

        return  "SUMARIZACAO DOS DADOS"+
                "\n--------------------------------------------------------------------------\n"+
                "SOMA DE SALDO: R$"+getSoma()+"\n"+
                "MEDIA MONETARIA: R$"+getMedia()+"\n"+
                "MAIOR SALDO: R$"+getMaiorSaldo()+"\n"+
                "MENOR SALDO: R$"+getMenorSaldo()+
                "\n--------------------------------------------------------------------------\n"+
                "QUANTIDADE DE CADA TIPO DE CONTA\n\n"+
                "Conta Corrente: "+quantidadeContaCorrente()+"\n"+
                "Conta Poupanca: "+quantidadeContaPoupanca()+
                "\n--------------------------------------------------------------------------\n"+
                "SOMA SALDO DE CADA TIPO DE CONTA\n\n"+
                "Conta Corrente: R$"+getSomaSaldoContaCorrente()+"\n"+
                "Conta Poupanca: R$"+getSomaSaldoContaPoupanca()+
                "\n--------------------------------------------------------------------------\n"+
                "ARQUIVO DE CONTAS DISPONIVEL EM: \n\n"+
                this.caminhoArquivo;
    }

    private String getFormataArquivoContas(Conta conta){
        return  conta.getTitularConta()+";"+
                conta.getAgenciaConta()+";"+
                conta.getNumConta()+";"+
                conta.getCpf()+";"+
                "R$"+conta.getSaldoConta();
    }

    private void getRelatorioArquivo(){
        try{
            caminhoArquivo = System.getProperty("user.home")+"\\listaContas.csv";

            FileWriter stream = new FileWriter(caminhoArquivo);
            PrintWriter print = new PrintWriter(stream);

            print.println("TITULAR;AGENCIA;CONTA;CPF;SALDO");

            for(Conta conta:this.contas){
                print.println(getFormataArquivoContas(conta));
            }

            print.close();
            stream.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
