import javax.swing.JOptionPane;


public class Empleado {
    private String nombre;
    private int id;
    private double salario;


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

    //GETTERS Atributos
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }
}
