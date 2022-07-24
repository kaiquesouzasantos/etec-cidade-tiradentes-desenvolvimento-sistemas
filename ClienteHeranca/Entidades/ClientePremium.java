package ClienteHeranca.Entidades;

public class ClientePremium extends Cliente {
    public ClientePremium(String nome, String endereco, int idade, double valorPedido) {
        super(nome, endereco, idade, valorPedido);
    }

    @Override
    public double calculaDesconto(){
        return getValorPedido() * 0.15;
    }
}
