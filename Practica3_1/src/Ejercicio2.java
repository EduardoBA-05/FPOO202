import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        String nombres;
        Scanner scn = new Scanner (System.in);
        System.out.println("Ingresa tu nombre completo: ");
        nombres = scn.nextLine();
        System.out.println("Nombre en minusculas: "+ nombres.toLowerCase());
        System.out.println("Nombre en mayusculas: "+ nombres.toUpperCase());
        System.out.println("Nombre con las iniciales en mayuscula: "+ invertir(nombres));
        scn.close();
    }
        private static String invertir (String nombres) {
            String [] iniciales = nombres.split(" ");
            StringBuilder resultado = new StringBuilder();

            for (String inicial : iniciales) {
                resultado.append(inicial.substring(0,1).toUpperCase()).append(inicial.substring(1).toLowerCase()).append("");
                }
            return resultado.toString().trim();
            }

    }
