import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int payasos;
        int munecas;
        int peso_payaso;
        int peso_muneca;
        int total;

        System.out.println("Ingresa la cantidad de payasos comprados: ");
        payasos = scn.nextInt();

        System.out.println("Ingresa la cantidad de munecas comprados: ");
        munecas = scn.nextInt();

        peso_payaso = payasos * 112;
        peso_muneca = munecas * 75;

        total = peso_payaso + peso_muneca;

        System.out.println("El peso del paquete es de: "+ total + " gramos");

    }

}
