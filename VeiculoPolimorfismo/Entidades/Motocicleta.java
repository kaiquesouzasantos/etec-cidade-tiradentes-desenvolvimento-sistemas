package VeiculoPolimorfismo.Entidades;

public class Motocicleta extends Veiculo{
    public Motocicleta(String modelo, String cor, String tipoCombustivel, double valor) {
        super(modelo, cor, tipoCombustivel, valor);
    }

    @Override
    public double calulaIPVA() {
        return getValor() * 0.02;
    }

    @Override
    public String toString() {
        return "Motocicleta{"+getModelo()+", "+getCor()+", "+getTipoCombustivel()+", R$"+getValor()+", R$"+getIpva()+"}";
    }
}
