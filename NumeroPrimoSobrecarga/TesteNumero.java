package NumeroPrimoSobrecarga;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TesteNumero {
    public static void main(String[] args) {
        Numero numero = new Numero();
        List<Integer> numRecebidos = new ArrayList<>();
        String verificador;

        do{
            numRecebidos.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")));
            verificador = JOptionPane.showInputDialog("Deseja Continuar[s/n]? ");
        }while(verificador.equalsIgnoreCase("s"));

        // numero.verificaPrimo(numRecebidos).forEach(System.out::println);
        JOptionPane.showMessageDialog(null,  numero.verificaPrimo(numRecebidos));
    }
}
