package VeiculoPolimorfismo.Entidades;
import VeiculoPolimorfismo.Interface.Imposto;

public class Motocicleta extends Veiculo implements Imposto {
    public Motocicleta(String modelo, String cor, String tipoCombustivel, double valor) {
        super(modelo, cor, tipoCombustivel, valor);
    }

    @Override
    public double calculaIPVA() {
        return getValor() * 0.02;
    }

    @Override
    public String toString() {
        return
                "MOTOCICLETA\nMODELO: "+getModelo()+
                        "\nCOR: "+getCor()+
                        "\nCOMBUSTIVEL: "+getTipoCombustivel()+
                        "\nVALOR: R$"+getValor()+
                        "\nIPVA: R$"+calculaIPVA();
    }
}
