import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String palabra;
        char letra;

        System.out.print("Ingresa una palabra: ");
        palabra = scn.nextLine();



        scn.close();

System.out.print("Resultado: ");

        for (int i =0; i<palabra.length(); i++ ){

            System.out.print("  Letra  " +i + ":");

            letra = palabra.charAt(i);

            System.out.print(" " + letra );


        }

    }
}
