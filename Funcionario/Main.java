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

            if(i == 0) {
                Pedro.nome = "Pedro";
                Pedro.salarioBruto = salario;
                Pedro.imposto = imposto;

                Pedro.calcularComissao();
                Pedro.salarioLiquido();
            }else{
                Vagner.nome = "Vagner";
                Vagner.salarioBruto = salario;
                Vagner.imposto = imposto;

                Vagner.calcularComissao();
                Vagner.salarioLiquido();
            }
            i++;
        }

    }
}
