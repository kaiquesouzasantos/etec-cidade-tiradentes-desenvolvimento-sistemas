package ConteudoAbstracao.Controller;

import ConteudoAbstracao.Entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Conteudo> listaConteudo = new ArrayList<>();

    public void add(Conteudo conteudo){
        this.listaConteudo.add(conteudo);
    }

    public void add(List<Conteudo> listaConteudo) {
        for (Conteudo conteudo : listaConteudo) {
            add(conteudo);
        }
    }

    public String catalogo(String tipo){
        String catalogo = "";

        for(Conteudo conteudo : this.listaConteudo){
            if(tipo.equalsIgnoreCase("filme")){
                if(conteudo instanceof Filme) {
                    catalogo +=
                            conteudo.descricaoConteudo() +
                                    "\n------------------------------------------------------------------------\n";
                }
            } else if(tipo.equalsIgnoreCase("serie")) {
                if(conteudo instanceof Serie) {
                    catalogo +=
                            conteudo.descricaoConteudo() +
                                    "\n------------------------------------------------------------------------\n";
                }
            } else{
                catalogo +=
                        conteudo.descricaoConteudo() +
                                "\n------------------------------------------------------------------------\n";
            }
        }

        return catalogo;
    }
}
