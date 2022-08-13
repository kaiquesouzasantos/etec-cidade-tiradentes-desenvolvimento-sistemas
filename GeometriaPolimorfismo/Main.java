package GeometriaPolimorfismo;
import GeometriaPolimorfismo.Entidades.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static List<FiguraGeometrica> figuras = new ArrayList<>();

    public static void main(String[] args) {
        int continua;

        do{
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "[1] - Ciruculo\n[2] - Retangulo\n[3] - Losangulo\n[4] - Triangulo\n[5] - Quadrado\n\nDIGITE A FIGURA QUE DESEJA CALCULAR:",
                    "MENU", JOptionPane.QUESTION_MESSAGE
            ));

            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5)
                JOptionPane.showMessageDialog(
                        null, "FIGURA INVALIDA!", "MENU", JOptionPane.ERROR_MESSAGE);
            else
                executaFigura(opcao);

            continua = JOptionPane.showConfirmDialog(null, "DESEJA CONTINUAR?");
        }while(continua == JOptionPane.YES_NO_OPTION);

        String saida = "";
        for (FiguraGeometrica n : figuras) {
            saida += n + "\n";
        }
        JOptionPane.showMessageDialog(null, saida, "FIGURA GEOMETRICA", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void executaFigura(int opcao){
        if(opcao == 1){
            figuras.add(new Circulo(Double.parseDouble(JOptionPane.showInputDialog(
                    null, "DIGITE O RAIO: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE))));
        }else if(opcao == 5) {
            figuras.add(new Quadrado(Double.parseDouble(JOptionPane.showInputDialog(
                    null, "DIGITE O TAMANHO DO LADO: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE))));
        }else{
            double largura = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "DIGITE A LARGURA: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));
            double altura = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "DIGITE A ALTURA: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));

            if(opcao == 2) figuras.add(new Retangulo(altura, largura));
            else if(opcao == 3) figuras.add(new Losangulo(altura, largura));
            else figuras.add(new Triangulo(altura, largura));
        }
    }
}
