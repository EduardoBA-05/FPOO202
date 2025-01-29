import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nombre;
        String NOMBRE;
        int letras;

               System.out.println("Ingresa tu nombre: ");
               nombre = scn.nextLine().trim();

               NOMBRE = nombre.toUpperCase();
               letras = nombre.replaceAll("\\s+", "").length();

               System.out.println(NOMBRE + " tiene "+ letras + " letras.");
               scn.close();

    }
}
