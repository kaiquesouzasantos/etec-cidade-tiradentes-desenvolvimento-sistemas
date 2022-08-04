package AnimalPolimorfismo.Entidades;

public class Jaguar extends Animal{
    public Jaguar(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String correr() {
        return "Os jaguares atingem a velocidade de 70 km/h";
    }

    public String alimentar() {
        return "Os jaguares se alimentam de carne de outros animais";
    }

    public String dormir() {
        return "Os jaguares dormem 8 horas por dia";
    }

    public String emitirSom() {
        return "O som emitido pelos jaguares e: GGRRRRRRRRRA";
    }

    public String toString() {
        return "TIPO: JAGUAR\n"
                +getNome()+" | "+getCor()+" | "+getPeso()+"kg\n"+
                correr()+"\n"+alimentar()+"\n"+emitirSom()+"\n"+dormir()+"\n";
    }
}
