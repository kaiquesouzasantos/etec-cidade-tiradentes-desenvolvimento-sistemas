package ConteudoAbstracao.Entidades;

public class Filme extends Conteudo {
    public Filme() {}
    public Filme(String categoria, String titulo, int duracao) {
        super(categoria, titulo, duracao);
    }

    @Override
    public String descricaoConteudo() {
        return
                "TITULO: "+this.getTitulo()+"\n"+
                "CATEGORIA: "+this.getCategoria()+"\n"+
                "DURACAO: "+this.getDuracao()+
                "\n------------------------------------------------------------------------\n";
    }
}
