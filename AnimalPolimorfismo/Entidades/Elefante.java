package AnimalPolimorfismo.Entidades;

public class Elefante extends Animal{
    public Elefante(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String corre() {
        return "Os elefantes atingem a velocidade de 5 km por hora";
    }

    @Override
    public String come() {
        return "Os elefantes se alimentam de frutas e folhas";
    }

    @Override
    public String dorme() {
        return "Os elefantes dormem 8 horas por dia";
    }

    @Override
    public String fala() {
        return "O som emitido pelos elefantes é: PRUUUUUUUUU";
    }

    public String toString() {
        return "Elefante{\n"
                +getNome()+", "+getCor()+", "+getPeso()+"kg"+
                corre()+"\n"+come()+"\n"+fala()+"\n"+dorme()+"\n}";
    }
}
