package AnimalPolimorfismo.Entidades;

public class Jaguar extends Animal{
    public Jaguar(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String Correr() {
        return "Os jaguares atingem a velocidade de 70 km/h";
    }

    public String Alimentar() {
        return "Os jaguares se alimentam de carne de outros animais";
    }

    public String Dormir() {
        return "Os jaguares dormem 8 horas por dia";
    }

    public String EmitirSom() {
        return "O som emitido pelos jaguares e: GGRRRRRRRRRA";
    }

    public String toString() {
        return "TIPO: JAGUAR\n"
                +getNome()+" | "+getCor()+" | "+getPeso()+"kg\n"+
                Correr()+"\n"+Alimentar()+"\n"+EmitirSom()+"\n"+Dormir()+"\n";
    }
}
