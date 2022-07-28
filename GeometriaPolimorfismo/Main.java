package GeometriaPolimorfismo;
import GeometriaPolimorfismo.Entidades.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        List<FiguraGeometrica> figuraGeometricas = List.of(
                new Circulo(10),
                new Quadrado(15),
                new Retangulo(12, 20),
                new Triangulo(5, 5),
                new Losangulo(8, 10)
        );
        */

        List<FiguraGeometrica> figuraGeometricas = new ArrayList<>();

        figuraGeometricas.add(new Circulo(10));
        figuraGeometricas.add(new Quadrado(15));
        figuraGeometricas.add(new Retangulo(12, 20));
        figuraGeometricas.add(new Triangulo(5, 5));
        figuraGeometricas.add( new Losangulo(8, 10));

        figuraGeometricas.forEach(System.out::println);
    }
}
