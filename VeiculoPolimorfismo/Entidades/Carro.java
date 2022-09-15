package VeiculoPolimorfismo.Entidades;
import VeiculoPolimorfismo.Interface.Imposto;

public class Carro extends Veiculo {
    public Carro(String modelo, String cor, String tipoCombustivel, double valor) {
        super(modelo, cor, tipoCombustivel, valor);
    }

    @Override
    public double calculaIPVA() {
        Imposto<Double> ipva = valorVeiculo -> valorVeiculo * 0.04;
        return ipva.calculaIPVA(getValor());
    }

    public String toString() {
        return "CARRO\nMODELO: "+getModelo()+
                "\nCOR: "+getCor()+
                "\nCOMBUSTIVEL: "+getTipoCombustivel()+
                "\nVALOR: R$"+getValor()+
                "\nIPVA: R$"+calculaIPVA();
    }
}
