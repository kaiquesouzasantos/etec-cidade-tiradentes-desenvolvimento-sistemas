package GeometriaPolimorfismo;
import GeometriaPolimorfismo.Entidades.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "[1] - Ciruculo\n[2] - Retangulo\n[3] - Losangulo\n[4] - Triangulo\n[5] - Quadrado\n\nDIGITE O NUMERO DA FIGURA GEOMETRICA:"));
        if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) System.exit(0);

        if(opcao == 1){
            aprensentaFiguraGeometrica(new Circulo(
                    Integer.parseInt(JOptionPane.showInputDialog("DIGITE O RAIO: "))));
        } else if(opcao == 5) {
            aprensentaFiguraGeometrica(new Quadrado(
                    Integer.parseInt(JOptionPane.showInputDialog("DIGITE O TAMANHO DO LADO: "))));
        } else{
            int largura = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A LARGURA: "));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A ALTURA: "));

            if(opcao == 2)
                aprensentaFiguraGeometrica(new Retangulo(altura, largura));
            else if(opcao == 3)
                aprensentaFiguraGeometrica(new Losangulo(altura, largura));
            else
                aprensentaFiguraGeometrica(new Triangulo(altura, largura));
        }
    }

    public static void aprensentaFiguraGeometrica(FiguraGeometrica figura){
        JOptionPane.showMessageDialog(null, figura);
    }
}
