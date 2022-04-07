package Filme;

public class Filme {
    private String tituloFilme;
    private int duracaoEmMinutos;

    public Filme(){}

    public void setTituloFilme(String tituloFilme){this.tituloFilme = tituloFilme;}
    public void setDuracaoEmMinutos(int duracaoEmMinutos){this.duracaoEmMinutos = duracaoEmMinutos;}

    public String getTituloFilme(){return this.tituloFilme;}
    public String exibirDuracaoEmHoras(){
        return (this.duracaoEmMinutos/60)+"h "+(this.duracaoEmMinutos%60)+"min";
    }
}
