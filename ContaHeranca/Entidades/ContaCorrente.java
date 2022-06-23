package ContaHeranca.Entidades;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(int agenciaConta, int numConta, String titularConta){
        super(agenciaConta, numConta, titularConta);
    }

    // LIMITE
    public double getLimite() {return limite;}
    public void setLimite(double limite) {this.limite = limite;}

    @Override
    public boolean sacar(double saqueValor) {
        if(saqueValor <= getSaldoConta()) {
            setSaldoConta(getSaldoConta() - saqueValor);
            return true;
        }else if(saqueValor <= getSaldoConta() + limite){
            saqueValor = getSaldoConta() - saqueValor;
            setSaldoConta(0);
            setLimite(getLimite() - saqueValor);
            return true;
        }
        return false;
    }

    @Override
    public String informacoes(){
        return "TITULAR: "+getTitularConta()+"\nAGENCIA: "+getAgenciaConta()+"\nCONTA: "+getNumConta()+"\nSALDO: R$"+getSaldoConta()+"\nLIMITE: R$"+limite;
    }
}
