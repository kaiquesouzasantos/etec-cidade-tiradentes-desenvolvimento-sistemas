package Animal;

public class Animal {
	public String especie, nome;
	public int quantPatas;
	public double peso;
	
	public void imprimirValoresAnimal() {
		System.out.println("\nNOME: "+nome+"\nESPECIE: "+especie+"\nQUANTIDADE DE PATAS: "+quantPatas+"\nPESO: "+peso+"KG");
	}
}
