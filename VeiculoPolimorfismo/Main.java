package VeiculoPolimorfismo;
import VeiculoPolimorfismo.Entidades.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        executaParticularidades(List.of(
                new Carro("Triton L200", "Black Piano", "Gasolina", 200000),
                new Motocicleta("R1200", "Preto", "Gasolina", 75000)
        ));
    }

    public static void executaParticularidades(List<? extends Veiculo> veiculos){
        for(Veiculo veiculo:veiculos){
            System.out.println("--------------------------------------------------------------------------");
            System.out.println(veiculo);
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
