import javax.swing.JOptionPane;

public class Envio {
    private String codigoEnvio;
    private String destino;
    private double peso;

    //Constructores sobrecargados
    public Envio(String codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    //Constructores sobrecargados
    public Envio(String codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

   public static Envio crearEnvio(){
        String codigo = JOptionPane.showInputDialog("Ingresa el codigo de envio: ");
        String destino = JOptionPane.showInputDialog("Ingresa el destino: ");
        String peso2 = JOptionPane.showInputDialog("Ingresa el peso(opcional): ");
        double peso = peso2.isEmpty() ? 0.0 : Double.parseDouble(peso2);
        return new Envio(codigo,destino,peso);
   }



    //SETTERS AND GETTERS
    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
