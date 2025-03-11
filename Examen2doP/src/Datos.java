import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Datos {
    private String nombre, apellidoP,apellidoM,carrera;
    private int nacimiento;
    private int actual;



    //Constructor
    public Datos(String nombre, String apellidoP, String apellidoM, String carrera, int nacimiento, int actual) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.carrera = carrera;
        this.nacimiento = nacimiento;
        this.actual= 2025;
    }

    public void ingresarDatos(){

         nombre = JOptionPane.showInputDialog("Ingresa tu nombre: ").substring(0,1).toUpperCase();
          apellidoP = JOptionPane.showInputDialog("Ingresa tu apellido paterno: ").substring(0,3).toUpperCase();
         apellidoM = JOptionPane.showInputDialog("Ingresa tu apellido materno: ").substring(0,3).toUpperCase();
        nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu año de nacimiento: ").substring(2,4));
        carrera = JOptionPane.showInputDialog("Ingresa la carrera en la que estás: ").substring(0,3).toUpperCase();
        actual = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu año en curso: ").substring(2,4));

        }

        public void generarMatricula(){

       /* char letra = 0;
            for (int i =0; i<nombre.length(); i++ ) {
                letra = nombre.charAt(i);

            } JOptionPane.showMessageDialog(null," "+ (letra=1) );
            JOptionPane.showMessageDialog(null," "+ (letra=2) );
            JOptionPane.showMessageDialog(null," "+ (letra=3) );
*/
      /*  Random random = new Random();
int aleatorio;
        for (int i = 0; i <=3 ; i++  ){
             aleatorio = random.nextInt(JOptionPane.showMessageDialog(null,"");)
        } */

            JOptionPane.showMessageDialog(null,""+carrera+actual+nacimiento+nombre+apellidoP+apellidoM);
    }


        //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
} //llave principal







