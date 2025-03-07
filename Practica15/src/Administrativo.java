import javax.swing.*;

public class Administrativo extends Empleado {
    private String departamento;


    //Constructor Empleado // Administrativo
    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInfo(){
        String info =
                "Datos Administrativo: \n"+
                        "ID: "+ getId() +"\n"+
                        "Nombre: "+ getNombre() +"\n"+
                        "Salario: "+ getSalario() +"\n"+
                "Departamento: " + departamento + "\n";

        JOptionPane.showMessageDialog(null, info);
    }





}
