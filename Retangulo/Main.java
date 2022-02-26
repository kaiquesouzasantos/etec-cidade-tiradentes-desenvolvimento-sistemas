import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static Retangulo retangulo1 = new Retangulo();
    public static Retangulo retangulo2 = new Retangulo();
    public static void main(String[] args) {
        double base, altura;
        int i = 0;
        System.out.println("CALCULO DA AREA DO RETANGULO\n");

        while(i < 2){
            System.out.print("DIGITE O VALOR DA BASE: ");
            base = sc.nextDouble();
            System.out.print("DIGITE O VALOR DA ALTURA: ");
            altura = sc.nextDouble();

            if(i == 0){
                retangulo1.baseRetangulo = base;
                retangulo1.alturaRetangulo = altura;
                System.out.println("A AREA DO RETANGULO1 É IGUAL Á "+retangulo1.calcularArea()+"\n");
            }else{
                retangulo2.baseRetangulo = base;
                retangulo2.alturaRetangulo = altura;
                System.out.println("A AREA DO RETANGULO2 É IGUAL Á "+retangulo2.calcularArea());
            }
            i++;
        }
    }
}
