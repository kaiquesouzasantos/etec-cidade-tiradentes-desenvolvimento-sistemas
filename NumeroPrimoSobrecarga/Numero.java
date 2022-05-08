package NumeroPrimoSobrecarga;
import java.util.List;

public class Numero {
    public String verificaPrimo(Integer numero){
        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return "Numero Informado nao e Primo";
            }
        }
        return "Numero Informado e Primo";
    }

    public StringBuilder verificaPrimo(List<Integer> numero){
        StringBuilder saida = new StringBuilder();
        numero.forEach(num -> saida.append(num).append(" | ").append(verificaPrimo(num)).append("\n"));
        return saida;
    }
}
