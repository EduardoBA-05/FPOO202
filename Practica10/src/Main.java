import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        App app = new App();
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Selcciona una opcion: \n" +
                    "1. Ingresa longitud del password\n" +
                    "2. Generar password\n" +
                    "3. Comprobar fortaleza de password\n" +
                    "4.Salir"));

            switch (opcion) {
                case 1:
                    app.IngresarLongitud();
                    break;

                case 2:
                    app.CrearPassword();
                    break;

                case 3:
                    app.comprobarFortaleza();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }


        } while (opcion != 4);

    }
}


