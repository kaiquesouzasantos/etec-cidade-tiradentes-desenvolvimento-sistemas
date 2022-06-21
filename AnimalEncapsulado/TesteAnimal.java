package AnimalEncapsulado;

import AnimalEncapsulado.Entidade.Animal;

public class TesteAnimal {
	public static void main(String[] args) {
		// TESTE-01
		Animal primeiroAnimal = new Animal();
		primeiroAnimal.setEspecie("Mamifero");
		primeiroAnimal.setNome("Tamandua");
		primeiroAnimal.setQuantPatas(4);
		primeiroAnimal.setPeso(30);
		System.out.println("\nESPECIE: "+primeiroAnimal.getEspecie()+"\nNOME: "+primeiroAnimal.getNome()+"\nQTD_PATAS: "+primeiroAnimal.getQuantPatas()+"\nPESO: "+primeiroAnimal.getPeso());

		// TESTE-02
		Animal segundoAnimal = new Animal();
		segundoAnimal.setEspecie("Mamifero");
		segundoAnimal.setNome("Girafa");
		segundoAnimal.setQuantPatas(4);
		segundoAnimal.setPeso(1200);
		segundoAnimal.imprimirValoresAnimal();

		// TESTE-03
		Animal terceiroAnimal = new Animal("Reptil", "Jacare", 4, 300);
		System.out.println("\nESPECIE: "+terceiroAnimal.getEspecie()+"\nNOME: "+terceiroAnimal.getNome()+"\nQTD_PATAS: "+terceiroAnimal.getQuantPatas()+"\nPESO: "+terceiroAnimal.getPeso());
		
		// TESTE-04
		Animal quartoAnimal = new Animal("Mamifero", "Capivara ", 4, 50);
		quartoAnimal.imprimirValoresAnimal();
	}
}
