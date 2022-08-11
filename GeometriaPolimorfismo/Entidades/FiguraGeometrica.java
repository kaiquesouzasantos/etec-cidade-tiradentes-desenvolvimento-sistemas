package GeometriaPolimorfismo.Entidades;

public abstract class FiguraGeometrica {
    private String nome;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public abstract double calculoArea();

    @Override
    public String toString() {
        return "FIGURA GEOMETRICA: "+this.nome+" | AREA: "+calculoArea();
    }
}
