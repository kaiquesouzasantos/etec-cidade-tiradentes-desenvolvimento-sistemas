package GeometriaPolimorfismo;
import GeometriaPolimorfismo.Entidades.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static final List<FiguraGeometrica> figuras = new ArrayList<>();

    public static void main(String[] args) {
        int continua;

        do{
            int opcao = Integer.parseInt(exibePerguntaRecebeResposta("[1] - Ciruculo\n[2] - Retangulo\n[3] - Losangulo\n[4] - Triangulo\n[5] - Quadrado\n\nDIGITE A FIGURA QUE DESEJA CALCULAR: "));

            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5)
                exibeMensagem("FIGURA INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            else
                executaFigura(opcao);

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR?");
        }while(continua == JOptionPane.YES_NO_OPTION);

        String saida = "";
        for (FiguraGeometrica n : figuras) {
            saida += n + "\n";
        }
        
        exibeMensagem(saida, "FIGURA GEOMETRICA");
    }

    private static void executaFigura(int opcao){
        if(opcao == 1){
            figuras.add(new Circulo(Double.parseDouble(exibePerguntaRecebeResposta("DIGITE O RAIO: "))));
        }else if(opcao == 5) {
            figuras.add(new Quadrado(Double.parseDouble(exibePerguntaRecebeResposta("DIGITE O TAMANHO DO LADO: "))));
        }else{
            double largura = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE A LARGURA: "));
            double altura = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE A ALTURA: "));

            if(opcao == 2)
                figuras.add(new Retangulo(altura, largura));
            else if(opcao == 3)
                figuras.add(new Losangulo(altura, largura));
            else
                figuras.add(new Triangulo(altura, largura));
        }
    }

    private static String exibePerguntaRecebeResposta(String message){
        return JOptionPane.showInputDialog(null, message, "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
    }

    private static void exibeMensagem(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private static void exibeMensagem(String message, String title, int option){
        JOptionPane.showMessageDialog(null, message, title, option);
    }
}
