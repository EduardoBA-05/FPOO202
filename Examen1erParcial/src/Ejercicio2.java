import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String palabra;
        String letra;

        System.out.print("Ingresa una palabra: ");
        palabra = scn.nextLine();



        scn.close();


        for (int i =0; i<palabra.length(); i++ ){

            System.out.print("Letra" +i);



        }

    }
}
