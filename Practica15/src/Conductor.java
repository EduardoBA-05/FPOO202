import javax.swing.*;

public class Conductor extends Empleado{

    private String licencia;

    //Constructor Empleado/ Conductor
    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    //mostrarInfo
    @Override
    public void mostrarInfo(){
        String info =
                 "Licencia: " + licencia;

        JOptionPane.showMessageDialog(null, info);
    }
@Override
    public Empleado IngresarEmpleado(){

        licencia = JOptionPane.showInputDialog("Ingresa la licencia:  ");


    }


}
