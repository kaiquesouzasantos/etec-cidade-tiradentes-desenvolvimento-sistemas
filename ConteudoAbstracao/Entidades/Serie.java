package ConteudoAbstracao.Entidades;

public class Serie extends Conteudo {
    private int quantEpisodios, quantTemporadas;

    public Serie(String categoria, String titulo, int duracao, int quantEpisodios, int quantTemporadas) {
        super(categoria, titulo);
        this.setDuracao(duracao);
        this.quantEpisodios = quantEpisodios;
        this.quantTemporadas = quantTemporadas;
    }

    public int getQuantEpisodios() {return quantEpisodios;}
    public int getQuantTemporadas() {return quantTemporadas;}

    public void setQuantEpisodios(int quantEpisodios) {this.quantEpisodios = quantEpisodios;}
    public void setQuantTemporadas(int quantTemporadas) {this.quantTemporadas = quantTemporadas;}

    @Override
    public String descricaoConteudo() {
        return
                "TITULO: "+this.getTitulo()+"\n"+
                "CATEGORIA: "+this.getCategoria()+"\n"+
                "DURACAO MEDIA DE EPSODIO: "+this.getDuracao()+"\n"+
                "EPSODIOS: "+this.quantEpisodios+"\n"+
                "TEMPORADAS: "+this.quantTemporadas;
    }
}
