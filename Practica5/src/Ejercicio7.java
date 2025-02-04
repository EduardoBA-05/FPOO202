import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = 0;
        int base;
        int filas;

        System.out.print("Ingresa el numero para la base del arbol: ");
        base = scn.nextInt();

        scn.close();

        filas = (base +1) / 2;

        while (i< filas) {
            System.out.println(" ".repeat(filas -i - 1)+
                    "*".repeat(2* i + 1));
            i++;

        }

    }
}
