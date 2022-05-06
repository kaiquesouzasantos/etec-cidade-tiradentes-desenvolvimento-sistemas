package NumeroPrimoSobrecarga;
import java.util.ArrayList;
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

    public List<String> verificaPrimo(List<Integer> numero){
        List<String> numVerificado = new ArrayList<>();

        for(int i = 0; i < numero.size(); i++){
            numVerificado.add(numero.get(i)+" | "+verificaPrimo(numero.get(i))+"\n");
        }
        return numVerificado;
    }
}
