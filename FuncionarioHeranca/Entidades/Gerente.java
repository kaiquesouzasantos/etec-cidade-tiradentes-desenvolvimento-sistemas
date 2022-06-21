package FuncionarioHeranca.Entidades;

public class Gerente extends Funcionario {
    private int senha;

    public int getSenha() {return senha;}
    public void setSenha(int senha) {this.senha = senha;}

    public boolean autenticaSenha(int senha){
        return this.senha == senha;
    }

    @Override
    public double valorComissao(){
        return getSalario() * 0.15;
    }
}
