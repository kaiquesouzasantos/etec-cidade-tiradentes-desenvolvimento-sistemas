package ContaPolimorfismo.Entidades;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lucros {
    private final List<Conta> contas = new ArrayList<>();

    public void add(Conta conta){
        this.contas.add(conta);
    }

    public void add(List<Conta> contas){
        for(Conta conta : contas){
            add(conta);
        }
    }

    public double getSoma(){
       double soma = 0;

       for(Conta conta : this.contas){
           soma += conta.getSaldoConta();
       }

       return soma;
    }

    public double getMedia(){
        return getSoma()/this.contas.size();
    }

    public Map<String, Integer> quantidadeTipoConta(){
        int contaCorrente = 0, contPoupanca = 0;

        for(Conta conta : this.contas){
            if(conta instanceof ContaCorrente)
                contaCorrente += 1;
            else
                contPoupanca += 1;
        }

        return Map.of(
                "Conta Corrente", contaCorrente,
                "Conta Poupanca", contPoupanca);
    }
}
