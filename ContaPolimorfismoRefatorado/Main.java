package ContaPolimorfismoRefatorado;
import ContaPolimorfismoRefatorado.Controller.HomeController;

public class Main {
    public static void main(String[] args) {
        try {
            new HomeController().cadastraContas();
        }catch (NumberFormatException e) {
            System.exit(0);
        }
    }
}