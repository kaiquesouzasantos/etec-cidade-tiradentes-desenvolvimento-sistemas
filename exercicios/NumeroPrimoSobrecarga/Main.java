package NumeroPrimoSobrecarga;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int verificador;
        List<Integer> numRecebidos = new ArrayList<>();

        do{
            numRecebidos.add(Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Digite um numero: ", "INFORMACAO", JOptionPane.QUESTION_MESSAGE)));
            verificador = JOptionPane.showConfirmDialog(null, "Deseja Continuar? ");
        }while(verificador == JOptionPane.YES_NO_OPTION);

        JOptionPane.showMessageDialog(
                null, Numero.verificaPrimo(numRecebidos), "NUMEROS", JOptionPane.INFORMATION_MESSAGE);
    }
}
