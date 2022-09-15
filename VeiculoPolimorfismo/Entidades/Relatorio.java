package VeiculoPolimorfismo.Entidades;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Relatorio {
    private final List<Veiculo> listaVeiculos = new ArrayList<>();

    public void add(Veiculo veiculo){
        this.listaVeiculos.add(veiculo);
    }

    public void add(List<Veiculo> veiculos){
        for(Veiculo veiculo : veiculos){
            add(veiculo);
        }
    }

    private Stream<Veiculo> getStream(){
        return listaVeiculos.stream();
    }

    private double valorMedioVeiculo(){
        Optional<Double> valorMedio = getStream()
                .map(Veiculo::getValor)
                .reduce(Double::sum);

        return valorMedio.isPresent() ? valorMedio.get() : 0;
    }

    private double valorIPVAMedio(){
        Optional<Double> valorMedio = getStream()
                .map(Veiculo::calculaIPVA)
                .reduce(Double::sum);

        return valorMedio.isPresent() ? valorMedio.get() : 0;
    }

    public String listagemVeiculos(){
        return "QUANTIDADE DE VEICULOS: "+listaVeiculos.size() +
                "\nVALOR MEDIO: R$"+valorMedioVeiculo() +
                "\nIPVA MEDIO: R$"+valorIPVAMedio()+
                "\n\nLISTAGEM DE VEICULOS DETALHADOS:\n\n"+geraRelatorio();
    }

    private String formataVeiculo(Veiculo veiculo){
        return
                veiculo.getModelo() + ";" +
                veiculo.getCor() + ";" +
                veiculo.getTipoCombustivel() + ";" +
                "R$"+veiculo.getValor() + ";" +
                "R$"+veiculo.calculaIPVA() + "\n";
    }

    private String geraRelatorio(){
        try{
            String caminhoArquivo = System.getProperty("user.home")+"\\listagemVeiculos.csv";
            PrintWriter print = new PrintWriter(new FileWriter(caminhoArquivo));

            print.println("MODELO;COR;COMBUSTIVE;VALOR;IPVA");
            for(Veiculo veiculo : this.listaVeiculos){
                print.print(formataVeiculo(veiculo));
            }
            print.close();

            return caminhoArquivo;
        }catch(IOException e){
            return null;
        }
    }
}
