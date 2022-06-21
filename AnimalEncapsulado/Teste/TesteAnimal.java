package AnimalEncapsulado.Teste;

import AnimalEncapsulado.Entidade.Animal;

public class TesteAnimal {
	public static void main(String[] args) {
		// TESTE-01
		Animal primeiroAnimal = new Animal();
		primeiroAnimal.setEspecie("Mamifero");
		primeiroAnimal.setNome("Tamandua");
		primeiroAnimal.setQuantPatas(4);
		primeiroAnimal.setPeso(30);

		// TESTE-02
		Animal segundoAnimal = new Animal();
		segundoAnimal.setEspecie("Mamifero");
		segundoAnimal.setNome("Girafa");
		segundoAnimal.setQuantPatas(4);
		segundoAnimal.setPeso(1200);

		// TESTE-03
		Animal terceiroAnimal = new Animal("Reptil", "Jacare", 4, 300);
		
		// TESTE-04
		Animal quartoAnimal = new Animal("Mamifero", "Capivara ", 4, 50);

		// SAIDA
		System.out.println("----------------------------------------------------------------------------------");
		primeiroAnimal.imprimirValoresAnimal();

		System.out.println("----------------------------------------------------------------------------------");
		segundoAnimal.imprimirValoresAnimal();

		System.out.println("----------------------------------------------------------------------------------");
		terceiroAnimal.imprimirValoresAnimal();

		System.out.println("----------------------------------------------------------------------------------");
		quartoAnimal.imprimirValoresAnimal();

		System.out.println("----------------------------------------------------------------------------------");
	}
}
