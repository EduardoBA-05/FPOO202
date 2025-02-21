import javax.swing.JOptionPane;

public class Cuenta {
    int NoCuenta;
    public double saldo;
    public int edad;
    public String titular;
    public double monto;


    public Cuenta(int NoCuenta, String titular, int edad, double saldo){
        this.NoCuenta = NoCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public void ConsultarSaldo() {
        JOptionPane.showMessageDialog(null, "El saldo de tu cuenta es: " + saldo);
    }

    public void Ingresar(){
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de tu monto: "));
        saldo = saldo + monto;
        JOptionPane.showMessageDialog(null,"El saldo es ahora de: " + saldo);
    }

    public void Retirar(){
        double retiro;
        retiro= Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a retirar: "));

        if(retiro>saldo){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {
            saldo = saldo - retiro;
            JOptionPane.showMessageDialog(null,"Tu saldo es: " + saldo);
        }
    }

    public void Depositar(Cuenta otraCuenta){
        double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de tu monto a depositar: "));

        if (monto>saldo){
            JOptionPane.showMessageDialog(null,"Saldo insuficiente para realizar el deposito");
        } else {
            saldo -= monto;
            otraCuenta.saldo += monto;

            JOptionPane.showMessageDialog(null, "Deposito realizado con éxito. Tu saldo es: " +saldo);
        }
    }//Depositar


}

