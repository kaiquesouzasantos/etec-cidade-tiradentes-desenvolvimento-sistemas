package ContaPolimorfismoRefatorado.Entidades;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lucros {
    private final List<Conta> contas = new ArrayList<>();

    public void add(Conta conta){
        this.contas.add(conta);
    }

    public void add(List<Conta> contas){
        for(Conta conta : contas){
            add(conta);
        }
    }

    private Stream<Conta> getStreamConta(){
        return contas.stream();
    }

    private double getSoma(){
        Optional<Double> somaSaldo = getStreamConta()
                .map(Conta::getSaldoConta)
                .reduce(Double::sum);

        return somaSaldo.isPresent() ? somaSaldo.get() : 0;
    }

    private int getMedia(){
        return (int) getSoma()/this.contas.size();
    }

    private double getMenorSaldo(){
        Optional<Double> menorSaldo = getStreamConta()
                .map(Conta::getSaldoConta)
                .reduce(Double::min);

        return menorSaldo.isPresent() ? menorSaldo.get() : 0;
    }

    private double getMaiorSaldo(){
        Optional<Double> maiorSaldo = getStreamConta()
                .map(Conta::getSaldoConta)
                .reduce(Double::max);

        return maiorSaldo.isPresent() ? maiorSaldo.get() : 0;
    }

    private int quantidadeContaCorrente(){
        return (int) getStreamConta().filter(
                conta -> conta instanceof ContaCorrente).count();
    }

    private int quantidadeContaPoupanca(){
        return (int) getStreamConta().filter(
                conta -> conta instanceof ContaPoupanca).count();
    }

    private double getSomaSaldoContaCorrente(){
        Optional<Double> somaContaCorrente = getStreamConta()
                .filter(conta -> conta instanceof ContaCorrente)
                .map(Conta::getSaldoConta)
                .reduce(Double::sum);

        return somaContaCorrente.isPresent() ? somaContaCorrente.get() : 0;
    }

    private double getSomaSaldoContaPoupanca(){
        Optional<Double> somaContaPoupanca = getStreamConta()
                .filter(conta -> conta instanceof ContaPoupanca)
                .map(Conta::getSaldoConta)
                .reduce(Double::sum);

        return somaContaPoupanca.isPresent() ? somaContaPoupanca.get() : 0;
    }

    public String getRelatorio(){
        if(contas.size() == 0)
            return "RELATORIO DEFAULT";

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
                getRelatorioArquivo();
    }

    private String getFormataArquivoContas(Conta conta){
        return  conta.getTitularConta()+";"+
                conta.getAgenciaConta()+";"+
                conta.getNumConta()+";"+
                conta.getCpf()+";"+
                "R$"+conta.getSaldoConta()+"\n";
    }

    private String getRelatorioArquivo(){
        try{
            String caminhoArquivo = System.getProperty("user.home")+"\\listaContas.csv";
            PrintWriter print = new PrintWriter(new FileWriter(caminhoArquivo));

            print.println("TITULAR;AGENCIA;CONTA;CPF;SALDO");
            for(Conta conta:this.contas){
                print.print(getFormataArquivoContas(conta));
            }
            print.close();

            return caminhoArquivo;
        }catch(IOException e){
            return null;
        }
    }
}
