package ConteudoAbstracao.Controller;

import ConteudoAbstracao.Entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Conteudo> listaConteudo = new ArrayList<>();

    public void add(Conteudo conteudo){
        this.listaConteudo.add(conteudo);
    }

    public void add(List<? extends Conteudo> listaConteudo) {
        for (Conteudo conteudo : listaConteudo) {
            add(conteudo);
        }
    }

    public String catalogo(){
        String catalogo = "";

        for(Conteudo conteudo : this.listaConteudo){
            catalogo += conteudo.descricaoConteudo();
        }

        return catalogo;
    }

    public String catalogo(Conteudo tipo){
        String catalogo = "";

        for(Conteudo conteudo : this.listaConteudo){
            if(conteudo.getClass() == tipo.getClass()) {
                catalogo += conteudo.descricaoConteudo();
            }
        }

        return catalogo;
    }
}
