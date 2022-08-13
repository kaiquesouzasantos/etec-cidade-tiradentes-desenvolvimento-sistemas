package Animal.Entidade;

public class Animal {
	public String especie, nome;
	public int quantPatas;
	public double peso;

	@Override
	public String toString() {
		return  "NOME: "+this.nome+
				"\nESPECIE: "+this.especie+
				"\nQUANTIDADE DE PATAS: "+this.quantPatas+
				"\nPESO: "+this.peso+"KG";
	}
}
