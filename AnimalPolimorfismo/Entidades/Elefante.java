package AnimalPolimorfismo.Entidades;

public class Elefante extends Animal{
    public Elefante(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String correr() {
        return "Os elefantes atingem a velocidade de 5 km por hora";
    }

    public String alimentar() {
        return "Os elefantes se alimentam de frutas e folhas";
    }

    public String dormir() {
        return "Os elefantes dormem 8 horas por dia";
    }

    public String emitirSom() {
        return "O som emitido pelos elefantes e: PRUUUUUUUUU";
    }

    public String toString() {
        return "TIPO: ELEFANTE\n"
                +getNome()+" | "+getCor()+" | "+getPeso()+"kg\n"+
                correr()+"\n"+alimentar()+"\n"+emitirSom()+"\n"+dormir()+"\n";
    }
}
