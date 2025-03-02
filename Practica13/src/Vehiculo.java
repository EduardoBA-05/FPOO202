import javax.swing.JOptionPane;

public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor;



    //Constructor
    public Vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }



    //Metodo IngresarVehiculo

    public void IngresarVehiculo(){

        placa = JOptionPane.showInputDialog("Ingresa la placa de tu vehiculo: ");
        modelo = JOptionPane.showInputDialog("Ingresa el modelo de tu vehiculo: ");
        capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la capacidad de carga de tu vehiculo: "));
        

    }


    //SETTERS AND GETTERS
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }




}
