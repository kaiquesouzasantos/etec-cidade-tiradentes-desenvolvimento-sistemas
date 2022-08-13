package ClienteHeranca.Entidades;

public class Cliente {
    private String nome, endereco;
    private int idade;
    private double valorPedido, desconto;

    public Cliente(String nome, String endereco, int idade, double valorPedido) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.valorPedido = valorPedido;
        this.desconto = calculaDesconto();
    }

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

    // DESCONTO
    public double calculaDesconto(){
        return valorPedido * 0.1;
    }

    @Override
    public String toString() {
        return  "NOME: "+this.nome+"\n"+
                "ENDERECO: "+this.endereco+"\n"+
                "IDADE: "+this.idade+"\n"+
                "VALOR DO PEDIDO: R$"+this.valorPedido+"\n"+
                "DESCONTO: R$"+this.desconto;
    }
}
