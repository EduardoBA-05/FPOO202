import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String palindromo;

        String reverso = "";

        System.out.println("Ingresa una cadena de caracteres: ");
        palindromo = scn.nextLine().toLowerCase();

        for (int i= palindromo.length() -1; i>=0; --i){

            reverso = reverso + palindromo.charAt(i);
        }
        if (palindromo.equals(reverso)){
            System.out.println(palindromo + "  Es un palindromo");
        } else {
            System.out.println(palindromo +"  No es un palindromo");
        }



    }
}
