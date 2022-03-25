package Animal;

public class Animal {
	public String especie, nome;
	public int quantPatas;
	public double peso;
	
	public void imprimirValoresAnimal() {
		System.out.println("\nNOME: "+this.nome+"\nESPECIE: "+this.especie+"\nQUANTIDADE DE PATAS: "+this.quantPatas+"\nPESO: "+this.peso+"KG");
	}
}
