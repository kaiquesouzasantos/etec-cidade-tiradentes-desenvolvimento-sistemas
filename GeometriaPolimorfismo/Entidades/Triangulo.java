package GeometriaPolimorfismo.Entidades;

public class Triangulo extends FiguraGeometrica{
    private final double altura, largura;

    public Triangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
        this.setNome("Triangulo");
    }

    @Override
    public double calculoArea() {
        return ((altura * largura)/2);
    }
}
