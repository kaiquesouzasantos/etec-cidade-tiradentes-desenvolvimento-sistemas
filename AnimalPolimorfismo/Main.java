package AnimalPolimorfismo;
import AnimalPolimorfismo.Entidades.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        executaParticularidades(List.of(
                new Cachorro("Cachorro","Caramelo", 30),
                new Elefante("Elefante", "Cinza", 5000),
                new Jaguar("Jaguar", "Amarelo", 100)
        ));
    }

    public static void executaParticularidades(List<? extends Animal> animais){
        for(Animal animal:animais){
            System.out.println(animal);
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}