import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

       while (true){

           String opcion;

           opcion= JOptionPane.showInputDialog(null,"Sistema de gestión de empleados:" +"\n"+
                   "1. Ingresar Conductor"+"\n"+
                   "2. Ingresar Administrativo"+"\n"+
                   "3. Mostrar listado de empleados"+"\n"+
                   "4. Salir");


           if(opcion==null ||opcion.equals("4")){
               break;
           }

           switch (opcion) {
               case "1":
                   String nombreC = JOptionPane.showInputDialog("Ingresa el nombre del Conductor");
                   int idC = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del Conductor: "));
                   double salarioC = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario del Conductor: "));
                   String licencia = JOptionPane.showInputDialog("Ingresa la licencia del Conductor: ");

                   empleados.add(new Conductor(nombreC,idC,salarioC,licencia));
                   break;

               case "2":
                   String nombreA = JOptionPane.showInputDialog("Ingresa el nombre del Administrativo");
                   int idA = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del Administrativo: "));
                   double salarioA = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario del Administrativo: "));
                   String departamento = JOptionPane.showInputDialog("Ingresa el departamento del Administrativo: ");

                   empleados.add(new Administrativo(nombreA,idA,salarioA,departamento));
                   break;


               case "3":
                   StringBuilder listaEmpleados = new StringBuilder("Listado de Empleados: \n");

                                for(Empleado emp : empleados){
                                    emp.mostrarInfo();
                                }
                                break;

               default:
                   JOptionPane.showMessageDialog(null, "Opción inválida");

                break;

           }

       }
    }
}
