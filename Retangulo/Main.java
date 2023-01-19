package Retangulo;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        for(int i = 0; i < 3; i++){
            retangulo.baseRetangulo = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE O VALOR DA BASE: "));
            retangulo.alturaRetangulo = Double.parseDouble(exibePerguntaRecebeResposta("DIGITE O VALOR DA ALTURA: "));

            JOptionPane.showMessageDialog(
                    null, "A AREA DO RETANGULO É IGUAL Á "+retangulo.calcularArea(),
                    "RETANGULO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static String exibePerguntaRecebeResposta(String message){
        return JOptionPane.showInputDialog(null, message, "INFORMACAO", JOptionPane.QUESTION_MESSAGE);
    }
}
