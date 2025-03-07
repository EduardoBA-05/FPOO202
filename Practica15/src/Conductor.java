import javax.swing.JOptionPane;

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
                "Datos Conductor: \n"+
                        "ID: "+ getId() +"\n"+
                        "Nombre: "+ getNombre() +"\n"+
                        "Salario: "+ getSalario() +"\n"+
                 "Licencia: " + licencia + "\n";

        JOptionPane.showMessageDialog(null, info);
    }


}
