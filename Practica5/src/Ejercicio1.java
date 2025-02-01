import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int numero = 0;
        float residuo = 0;


        System.out.println("Ingresa un numero: ");
        numero = scn.nextInt();

        scn.close();
if (numero>0){
        for (int i= 1; i <= numero; i+=2){

            if (i > 1){
                System.out.print(",");
            }
            System.out.print(i);
        }
        System.out.println();

            } else {
            System.out.print("El programa solo funciona con numeros postivos");
            }

    }
}
