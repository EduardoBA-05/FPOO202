import javax.swing.JOptionPane;
import java.util.Random;
import java.util.random.RandomGenerator;

public class App {
  private String password;
  private int longitud;
  private boolean mayusculas;
  private boolean CaracteresEsp;

    public App(String password, int longitud, boolean mayusculas, boolean caracteresEsp) {
        this.password = password;
        this.longitud = longitud;
        this.mayusculas = mayusculas;
        CaracteresEsp = caracteresEsp;
    }

    public void IngresarLongitud(){

        String input = JOptionPane.showInputDialog("Ingresa la cantidad de caracterers de tu contraseña: ");

       if(input==null || input.trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "No se ingreso un valor. El password sera por defecto de 8 caracteres ");
           longitud = 8;
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

        for(int i = 1; i <=longitud ; i++  ){

            password+=caracteres.charAt(random.nextInt(caracteres.length()));

        }//generador

        JOptionPane.showMessageDialog(null,"Tu password generado es: " + password);
    }//CrearPassword

    public void comprobarFortaleza(){
        int fortaleza = 0;

        if(longitud >= 12) fortaleza++;
        if(mayusculas) fortaleza++;
        if(CaracteresEsp) fortaleza++;

        if (fortaleza == 1) {
            JOptionPane.showMessageDialog(null, "El password es muy fuerte");
        } else if (fortaleza == 2) {
            JOptionPane.showMessageDialog(null, "El password es fuerte");
        } else if (fortaleza == 3) {
            JOptionPane.showMessageDialog(null, "El password es debil");
        } else {
            JOptionPane.showMessageDialog(null, "El password es muy debil");
        }
    }



    // GETTERS AND SETTERS
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(boolean mayusculas) {
        this.mayusculas = mayusculas;
    }

    public boolean isCaracteresEsp() {
        return CaracteresEsp;
    }

    public void setCaracteresEsp(boolean caracteresEsp) {
        CaracteresEsp = caracteresEsp;
    }

}
