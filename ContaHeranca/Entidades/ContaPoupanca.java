package ContaHeranca.Entidades;

public class ContaPoupanca extends Conta {
    private final double rendimento = 12;

    public ContaPoupanca(int agenciaConta, int numConta, String titularConta){
        super(agenciaConta, numConta, titularConta);
    }

    public void calculaRendimento(){
        setSaldoConta(getSaldoConta() + (getSaldoConta()*(rendimento/100)));
    }

    @Override
    public String informacoes(){
        return "TITULAR: "+getTitularConta()+"\nAGENCIA: "+getAgenciaConta()+"\nCONTA: "+getNumConta()+"\nSALDO: R$"+getSaldoConta()+"\nRENDIMENTO APLICADO: "+rendimento+"%";
    }
}
