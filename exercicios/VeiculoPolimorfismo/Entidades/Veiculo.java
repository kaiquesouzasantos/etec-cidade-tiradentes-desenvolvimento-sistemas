package VeiculoPolimorfismo.Entidades;

public abstract class Veiculo {
    private String modelo, cor, tipoCombustivel;
    private double valor;

    public Veiculo(String modelo, String cor, String tipoCombustivel, double valor) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.valor = valor;
    }

    // GET's
    public String getModelo() {return modelo;}
    public String getCor() {return cor;}
    public String getTipoCombustivel() {return tipoCombustivel;}
    public double getValor() {return valor;}

    // SET's
    public void setModelo(String modelo) {this.modelo = modelo;}
    public void setCor(String cor) {this.cor = cor;}
    public void setTipoCombustivel(String tipoCombustivel) {this.tipoCombustivel = tipoCombustivel;}
    public void setValor(double valor) {this.valor = valor;}

    public abstract double calculaIPVA();
}
