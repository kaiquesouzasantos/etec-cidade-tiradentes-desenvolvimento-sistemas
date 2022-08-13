package NumeroPrimoSobrecarga;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero();
        int verificador;
        List<Integer> numRecebidos = new ArrayList<>();

        do{
            numRecebidos.add(Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Digite um numero: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE)));
            verificador = JOptionPane.showConfirmDialog(null, "Deseja Continuar? ");
        }while(verificador == JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(null, numero.verificaPrimo(numRecebidos));
    }
}
