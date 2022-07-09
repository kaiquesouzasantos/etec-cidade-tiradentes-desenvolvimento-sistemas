package GeometriaPolimorfismo.Entidades;

public class Circulo extends FiguraGeometrica{
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
        this.setNome("Circulo");
    }

    @Override
    public double calculoArea() {
        return ((raio * raio) * 3.141);
    }
}
