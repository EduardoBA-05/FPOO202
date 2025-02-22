import javax.swing.JOptionPane;
import java.util.Random;
import java.util.random.RandomGenerator;

public class App {
  public String password;
  public int longitud;
  public boolean mayusculas;
  public boolean CaracteresEsp;



    public void IngresarLongitud(int longitud){

        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de caracterers de tu contraseña: "));

        if(longitud<=8){
            longitud=8;
        }

    }//IngresarLongitud




    public void CrearPassword(){
        String caracteres= "abcdefghijklmnopqrstuvwxyz0123456789";
        password ="";

        String respuesta_mayusculas = JOptionPane.showInputDialog("Desea que su password agregue mayusculas (si/no): ");

        mayusculas = respuesta_mayusculas.equalsIgnoreCase("si");

        if(mayusculas){
            caracteres+="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }

        String respuesta_caracteresEsp = JOptionPane.showInputDialog("Desea que su password contenga caracteres especiales (si/no): ");

        CaracteresEsp = respuesta_caracteresEsp.equalsIgnoreCase("si");

        if(CaracteresEsp){
            caracteres +="~`!@#$%^&*()-_=+[{]}|;:',<.>/?";
        }

        Random random = new Random();

        for(int i = 10; i <=longitud ; i++  ){

            password+=caracteres.charAt(random.nextInt(caracteres.length()));

        }//generador

        JOptionPane.showMessageDialog(null,"Tu password generado es: " + password);
    }//CrearPassword

    public void comprobarFortaleza(){
        int fortaleza = 0;

        if(longitud >= 12) fortaleza++;
        if(mayusculas) fortaleza++;
        if(CaracteresEsp) fortaleza++;


    }
}
