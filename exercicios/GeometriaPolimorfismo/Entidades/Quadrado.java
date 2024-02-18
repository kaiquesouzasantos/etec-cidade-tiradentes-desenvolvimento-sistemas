package GeometriaPolimorfismo.Entidades;

public class Quadrado extends FiguraGeometrica{
    private final double lado;

    public Quadrado(double lado) {
        this.lado = lado;
        this.setNome("Quadrado");
    }

    @Override
    public double calculoArea() {
        return (lado * lado);
    }
}
