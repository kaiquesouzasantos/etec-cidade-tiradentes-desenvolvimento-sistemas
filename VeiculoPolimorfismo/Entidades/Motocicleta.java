package VeiculoPolimorfismo.Entidades;
import VeiculoPolimorfismo.Interface.Imposto;

public class Motocicleta extends Veiculo {
    public Motocicleta(String modelo, String cor, String tipoCombustivel, double valor) {
        super(modelo, cor, tipoCombustivel, valor);
    }

    @Override
    public double calculaIPVA() {
        Imposto<Double> ipva = valorVeiculo -> valorVeiculo * 0.02;
        return ipva.calculaIPVA(getValor());
    }
    
    public String toString() {
        return
                "MOTOCICLETA\nMODELO: "+getModelo()+
                        "\nCOR: "+getCor()+
                        "\nCOMBUSTIVEL: "+getTipoCombustivel()+
                        "\nVALOR: R$"+getValor()+
                        "\nIPVA: R$"+calculaIPVA();
    }
}
