package NumeroPrimoSobrecarga;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TesteNumero {
    public static void main(String[] args) {
        Numero numero = new Numero();
        String verificador;
        List<Integer> numRecebidos = new ArrayList<>();

        do{
            numRecebidos.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")));
            verificador = JOptionPane.showInputDialog("Deseja Continuar[S/N]? ");
        }while(verificador.equalsIgnoreCase("s"));

        JOptionPane.showMessageDialog(null, numero.verificaPrimo(numRecebidos));
    }
}
