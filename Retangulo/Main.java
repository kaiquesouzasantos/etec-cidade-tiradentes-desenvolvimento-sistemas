package Retangulo;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        for(int i = 0; i < 3; i++){
            retangulo.baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA BASE: "));
            retangulo.alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DA ALTURA: "));

            JOptionPane.showMessageDialog(null, "A AREA DO RETANGULO É IGUAL Á "+retangulo.calcularArea());
        }
    }
}
