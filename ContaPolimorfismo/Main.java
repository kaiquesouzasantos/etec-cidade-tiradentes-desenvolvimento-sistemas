package ContaPolimorfismo;
import ContaPolimorfismo.Controller.HomeController;

public class Main {
    public static void main(String[] args) {
        try {
            new HomeController().cadastraContas();
        }catch (NumberFormatException e) {
            System.exit(0);
        }
    }
}