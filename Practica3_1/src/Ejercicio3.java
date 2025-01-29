import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {

        int numero;
        int suma;
        Scanner scn = new Scanner (System.in);

        System.out.println("Ingrese un numero para sumar: ");
        numero = scn.nextInt();



        for (int i= 0; i <=numero; i++ ){
            suma = numero + i;

            System.out.println(numero+ "");
        }
        System.out.println("la suma es: "+ suma);
    }
}
