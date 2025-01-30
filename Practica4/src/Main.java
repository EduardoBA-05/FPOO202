import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
    Scanner scn = new Scanner(System.in);
    String contrasena = "Contrasena123";


    System.out.println("Ingresa la contrasena: ");
    String correcta= scn.nextLine();

    if (contrasena.equalsIgnoreCase(correcta)){
        System.out.println("La contrasena es correcta");
    } else {
        System.out.println("La contrasena es incorrecta");
    }

    scn.close();

        }
    }
