package ContaInterface.Entidades;

import ContaInterface.Interface.Tributacao;

public class ContaPoupanca extends Conta {
    private final double rendimento = 9;

    public ContaPoupanca(){}
    public ContaPoupanca(double saldoConta, int agenciaConta, int numConta, int senha, String titularConta, String cpf) {
        super(saldoConta, agenciaConta, numConta, senha, titularConta, cpf);
    }

    private void calculaRendimento(){
        setSaldoConta(getSaldoConta() + (getSaldoConta()*(rendimento/100)));
    }

    public double tributacao(){
        Tributacao<Double> tributo = valor -> valor * 0.01;
        return tributo.calcularImposto(getSaldoConta());
    }

    @Override
    public String depositar(double depositoValor) {
        setSaldoConta(getSaldoConta() + depositoValor);
        calculaRendimento();
        return  "--------------------------------------------------------------------------\n" +
                "DEPOSITO CONCLUIDO COM SUCESSO" +
                "\n--------------------------------------------------------------------------";
    }

    @Override
    public String toString() {
        return  "TITULAR: "+getTitularConta()+
                "\nCPF: "+getCpf()+
                "\nAGENCIA: "+getAgenciaConta()+
                "\nCONTA: "+getNumConta()+
                "\nSALDO: R$"+getSaldoConta()+
                "\nRENDIMENTO APLICADO: "+rendimento+"%"+
                "\nIMPOSTO: R$"+tributacao();

    }
}