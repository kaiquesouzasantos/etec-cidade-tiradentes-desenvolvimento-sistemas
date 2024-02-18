package GeometriaPolimorfismo.Teste;
import GeometriaPolimorfismo.Entidades.*;
import java.util.List;

public class TesteFigura {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuraGeometricas = List.of(
                new Circulo(10),
                new Quadrado(15),
                new Retangulo(12, 20),
                new Triangulo(5, 5),
                new Losangulo(8, 10)
        );

        figuraGeometricas.forEach(System.out::println);
    }
}