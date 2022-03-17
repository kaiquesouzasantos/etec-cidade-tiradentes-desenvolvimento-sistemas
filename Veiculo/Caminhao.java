package Veiculo;

public class Caminhao{
    private String modelo, marca;
    private int potenciaCavalos;

    public Caminhao(){}
    public Caminhao(String modelo, String marca, int potenciaCavalos){
        this.modelo = modelo;
        this.marca = marca;
        this.potenciaCavalos = potenciaCavalos;
    }

    // SET's
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setMarca(String marca){this.marca = marca;}
    public void setPotenciaCavalos(int potenciaCavalos){this.potenciaCavalos = potenciaCavalos;}

    // GET's
    public String getModelo(){return modelo;}
    public String getMarca(){return marca;}
    public int getPotenciaCavalos(){return potenciaCavalos;}

}