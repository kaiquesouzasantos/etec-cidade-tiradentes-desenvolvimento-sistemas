package ConteudoAbstracao.Controller;

import ConteudoAbstracao.Entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Conteudo> listaConteudo = new ArrayList<>();

    public void add(Conteudo conteudo){
        this.listaConteudo.add(conteudo);
    }

    public void add(List<Conteudo> listaConteudo){
        for(Conteudo conteudo:listaConteudo){
            add(conteudo);
        }
    }

    public String catalogo(){
        String catalogo = "";

        for(Conteudo conteudo : this.listaConteudo){
            catalogo +=
                    conteudo.descricaoConteudo() +
                    "\n------------------------------------------------------------------------\n";
        }

        return catalogo;
    }

    public String catalogoFilme(){
        String catalogo = "";

        for(Conteudo conteudo : this.listaConteudo){
            if(conteudo instanceof Filme) {
                catalogo +=
                        conteudo.descricaoConteudo() +
                                "\n------------------------------------------------------------------------\n";
            }
        }

        return catalogo;
    }

    public String catalogoSerie(){
        String catalogo = "";

        for(Conteudo conteudo : this.listaConteudo){
            if(conteudo instanceof Serie) {
                catalogo +=
                        conteudo.descricaoConteudo() +
                                "\n------------------------------------------------------------------------\n";
            }
        }

        return catalogo;
    }
}
