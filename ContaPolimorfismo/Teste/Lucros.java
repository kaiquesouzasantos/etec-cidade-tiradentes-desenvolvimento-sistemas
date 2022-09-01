package ContaPolimorfismo.Teste;

import ContaPolimorfismo.Entidades.Conta;
import ContaPolimorfismo.Entidades.ContaCorrente;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Lucros {
    private final List<Conta> contas = new ArrayList<>();
    private double soma, maiorSaldo, menorSaldo, somaSaldoContaCorrente, somaSaldoContaPoupanca;
    private int contaCorrente, contPoupanca;
    private String caminhoArquivo;

    public void add(Conta conta){
        this.contas.add(conta);
    }

    public void add(List<Conta> contas){
        for(Conta conta : contas){
            add(conta);
        }
    }

    private void inicializadorIndicadores(){
        this.soma = 0;
        this.maiorSaldo = 0;
        this.menorSaldo = 0;
        this.contaCorrente = 0;
        this.contPoupanca = 0;
        this.somaSaldoContaCorrente = 0;
        this.somaSaldoContaPoupanca = 0;
    }

    private void percorreContas(){
        inicializadorIndicadores();

        for(Conta conta : this.contas){
            setSoma(conta);
            quantidadeTipoConta(conta);
            extremidadeSaldos(conta);
            concentracaoSaldoTipoConta(conta);
        }
    }

    private void setSoma(Conta conta){
        this.soma += conta.getSaldoConta();
    }

    private int getMedia(){
        return (int) this.soma/this.contas.size();
    }

    private void quantidadeTipoConta(Conta conta){
        if(conta instanceof ContaCorrente)
            contaCorrente += 1;
        else
            contPoupanca += 1;
    }

    private void concentracaoSaldoTipoConta(Conta conta){
        if(conta instanceof ContaCorrente)
            somaSaldoContaCorrente += conta.getSaldoConta();
        else
            somaSaldoContaPoupanca += conta.getSaldoConta();
    }

    private void extremidadeSaldos(Conta conta){
        if(conta.equals(contas.get(0)))
            this.menorSaldo = conta.getSaldoConta();

        if(conta.getSaldoConta() >= this.maiorSaldo)
            this.maiorSaldo = conta.getSaldoConta();
        else if(conta.getSaldoConta() <= this.menorSaldo)
            this.menorSaldo = conta.getSaldoConta();
    }

    private double getSoma() {return soma;}
    private int getContaCorrente() {return contaCorrente;}
    private int getContPoupanca() {return contPoupanca;}
    private double getMaiorSaldo() {return maiorSaldo;}
    private double getMenorSaldo() {return menorSaldo;}
    public double getSomaSaldoContaCorrente() {return somaSaldoContaCorrente;}
    public double getSomaSaldoContaPoupanca() {return somaSaldoContaPoupanca;}

    public String getRelatorio(){
        if(contas.size() == 0)
            return "RELATORIO DEFAULT";
        percorreContas();
        getRelatorioArquivo();

        return  "SUMARIZACAO DOS DADOS"+
                "\n--------------------------------------------------------------------------\n"+
                "SOMA DE SALDO: R$"+getSoma()+"\n"+
                "MEDIA MONETARIA: R$"+getMedia()+"\n"+
                "MAIOR SALDO: R$"+getMaiorSaldo()+"\n"+
                "MENOR SALDO: R$"+getMenorSaldo()+
                "\n--------------------------------------------------------------------------\n"+
                "QUANTIDADE DE CADA TIPO DE CONTA\n\n"+
                "Conta Corrente: "+getContaCorrente()+"\n"+
                "Conta Poupanca: "+getContPoupanca()+
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
