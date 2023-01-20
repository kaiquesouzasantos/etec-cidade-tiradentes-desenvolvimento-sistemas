package ConteudoAbstracao;

import ConteudoAbstracao.Controller.*;
import ConteudoAbstracao.Entidades.*;

import javax.swing.*;
import java.util.List;

public class Main {
    private final static Controller controller = new Controller();

    public static void main(String[] args) {
        atribuiConteudo();

        Object opcao = exibeMenuRecebeResposta("SELECIONE A LISTAGEM DESEJADA: ", "MENU", new Object[]{"TUDO", "FILMES", "SERIES"});

        if(opcao.equals("FILMES"))
            exibeMensagem(controller.catalogo(new Filme()), "CATALOGO DE FILMES");
        else if(opcao.equals("SERIES"))
            exibeMensagem(controller.catalogo(new Serie()), "CATALOGO DE SERIES");
        else if(opcao.equals("TUDO"))
            exibeMensagem(controller.catalogo(), "CATALOGO");
        else
            System.exit(0);
    }

    private static void atribuiConteudo(){
        controller.add(List.of(
                new Filme("Suspense", "A Soma dos Medos", 124),
                new Filme("Suspense", "Guerra Mundial Z", 116   ),
                new Filme("Acao", "Battleship - A Batalha dos Mares", 131),
                new Filme("Acao", "No Limite do Amanha", 153),
                new Filme("Suspense", "Um Lugar Silencioso", 130),
                new Filme("Crime", "Scarface", 170),
                new Filme("Drama", "Gladiador", 155),
                new Filme("Acao, Aventura", "Top Gun - Maverick", 131),

                new Serie("Drama", "House Of Cards", 60, 73, 6),
                new Serie("Drama", "Suits", 60, 114, 9),
                new Serie("Policial", "Peaky Blinders - Sangue, Apostas e Navalhas", 60, 36, 6),
                new Serie("Crime", "Ozark", 60, 44, 4),
                new Serie("Epico", "Game of Thrones", 72, 73, 8),
                new Serie("Epico", "Vikings", 45, 69, 6)
        ));
    }

    public static void exibeMensagem(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static Object exibeMenuRecebeResposta(String message, String title, Object[] opcoes){
        return JOptionPane.showInputDialog(null, message, title, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
    }
}
