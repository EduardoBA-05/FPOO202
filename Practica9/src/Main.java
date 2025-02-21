import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta(123123,"Eduardo Badillo", 20, 1000);
        Cuenta cuenta2 = new Cuenta(456456, "Juan Olvera",19,4000);


        int opcion;

        do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion: \n" +
                    "1. Consultar saldo\n"+
                    "2. Ingresar efectivo\n"+
                    "3. Retirar efectivo\n"+
                    "4. Depositar a otra cuenta\n"+
                    "5. Salir"));

            switch (opcion){
                case 1:
                    cuenta1.ConsultarSaldo();
                    break;

                case 2:
                    cuenta1.Ingresar();
                    break;

                case 3:
                    cuenta1.Retirar();
                    break;

                case 4:
                    cuenta1.Depositar(cuenta2);
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida");
            }


        } while (opcion!=5);

    }

}
