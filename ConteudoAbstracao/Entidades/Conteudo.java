package ConteudoAbstracao.Entidades;

public abstract class Conteudo {
    private String categoria, titulo, duracao;

    public Conteudo() {}
    public Conteudo(String categoria, String titulo) {
        this.categoria = categoria;
        this.titulo = titulo;
    }

    public String getCategoria() {return categoria;}
    public String getTitulo() {return titulo;}
    public String getDuracao() {return duracao;}

    public void setCategoria(String categoria) {this.categoria = categoria;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setDuracao(int duracao) {
        if(duracao > 60)
            this.duracao = ((int) (duracao/60)) + "H" + (duracao%60) + "Min";
        else
            this.duracao = duracao + "Min";
    }

    public abstract String descricaoConteudo();
}
