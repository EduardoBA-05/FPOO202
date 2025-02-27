import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
// Constructor app vacia
        App app = new App("",0,false,false);

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: \n" +
                    "1. Configurar longitud del password\n" +
                    "2. Configurar uso de mayúsculas\n" +
                    "3. Configurar uso de caracteres especiales\n" +
                    "4. Generar password\n" +
                    "5. Comprobar fortaleza de password\n" +
                    "6. Salir"));

            switch (opcion) {
                case 1:
                    app.IngresarLongitud();
                    break;

                case 2:
                    boolean mayusculas = JOptionPane.showInputDialog
                            ("¿Desea usar mayúsculas? (si/no):").equalsIgnoreCase("si");
                    app.setMayusculas(mayusculas);
                    break;

                case 3:
                    boolean caracteresEsp = JOptionPane.showInputDialog
                            ("¿Desea usar caracteres especiales? (si/no):").equalsIgnoreCase("si");
                    app.setCaracteresEsp(caracteresEsp);
                    break;

                case 4:
                    if (app.getLongitud() == 0) {
                        JOptionPane.showMessageDialog(null, "Primero configure la longitud del password.");
                        app.IngresarLongitud();
                    }
                    app.CrearPassword();
                    break;

                case 5:
                    if (app.getPassword().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Primero genere un password.");
                    } else {
                        app.comprobarFortaleza();
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }

        } while (opcion != 6);

    }

}
