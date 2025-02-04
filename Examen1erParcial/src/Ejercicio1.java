import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numero;


        System.out.print("Ingresa un numero entre 200 y 400: ");
        numero = scn.nextInt();

        if (numero % 2 == 0) {
            if (numero < 200) {
                System.out.println("El numero debe ser mayor a 200");

            }
             if (numero > 400) {
                    System.out.println("El numero debe ser menor a 400");
             }
                for (int i = numero; i <= 400; i += 2) {
                    if(numero<200){
                        break;
                    }
                    System.out.print(i);
                    System.out.print(",");


                    if (i == 400) {
                        break;
                    }

                }

        }
        else {
            System.out.println("El programa solo admite numeros par");
        }

    }
}

