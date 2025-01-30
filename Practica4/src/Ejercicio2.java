import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero: ");
        numero = scn.nextInt();

       if(numero%2==0){
           System.out.println("El numero es par");
       } else {
           System.out.println(("El numero es impar"));
       }

    }
}
