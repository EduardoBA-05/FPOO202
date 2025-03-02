import javax.swing.JOptionPane;

public class Conductor {
    private String nombre;
    private String licencia;
    private String identificacion;

    //Constructor
    public Conductor(String nombre, String licencia, String identificacion) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.identificacion = identificacion;
    }

    //Metodo ingresarConductor
    public static Conductor ingresarConductor(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor: ");
        String identificacion = JOptionPane.showInputDialog("Ingresa la identificacion del conductor: ");
        String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor: ");

        return new Conductor(nombre,identificacion,licencia);
    }

    //SETTERS AND GETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
