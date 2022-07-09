package AnimalPolimorfismo;
import AnimalPolimorfismo.Entidades.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = List.of(
                new Cachorro("Cachorro","Caramelo", 30),
                new Elefante("Elefante", "Cinza", 5000),
                new Jaguar("Jaguar", "Amarelo", 100)
        );

        animais.forEach(System.out::println);
    }
}