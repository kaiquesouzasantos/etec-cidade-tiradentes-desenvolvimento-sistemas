package Funcionario;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static Funcionario Pedro = new Funcionario();
    public static Funcionario Vagner = new Funcionario();

    public static void main(String[] args) {
        double salario, imposto;
        int i = 0;
        System.out.println("CALCULO DE SALARIO LIQUIDO\n");

        while (i < 2){
            System.out.print("DIGITE SEU SALARIO BRUTO: ");
            salario = sc.nextDouble();
            System.out.print("DIGITE A PORCENTAGEM DO IMPOSTO APLICADO: ");
            imposto = sc.nextDouble();

            if(i == 0) {atribuiObjeto(Pedro, "Pedro", salario, imposto);
            }else{atribuiObjeto(Vagner, "Vagner", salario, imposto);}
            i++;
        }
    }

    public static void atribuiObjeto(Funcionario funcionario, String nome, double salario, double imposto){
        funcionario.nome = nome;
        funcionario.salarioBruto = salario;
        funcionario.imposto = imposto;

        funcionario.calcularComissao();
        funcionario.salarioLiquido();
    }
}
