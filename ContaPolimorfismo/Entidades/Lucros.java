package ContaPolimorfismo.Entidades;
import java.util.List;

public class Lucros {
    public double getSoma(List<Conta> contas){
        double soma = 0;

        for(Conta conta: contas){
            soma += conta.getSaldoConta();
        }

        return soma;
    }
}
