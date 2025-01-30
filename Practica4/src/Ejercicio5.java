import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float numero1, numero2;
        String operador ;
        double resultado = 0;



        System.out.println("Ingresa un numero: ");
        numero1 = scn.nextFloat();

        System.out.println("Ingresa otro numero: ");
        numero2 = scn.nextFloat();


        System.out.println("Operador + -> Suma");
        System.out.println("Operador - -> Resta");
        System.out.println("Operador * -> Multiplicacion");
        System.out.println("Operador / -> Division");

        System.out.println("Ingresa el operador: ");
        operador = scn.next();

        switch (operador){

            case "+" :
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;

            case "-" :
                resultado = numero1 - numero2;
                System.out.println (resultado);

                break;

            case "*" :
                resultado = numero1 * numero2;
                System.out.println (resultado);

                break;

            case "/" :
                if (numero2 != 0) { // Validar división por cero
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre 0");
                }
                break;

            default:
                System.out.println("error");
                break;


        }







    }
}
