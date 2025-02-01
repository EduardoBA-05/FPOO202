import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String frase;
        char letra;
        int contador = 0;

        System.out.print("Introduce una frase: ");
        frase = scn.nextLine();

        System.out.print("Introduce una letra: ");
        letra = scn.next().charAt(0);


        scn.close();

        for (int i=0; i< frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;

            }
        }
            System.out.println("La letra " + letra + "  se repite en la frase " + contador + " veces");
    }
}
