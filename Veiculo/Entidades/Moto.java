package Veiculo.Entidades;

public class Moto{
    public String modelo, marca, cor;

    public Moto(){}
    public Moto(String modelo, String marca, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "TIPO: MOTOCICLETA\nMODELO: "+modelo+"\nMARCA: "+marca+"\nCOR: "+cor;
    }
}