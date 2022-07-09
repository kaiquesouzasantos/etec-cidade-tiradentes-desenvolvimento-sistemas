package AnimalPolimorfismo.Entidades;

public class Cachorro extends Animal{
    public Cachorro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    @Override
    public String corre() {
        return "Os cachorros atingem a velocidade de 30 km/h";
    }

    @Override
    public String come() {
        return "Os cachorros se alimentam de ração";
    }

    @Override
    public String dorme() {
        return "Os cachorros dormem 8 horas por dia";
    }

    @Override
    public String fala() {
        return "O som emitido pelos cachorros é: au-au-au";
    }

    public String toString() {
        return "Cachorro{\n"
                +getNome()+", "+getCor()+", "+getPeso()+"kg"+
                corre()+"\n"+come()+"\n"+fala()+"\n"+dorme()+"\n}";
    }
}
