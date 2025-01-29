import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String frase;

        System.out.println("Ingresa una frase: ");
        frase = scn.nextLine();

        String invertida;

        invertida = new StringBuilder(frase).reverse().toString();
        System.out.println("La frase invertida termina de esta forma: "+);

    }
}
