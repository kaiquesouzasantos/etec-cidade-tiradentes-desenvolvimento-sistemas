package ClienteHeranca;

public class Cliente {
    private String nome, endereco;
    private int idade;
    private double valorPedido, desconto;

    // SET'S
    public void setNome(String nome) {this.nome = nome;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setValorPedido(double valorPedido) {this.valorPedido = valorPedido;}
    public void setDesconto(double desconto) {this.desconto = desconto;}

    // GET'S
    public String getNome() {return nome;}
    public String getEndereco() {return endereco;}
    public int getIdade() {return idade;}
    public double getValorPedido() {return valorPedido;}
    public double getDesconto() {return desconto;}

    public void calculaDesconto(){
        this.desconto = valorPedido * 0.1;
    }
}
