package ClienteHeranca.Entidades;

public class ClientePremium extends Cliente {
    @Override
    public void calculaDesconto(){
        setDesconto(getValorPedido() * 0.15);
    }
}
