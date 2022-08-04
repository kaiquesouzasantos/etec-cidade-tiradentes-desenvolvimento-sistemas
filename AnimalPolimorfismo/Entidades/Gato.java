package AnimalPolimorfismo.Entidades;

public class Gato extends Animal{
    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String correr() {
        return "Os gatos atingem a velocidade de 30 km/h";
    }

    public String alimentar() {
        return "Os gatos se alimentam de racao";
    }

    public String dormir() {
        return "Os gatos dormem 8 horas por dia";
    }

    public String emitirSom() {
        return "O som emitido pelos gatos e: miau - miau";
    }

    public String toString() {
        return "TIPO: GATO\n"
                +getNome()+" | "+getCor()+" | "+getPeso()+"kg\n"+
                correr()+"\n"+alimentar()+"\n"+emitirSom()+"\n"+dormir()+"\n";
    }
}
