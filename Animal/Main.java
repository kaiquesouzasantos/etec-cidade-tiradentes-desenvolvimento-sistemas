package Animal;
import java.util.Scanner;

public class Main {
	public static final Scanner in = new Scanner(System.in);
	public static Animal pato = new Animal();
	public static Animal ganso = new Animal();
	public static Animal jumento = new Animal();
	
	public static void main(String[] args) {
		int cont = 0;
		while(cont < 3) {
			System.out.print("DIGITE O NOME DO ANIMAL: ");
			String nome = in.next();
			
			System.out.print("DIGITE A ESPÉCIE: ");
			String especie = in.next();
			
			System.out.print("DIGITE A QUANTIDADE DE PATAS: ");
			int quantPatas = in.nextInt();
			
			System.out.print("DIGITE O PESO: ");
			double peso = in.nextDouble();
			
			if(cont == 0) {
				pato.nome = nome;
				pato.especie = especie;
				pato.quantPatas = quantPatas;
				pato.peso = peso;
			}else if(cont == 1) {
				ganso.nome = nome;
				ganso.especie = especie;
				ganso.quantPatas = quantPatas;
				ganso.peso = peso;
			}else if(cont == 2){
				jumento.nome = nome;
				jumento.especie = especie;
				jumento.quantPatas = quantPatas;
				jumento.peso = peso;
			}
			cont++;
		}
		
		pato.imprimirValoresAnimal();
		ganso.imprimirValoresAnimal();
		jumento.imprimirValoresAnimal();
	}
}
