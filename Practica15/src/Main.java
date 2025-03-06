import javax.swing.*;

public class Main {
    public static void main(String[] args) {

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

       }



    }
}
