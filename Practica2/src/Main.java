

//Zona de importacion
import java.util.Scanner;

// Clase principal

public class Main {

    //Metodo Principal
    public static void main(String[] args) {
/*
        System.out.printf("Hello, Eduardo Badillo!");
        System.out.printf("Hello, Eduardo Badillo!");
        System.out.printf("Hello, Eduardo Badillo!");
*/

        // 2. Cadenas
/*
        String cadena= "Eduardo" + "Badillo" + "Arreola";
        System.out.println(cadena);
        System.out.println(cadena.length());  //lenght = longitud de cadena

        //Extraccion de caracteres en base a parametros
        System.out.println(cadena.substring(2, 5)); // pone un limite que empieza en el primer numero "2" y "5" en el cual imprime a partir del 3 al 5
        System.out.println(cadena.substring(2)); //imprime todos los caracteres menos los indicados "2"
        System.out.println(cadena.substring(0,5));// imprime todos los caracteres en el rango de "0" a "5"
*/


/*
        //3. Variables
        String cadena= "333", cadena2, cadena3;
        int entero= 3, entero2, entero3;
        double decimal= 3.3, decimal2, decimal3;

        //Convertir cadena a int
        entero2= Integer.parseInt(cadena);
        System.out.println(entero2);

        //Convertir double a int
        entero3= (int) decimal;
        System.out.println(entero3);

        //Convertir double a cadena
        cadena2= String.valueOf(decimal);
        System.out.println(cadena2);

        //Convertir int a double
        decimal2= Double.valueOf(entero);
        System.out.println(decimal2);

        //conversion implicita
        int i= 12;
        double numd= i;
        System.out.println(numd);// Solo funciona en datos númericos
*/


//        4. Solicitud de datos
/*
        Scanner scn= new Scanner(System.in); //System.in sirve para indicar la entrada de datos

        System.out.println("Escribe una cadena: ");
        String cadena= scn.nextLine();// nextLine para especificar que cadena lo vamos a vaciar dentro de un String

        System.out.println("Escribe un numero entero: ");
        int entero= scn.nextInt(); // nextInt para numeros enteros

        System.out.println("Escribe un numero decimal: ");
        double decimal = scn.nextDouble();// nextDouble para numeros dobles

        System.out.println("Cadena de caracteres guardada: "+ cadena);
        System.out.println("Numero entero guardado: "+entero);
        System.out.println("Numero decimal guardado: "+decimal);

 */

        // 5. Boolean, operadores logico y de comparacion
   /*   System.out.println(10 > 9);
        System.out.println(10 == 9);
        System.out.println(10 < 9);
        System.out.println(10 >= 9);
        System.out.println(10 <= 9);
        System.out.println(10 != 9);
*/

        // operadores logicos
        int x= 3;
        System.out.println(x<5 && x>10); //false
        System.out.println(x<5 || x>10); //true
        System.out.println(!(x<5 && x>10)); //true
        System.out.println(!(x<5 || x>10)); //false

        }

    }
