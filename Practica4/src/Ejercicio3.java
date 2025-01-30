import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int edad;
        double precio;
        Scanner scn = new Scanner(System.in);


        System.out.println("Ingresa tu edad");
        edad = scn.nextInt();

        if(edad<=4){
            System.out.println("Puedes entrar gratis");
            precio = 0;

        }else if (edad<=18) {
            System.out.println("La entrada cuesta 110");
            precio = 110;
        } else if (edad>18) {
            System.out.println("La entrada cuesta 190");
            precio = 190;
        }
    }
}
