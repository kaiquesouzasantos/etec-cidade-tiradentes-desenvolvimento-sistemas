package ContaPolimorfismo.Teste;
import ContaPolimorfismo.Entidades.*;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Lucros lucros = new Lucros();

        lucros.add(List.of(
                new ContaCorrente(200, 500, 100, 1202, "Kaique1", "51287878"),
                new ContaPoupanca(200, 500, 100, 1202, "Kaique2", "51287878"),
                new ContaCorrente(200, 500, 100, 1202, "Kaique3", "51287878"),
                new ContaPoupanca(200, 500, 100, 1202, "Kaique4", "51287878")
        ));
        lucros.getRelatorio();
    }
}
