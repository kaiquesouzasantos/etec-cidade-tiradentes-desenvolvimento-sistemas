package NumeroPrimoSobrecarga;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TesteNumero {
    public static void main(String[] args) {
        Numero numero = new Numero();
        String verificador;
        List<Integer> numRecebidos = new ArrayList<>();
        StringBuilder saida = new StringBuilder();

        do{
            numRecebidos.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ")));
            verificador = JOptionPane.showInputDialog("Deseja Continuar[S/N]? ");
        }while(verificador.equalsIgnoreCase("s"));

        numero.verificaPrimo(numRecebidos).forEach(saida::append);
        JOptionPane.showMessageDialog(null, saida);
    }
}
