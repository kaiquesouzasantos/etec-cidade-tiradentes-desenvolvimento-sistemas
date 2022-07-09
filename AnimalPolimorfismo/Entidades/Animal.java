package AnimalPolimorfismo.Entidades;

public abstract class Animal {
    private String nome, cor;
    private double peso;

    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    // GET's
    public String getNome() {return nome;}
    public String getCor() {return cor;}
    public double getPeso() {return peso;}

    // SET's
    public void setNome(String nome) {this.nome = nome;}
    public void setCor(String cor) {this.cor = cor;}
    public void setPeso(double peso) {this.peso = peso;}

    // PARTICULARIDADES
    public String corre(){return null;}
    public String come(){return null;}
    public String dorme(){return null;}
    public String fala(){return null;}
}
