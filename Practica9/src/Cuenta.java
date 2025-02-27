import javax.swing.JOptionPane;

public class Cuenta {
   private int NoCuenta;
    private double saldo;
    private int edad;
    private String titular;
    private double monto;

//Constructor
    public Cuenta(int NoCuenta, String titular, int edad, double saldo){
        this.NoCuenta = NoCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }//Cuenta



    public void ConsultarSaldo() {
        JOptionPane.showMessageDialog(null, "El saldo de tu cuenta es: " + saldo);
    }//Consultar

    public void Ingresar(){
        monto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de tu monto: "));
        saldo = saldo + monto;
        JOptionPane.showMessageDialog(null,"El saldo es ahora de: " + saldo);
    }//Ingresar

    public void Retirar(){
        double retiro;
        retiro= Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a retirar: "));

        if(retiro>saldo){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
        } else {
            saldo = saldo - retiro;
            JOptionPane.showMessageDialog(null,"Tu saldo es: " + saldo);
        }
    }//Retirar

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


    //GETTERS AND SETTERS
    public int getNoCuenta() {
        return NoCuenta;
    }
    public void setNoCuenta(int noCuenta) {
        NoCuenta = noCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
}

