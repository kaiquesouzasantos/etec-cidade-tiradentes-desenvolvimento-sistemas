package PessoaRevisao;

public class Pessoa {
    private String nome, frase;
    private double altura;

    public Pessoa(){}
    public Pessoa(String nome, String frase, double altura){
        this.nome = nome;
        this.frase = frase;
        this.altura = altura;
    }

    // SET's
    public void setNome(String nome){this.nome = nome;}
    public void setAltura(double altura){this.altura = altura;}
    public void setFrase(String frase){this.frase = frase;}

    // GET's
    public String getNome(){return this.nome;}
    public String getFrase(){return this.frase;}
    public double getAltura(){return this.altura;}


    // RETURN's
    public String retornaAtributos(){
        if(this.frase.equalsIgnoreCase("")){
            return "NOME: "+this.nome+"\nALTURA: "+this.altura+"m\nFRASE: FRASE DEFAULT";
        } return "NOME: "+this.nome+"\nALTURA: "+this.altura+" m\nFRASE: "+this.frase;
    }

    public String retornaFrase(){return this.frase;}
    public String retornaFrase(String frase){return frase;}
}
