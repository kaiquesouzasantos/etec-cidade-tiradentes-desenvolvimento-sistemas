package GeometriaPolimorfismo;
import GeometriaPolimorfismo.Entidades.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String continua, saida = "";
        List<FiguraGeometrica> figuras = new ArrayList<>();

        do{
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "[1] - Ciruculo\n[2] - Retangulo\n[3] - Losangulo\n[4] - Triangulo\n[5] - Quadrado\n\nDIGITE A FIGURA QUE DESEJA CALCULAR:"));
            if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) System.exit(0);

            if(opcao == 1){
                figuras.add(new Circulo(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O RAIO: "))));
            }else if(opcao == 5) {
                figuras.add(new Quadrado(Double.parseDouble(JOptionPane.showInputDialog("DIGITE O TAMANHO DO LADO: "))));
            }else{
                double largura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A LARGURA: "));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A ALTURA: "));

                if(opcao == 2)
                    figuras.add(new Retangulo(altura, largura));
                else if(opcao == 3)
                    figuras.add(new Losangulo(altura, largura));
                else
                    figuras.add(new Triangulo(altura, largura));
            }

            continua = JOptionPane.showInputDialog("DESEJA CONTINUAR? [S/N]");
        }while(continua.equalsIgnoreCase("S"));

        for (FiguraGeometrica n : figuras) {
            saida += n + "\n";
        }
        JOptionPane.showMessageDialog(null, saida);
    }
}
