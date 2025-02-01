import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int altura;

        int numero;

        System.out.print("Ingresa un numero entero positivo: ");
        numero = scn.nextInt();

        scn.close();

        if (numero > 0) {
            altura= numero;
            for (int a = 1; a<= altura; a +=2){

                for (int i = a ; i >= 1; i-=2) {
                   System.out.print(i +" ");
                }
                System.out.println();
            }
        }
    }
}
