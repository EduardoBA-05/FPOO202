import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Empleado {
    private String nombre;
    private int id;
    private double salario;
    ArrayList<String> empleados = new ArrayList<String>();

//Constructor
    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void mostrarInfo(){
        String info =
        "Datos Empleado: \n" +
        "ID: "+ id + "\n"+
        "Nombre: "+nombre + "\n" +
      "Salario: "+salario + "\n" ;

        JOptionPane.showMessageDialog(null,info);
    }
    

}
