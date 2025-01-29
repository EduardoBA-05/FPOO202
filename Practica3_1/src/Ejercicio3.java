import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {

        int numero;
        int suma= 0;
        Scanner scn = new Scanner (System.in);

        System.out.println("Ingrese un numero para sumar: ");
        numero = scn.nextInt();



        for (int i= 1; i <=numero; i++ ){
            suma += i;

            System.out.println("La suma hasta el numero " + i +" : "+suma);
        }
        System.out.println("la suma de los numeros hasta"+numero+ " es: "+ suma);
    }
}
