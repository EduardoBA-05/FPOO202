import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double saldo = 0;
        String lineavacia;
        char operacion;
        double cantidad;



        System.out.print("Escriba la bitácora de operaciones  ");

        while (scn.hasNextLine()) {

            lineavacia = scn.nextLine().trim();

             if(lineavacia.isEmpty()) break;

             operacion = lineavacia.charAt(0);
            cantidad = Double.parseDouble(lineavacia.substring(2).trim());

            if (operacion == 'D') saldo += cantidad;
            else if (operacion == 'R') saldo-= cantidad;

        }
            scn.close();
        System.out.println(saldo);
    }
}
