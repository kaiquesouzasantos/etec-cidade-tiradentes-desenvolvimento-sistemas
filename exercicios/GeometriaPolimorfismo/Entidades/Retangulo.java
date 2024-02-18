package GeometriaPolimorfismo.Entidades;

public class Retangulo extends FiguraGeometrica{
    private final double altura, largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
        this.setNome("Retangulo");
    }

    @Override
    public double calculoArea() {
        return (altura * largura);
    }
}
