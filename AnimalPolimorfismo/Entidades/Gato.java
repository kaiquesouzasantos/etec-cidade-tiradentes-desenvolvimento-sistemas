package AnimalPolimorfismo.Entidades;

public class Gato extends Animal{
    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String Correr() {
        return "Os gatos atingem a velocidade de 30 km/h";
    }

    public String Alimentar() {
        return "Os gatos se alimentam de racao";
    }

    public String Dormir() {
        return "Os gatos dormem 8 horas por dia";
    }

    public String EmitirSom() {
        return "O som emitido pelos gatos e: miau - miau";
    }

    public String toString() {
        return "TIPO: GATO\n"
                +getNome()+" | "+getCor()+" | "+getPeso()+"kg\n"+
                Correr()+"\n"+Alimentar()+"\n"+EmitirSom()+"\n"+Dormir()+"\n";
    }
}
