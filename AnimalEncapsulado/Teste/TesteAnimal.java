package AnimalEncapsulado.Teste;
import AnimalEncapsulado.Entidade.Animal;

public class TesteAnimal {
	public static void main(String[] args) {
		// TESTE-01
		Animal primeiroAnimal = new Animal();
		primeiroAnimal.setEspecie("animal_01");
		primeiroAnimal.setNome("animal_01");
		primeiroAnimal.setQuantPatas(4);
		primeiroAnimal.setPeso(30);

		// TESTE-02
		Animal segundoAnimal = new Animal();
		segundoAnimal.setEspecie("animal_02");
		segundoAnimal.setNome("animal_02");
		segundoAnimal.setQuantPatas(4);
		segundoAnimal.setPeso(1200);

		// TESTE-03
		Animal terceiroAnimal = new Animal("animal_03", "animal_03", 4, 300);
		
		// TESTE-04
		Animal quartoAnimal = new Animal("animal_04", "animal_04 ", 4, 50);

		// SAIDA
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(primeiroAnimal);

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(segundoAnimal);

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(terceiroAnimal);

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(quartoAnimal);
		
		System.out.println("----------------------------------------------------------------------------------");
	}
}
