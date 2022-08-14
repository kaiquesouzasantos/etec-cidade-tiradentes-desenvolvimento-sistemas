package ContaPolimorfismo.Entidades;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(){}
    public ContaCorrente(double saldoConta, int agenciaConta, int numConta, int senha, String titularConta, String cpf) {
        super(saldoConta, agenciaConta, numConta, senha, titularConta, cpf);
    }

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
                "\nCPF: "+getCpf()+
                "\nAGENCIA: "+getAgenciaConta()+
                "\nCONTA: "+getNumConta()+
                "\nSALDO: R$"+getSaldoConta()+
                "\nLIMITE: R$"+limite;
    }
}
