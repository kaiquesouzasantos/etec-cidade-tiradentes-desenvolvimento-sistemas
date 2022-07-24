package Pessoa.PropostaSolucao_01;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa{
    private String nome;
    private double altura;
    private int anoNascimento;

    public Pessoa(){}

    // SET's
    public void setNome(String nome){this.nome = nome;}
    public void setAltura(double altura){this.altura = altura;}
    public void setAnoNascimento(int anoNascimento){this.anoNascimento = anoNascimento;}

    // CALCULO IDADE
    public int calculoIdade(){
        Calendar calendar = GregorianCalendar.getInstance();
        return (calendar.get(Calendar.YEAR) - this.anoNascimento);
    }

    // GET's
    public String getNome(){return this.nome;}
    public double getAltura(){return this.altura;}
    public int getAnoNascimento(){return this.anoNascimento;}

    @Override
    public String toString() {
        return "NOME: "+nome+"\nALTURA: "+altura+"m\nDATA DE NASCIMENTO: "+anoNascimento+"\nIDADE: "+calculoIdade()+" anos";
    }
}
