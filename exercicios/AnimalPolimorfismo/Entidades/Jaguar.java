package AnimalPolimorfismo.Entidades;

public class Jaguar extends Animal{
    public Jaguar(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String corre() {
        return "Os jaguares atingem a velocidade de 70 km/h";
    }

    public String come() {
        return "Os jaguares se alimentam de carne de outros animais";
    }

    public String dorme() {
        return "Os jaguares dormem 8 horas por dia";
    }

    public String fala() {
        return "O som emitido pelos jaguares e: GGRRRRRRRRRA";
    }

    public String toString() {
        return "TIPO: JAGUAR\n"
                +getNome()+" | "+getCor()+" | "+getPeso()+"kg\n"+
                corre()+"\n"+come()+"\n"+fala()+"\n"+dorme()+"\n";
    }
}
