package Veiculo;

public class Carro{
    protected String modelo, marca, cor;

    public Carro(){}
    public Carro(String modelo, String marca, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
    }

    // SET's
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    // GET's
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public String getCor(){
        return cor;
    }
}