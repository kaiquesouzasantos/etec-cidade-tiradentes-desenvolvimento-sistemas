package ContaPolimorfismoRefatorada.Entidades;

public abstract class Conta {
    private double saldoConta;
    private int agenciaConta, numConta, senha;
    private String titularConta, cpf;

    public Conta() {}
    public Conta(double saldoConta, int agenciaConta, int numConta, int senha, String titularConta, String cpf) {
        this.saldoConta = saldoConta;
        this.agenciaConta = agenciaConta;
        this.numConta = numConta;
        this.senha = senha;
        this.titularConta = titularConta;
        this.cpf = cpf;
    }

    // GET's
    public double getSaldoConta() {return saldoConta;}
    public int getAgenciaConta() {return agenciaConta;}
    public int getNumConta() {return numConta;}
    public String getTitularConta() {return titularConta;}
    public int getSenha() {return senha;}
    public String getCpf() {return cpf;}

    // SET's
    public void setSenha(int senha) {this.senha = senha;}
    public void setTitularConta(String titularConta){this.titularConta = titularConta;}
    public void setSaldoConta(double saldoConta) {this.saldoConta = saldoConta;}
    public void setAgenciaConta(int agenciaConta) {this.agenciaConta = agenciaConta;}
    public void setNumConta(int numConta) {this.numConta = numConta;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String depositar(double depositoValor) {
        this.saldoConta += depositoValor;
        return  "--------------------------------------------------------------------------\n" +
                "DEPOSITO CONCLUIDO COM SUCESSO" +
                "\n--------------------------------------------------------------------------";
    }

    public String sacar(double saqueValor) {
        if(saqueValor <= this.saldoConta) {
            this.saldoConta -= saqueValor;
            return  "--------------------------------------------------------------------------\n" +
                    "SAQUE CONCLUIDO COM SUCESSO" +
                    "\n--------------------------------------------------------------------------";
        }
        return  "--------------------------------------------------------------------------\n" +
                "VALOR INDISPONIVEL" +
                "\n--------------------------------------------------------------------------";
    }

    @Override
    public String toString() {
        return "TITULAR: "+titularConta+
                "\nCPF: "+cpf+
                "\nAGENCIA: "+agenciaConta+
                "\nCONTA: "+numConta+
                "\nSALDO: R$"+saldoConta;
    }
}
