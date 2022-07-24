package ContaHeranca.Entidades;

public abstract class Conta {
    private double saldoConta;
    private int agenciaConta, numConta;
    private String titularConta;

    public Conta(int agenciaConta, int numConta, String titularConta){
        this.agenciaConta = agenciaConta;
        this.numConta = numConta;
        this.titularConta = titularConta;
    }

    // GET's
    public double getSaldoConta() {return saldoConta;}
    public int getAgenciaConta() {return agenciaConta;}
    public int getNumConta() {return numConta;}
    public String getTitularConta() {return titularConta;}

    // SET's
    public void setTitularConta(String titularConta){this.titularConta = titularConta;}
    public void setSaldoConta(double saldoConta) {this.saldoConta = saldoConta;}
    public void setAgenciaConta(int agenciaConta) {this.agenciaConta = agenciaConta;}
    public void setNumConta(int numConta) {this.numConta = numConta;}

    public void depositar(double depositoValor) {
        this.saldoConta += depositoValor;
    }

    public boolean sacar(double saqueValor) {
        if(saqueValor <= this.saldoConta) {
            this.saldoConta -= saqueValor;
            return true;
        }
        return false;
    }

    public String informacoes(){
        return "TITULAR: "+titularConta+"\nAGENCIA: "+agenciaConta+"\nCONTA: "+numConta+"\nSALDO: R$"+saldoConta;
    }
}
