package Animal;
import java.util.Scanner;

public class Main {
	public static final Scanner in = new Scanner(System.in);
	public static Animal primeiroAnimal = new Animal();
	public static Animal segundoAnimal = new Animal();
	public static Animal terceiroAnimal = new Animal();
	
	public static void main(String[] args) {
		System.out.print("======== ANIMAL ========");
		int cont = 0;
		while(cont < 3) {
			System.out.print("\nDIGITE O NOME DO ANIMAL: ");
			String nome = in.next();
			System.out.print("DIGITE A ESPÉCIE: ");
			String especie = in.next();
			System.out.print("DIGITE A QUANTIDADE DE PATAS: ");
			int quantPatas = in.nextInt();
			System.out.print("DIGITE O PESO EM KG(QUILOGRAMA): ");
			double peso = in.nextDouble();
			
			if(cont == 0) {
				primeiroAnimal.nome = nome;
				primeiroAnimal.especie = especie;
				primeiroAnimal.quantPatas = quantPatas;
				primeiroAnimal.peso = peso;
			}else if(cont == 1) {
				segundoAnimal.nome = nome;
				segundoAnimal.especie = especie;
				segundoAnimal.quantPatas = quantPatas;
				segundoAnimal.peso = peso;
			}else if(cont == 2){
				terceiroAnimal.nome = nome;
				terceiroAnimal.especie = especie;
				terceiroAnimal.quantPatas = quantPatas;
				terceiroAnimal.peso = peso;
			}
			cont++;
		}
		primeiroAnimal.imprimirValoresAnimal();
		segundoAnimal.imprimirValoresAnimal();
		terceiroAnimal.imprimirValoresAnimal();
	}
}
