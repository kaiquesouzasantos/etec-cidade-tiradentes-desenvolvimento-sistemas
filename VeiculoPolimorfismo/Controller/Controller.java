package VeiculoPolimorfismo.Controller;
import VeiculoPolimorfismo.Entidades.*;

import java.util.List;
import java.util.ArrayList;

public class Controller {
    private final List<Veiculo> listaVeiculos = new ArrayList<>();

    public void add(Veiculo veiculo){
        this.listaVeiculos.add(veiculo);
    }

    public void add(List<Veiculo> veiculos){
        for(Veiculo veiculo : veiculos){
            add(veiculo);
        }
    }

    public String listagemVeiculos(){
        String listagem = "";

        for(Veiculo veiculo : listaVeiculos){
            listagem += veiculo + "\n------------------------------------------------------\n";
        }

        return listagem;
    }

}
