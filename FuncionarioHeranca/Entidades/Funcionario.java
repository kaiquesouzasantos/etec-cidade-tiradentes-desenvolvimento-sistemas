package FuncionarioHeranca.Entidades;

public class Funcionario {
    private String nome, cpf;
    private double salario;

    // SET's
    public void setNome(String nome) {this.nome = nome;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setSalario(double salario) {this.salario = salario;}

    // GET's
    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public double getSalario() {return salario;}

    // VALOR COMISSAO
    public double valorComissao(){
        return this.salario * 0.1;
    }
}
