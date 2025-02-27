import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //Constructor : cuentas vacías
        Cuenta cuenta1 = new Cuenta(0,"", 0, 0);
        Cuenta cuenta2 = new Cuenta(0, "",0,0);

        //Variables para cuenta 1
        int noCuenta1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de cuenta para la cuenta 1: "));
        String titular1 = JOptionPane.showInputDialog("Ingrese el titular de la cuenta 1: ");
        int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular de la cuenta 1: "));
        double saldo1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial de la cuenta 1: "));

        //SET cuenta 1
        cuenta1.setNoCuenta(noCuenta1);
        cuenta1.setTitular(titular1);
        cuenta1.setEdad(edad1);
        cuenta1.setSaldo(saldo1);

        //Variables para cuenta 2
        int noCuenta2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de cuenta para la cuenta 2: "));
        String titular2 = JOptionPane.showInputDialog("Ingrese el titular de la cuenta 2: ");
        int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del titular de la cuenta 2: "));
        double saldo2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo inicial de la cuenta 2: "));

        //SET cuenta 2
        cuenta2.setNoCuenta(noCuenta2);
        cuenta2.setTitular(titular2);
        cuenta2.setEdad(edad2);
        cuenta2.setSaldo(saldo2);

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
