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
    public String sacar(double saqueValor) {
        if(saqueValor <= getSaldoConta()) {
            setSaldoConta(getSaldoConta() - saqueValor);
            return  "--------------------------------------------------------------------------\n" +
                    "SAQUE CONCLUIDO COM SUCESSO" +
                    "\n--------------------------------------------------------------------------";
        }else if(saqueValor <= getSaldoConta() + limite){
            saqueValor = getSaldoConta() - saqueValor;
            setSaldoConta(0);
            setLimite(getLimite() - saqueValor);
            return  "--------------------------------------------------------------------------\n" +
                    "SAQUE CONCLUIDO COM SUCESSO" +
                    "\n--------------------------------------------------------------------------";
        }
        return "--------------------------------------------------------------------------\n" +
                "VALOR INDISPONIVEL" +
                "\n--------------------------------------------------------------------------";
    }

    public String toString() {
        return  "TITULAR: "+getTitularConta()+
                "\nAGENCIA: "+getAgenciaConta()+
                "\nCONTA: "+getNumConta()+
                "\nSALDO: R$"+getSaldoConta()+
                "\nLIMITE: R$"+limite;
    }
}
