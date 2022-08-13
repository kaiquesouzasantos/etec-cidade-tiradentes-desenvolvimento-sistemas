package Retangulo;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        for(int i = 0; i < 3; i++){
            retangulo.baseRetangulo = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "DIGITE O VALOR DA BASE: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));
            retangulo.alturaRetangulo = Double.parseDouble(JOptionPane.showInputDialog(
                    null, "DIGITE O VALOR DA ALTURA: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE));

            JOptionPane.showMessageDialog(
                    null, "A AREA DO RETANGULO É IGUAL Á "+retangulo.calcularArea(), "RETANGULO", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
