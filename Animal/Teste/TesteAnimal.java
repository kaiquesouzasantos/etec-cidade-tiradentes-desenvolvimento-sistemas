package Animal.Teste;
import Animal.Entidade.Animal;

public class TesteAnimal {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-01
        teste(new Animal(), "animal_01", "animal_01", 4, 120);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-02
        teste(new Animal(), "animal_02", "animal_02", 2, 80);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-03
        teste(new Animal(), "animal_03", "animal_03", 8, 0.01);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-04
        teste(new Animal(), "animal_04", "animal_04", 4, 100);

        System.out.println("----------------------------------------------------------------------------------");

        // TESTE-05
        teste(new Animal(), "animal_05", "animal_05", 2, 50);

        System.out.println("----------------------------------------------------------------------------------");
    }

    public static void teste(Animal animal, String nome, String especie, int quantPatas, double peso){
        animal.nome = nome;
        animal.especie = especie;
        animal.quantPatas = quantPatas;
        animal.peso = peso;

        System.out.println(animal);
    }
}