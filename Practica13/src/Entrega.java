import javax.swing.JOptionPane;

public class Entrega {
    private String numeroGuia;
    private String estado;


    //Constructor, estado = Pendiente
    public Entrega(String numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    //Metodo actualizarEstado
    public void actualizarEstado(String nuevoEstado){
        if(nuevoEstado.equals("En trànsito") || nuevoEstado.equals("Entregado")){
            this.estado = nuevoEstado;
        } else {
            JOptionPane.showMessageDialog(null,"Estado no valido");
        }


    }

    //SETTERS AND GETTERS
    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
