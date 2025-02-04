import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero: ");
        numero = scn.nextInt();

        if (numero>0){
            for (int i= numero ; i<=numero; i--){

                System.out.print(i);
                System.out.print(",");

                if (i==0){
                    break;
                }

            }

        } else {
            System.out.println("El programa solo funciona con numeros positivos");
        }

    }
}
