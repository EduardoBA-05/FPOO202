import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Datos persona = new Datos("Eduardo","","","",0,2025);

        while(true) {

            String opcion = JOptionPane.showInputDialog("Menú: " + "\n"+
                    "1. Registrar persona" + "\n"+
                    "2. Generar Matrícula" + "\n"+
                    "3. Salir" + "\n");

            if (opcion == null || opcion.equals("3")){
                break;
            }

            switch (opcion){
                case "1":
                        persona.ingresarDatos();
                        JOptionPane.showMessageDialog(null,"Ingreso a la persona exitosamente");
                    break;

                case "2":
                    persona.generarMatricula();
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null,"Hasta luego");
                    break;
                default: JOptionPane.showMessageDialog(null,"Opción inválida");

            }

        }//while

    }
}
