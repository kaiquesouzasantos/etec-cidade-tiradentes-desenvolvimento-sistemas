package GeometriaPolimorfismo.Entidades;

public class Losangulo extends FiguraGeometrica{
    private final double altura, largura;

    public Losangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
        this.setNome("Losangulo");
    }

    @Override
    public double calculoArea() {
        return (altura * largura)/2;
    }
}
