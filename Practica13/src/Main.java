import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = null;
        Conductor conductor = null;
        Envio envio = null;
        Entrega entrega = null;

        while(true) {
            String opcion = JOptionPane.showInputDialog("Menú: " + "\n"+
                    "1. Registrar Vehiculo" + "\n"+
                    "2. Registrar Conductor" + "\n"+
                    "3. Asignar Conductor a Vehiculo" + "\n"+
                    "4. Registrar Envio" + "\n"+
                    "5. Registrar Entrega" + "\n"+
                    "6. Actualizar Estado de Entrega" + "\n"+
                    "7. Mostrar Información" + "\n"+
                    "8. Salir" + "\n");



            if (opcion == null || opcion.equals("8")){
                break;
            }

            switch (opcion){

                    case "1":
                    vehiculo = Vehiculo.ingresarVehiculo();
                    JOptionPane.showMessageDialog(null,"Vehiculo registrado con exito");
                    break;

                case "2":
                    conductor = Conductor.ingresarConductor();
                    JOptionPane.showMessageDialog(null, "Conductor registrado con exito");
                    break;

                case "3":
                    if(vehiculo != null && conductor != null){
                        vehiculo.asignarConductor(conductor);
                        JOptionPane.showMessageDialog(null,"Conductor asignado al vehiculo");

                    }else {
                        JOptionPane.showMessageDialog(null, "Primero debe registrar un vehiculo y un conductor");
                    }
                    break;
                case "4":
                    envio = Envio.crearEnvio();
                    JOptionPane.showMessageDialog(null,"Envio registrado con exito");
                    break;

                case "5":
                    String numeroGuia = JOptionPane.showInputDialog("Ingrese el numero de guia: ");
                    entrega = new Entrega(numeroGuia);
                    JOptionPane.showMessageDialog(null, "Entrega registrada con exito");
                    break;

                case "6":

                    if(entrega!=null){

                        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En transito/Entregado): ");
                        entrega.actualizarEstado(nuevoEstado);
                    } else{
                        JOptionPane.showMessageDialog(null,"Primero debe registrar una entrega");
                    }

                    break;
                case "7":
                    if(vehiculo!=null){
                        vehiculo.mostrarInformacion();
                    }else {
                            JOptionPane.showMessageDialog(null,"Primero debe registrar un vehiculo");
                    }
                    break;
                case "8":
                    JOptionPane.showMessageDialog(null,"Hasta luego");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opción invalida");

            }
        }




    }

}
