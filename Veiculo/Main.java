package Veiculo;

import Veiculo.Entidades.Caminhao;
import Veiculo.Entidades.Carro;
import Veiculo.Entidades.Moto;

public class Main{
    public static void main(String[] args){
        System.out.println("\n===============VEICULOS===============");
        
        // MOTO
        Moto primeiraMoto = new Moto("XJ6", "YAMAHA", "Azul");

        Moto segundaMoto = new Moto();
        segundaMoto.modelo = "R1200";
        segundaMoto.marca = "BMW";
        segundaMoto.cor = "Preto";

        System.out.println("\n-----MOTO-----\nModelo: "+primeiraMoto.modelo+"\nMarca: "+primeiraMoto.marca+"\nCor: "+primeiraMoto.cor);
        System.out.println("\n-----MOTO-----\nModelo: "+segundaMoto.modelo+"\nMarca: "+segundaMoto.marca+"\nCor: "+segundaMoto.cor);

        // CARRO
        Carro primeiroCarro = new Carro("Triton L200", "Mitsubishi", "Black Piano");

        Carro segundoCarro = new Carro();
        segundoCarro.setModelo("F-150 Raptor");
        segundoCarro.setMarca("Ford");
        segundoCarro.setCor("Branco ");

        System.out.println("\n-----CARRO-----\nModelo: "+primeiroCarro.getModelo()+"\nMarca: "+primeiroCarro.getMarca()+"\nCor: "+primeiroCarro.getCor());
        System.out.println("\n-----CARRO-----\nModelo: "+segundoCarro.getModelo()+"\nMarca: "+segundoCarro.getMarca()+"\nCor: "+segundoCarro.getCor());

        // CAMINHAO
        Caminhao primeiroCaminhao = new Caminhao("770s", "Scania", 770);

        Caminhao segundoCaminhao = new Caminhao();
        segundoCaminhao.setModelo("Actros 2651 6x4");
        segundoCaminhao.setMarca("Mercedes-Benz");
        segundoCaminhao.setPotenciaCavalos(510);

        System.out.println("\n-----CAMINHAO-----\nModelo: "+primeiroCaminhao.getModelo()+"\nMarca: "+primeiroCaminhao.getMarca()+"\nPotencia: "+primeiroCaminhao.getPotenciaCavalos()+"cv");
        System.out.println("\n-----CAMINHAO-----\nModelo: "+segundoCaminhao.getModelo()+"\nMarca: "+segundoCaminhao.getMarca()+"\nPotencia: "+segundoCaminhao.getPotenciaCavalos()+"cv");
    }
}