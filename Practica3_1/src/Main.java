import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int horas;
        double coste;
        double pago;


        Scanner scn = new Scanner (System.in);

        System.out.println("Ingrese la cantidad de horas trabajadas: " );
        horas = scn.nextInt();

        System.out.println("Ingrese el coste de cada hora trabajada: " );
        coste = scn.nextDouble();

        pago = horas * coste;

        System.out.println("La paga que te corresponde es de: "+ pago);

        }
    }
