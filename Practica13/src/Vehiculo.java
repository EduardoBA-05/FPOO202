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

    //Metodo asignar Conductor

    public  void asignarConductor(Conductor conductor){
        this.conductor = conductor;
    }


    //Metodo mostrarInformación

    public void mostrarInformacion(){

        String info = "Información del Vehículo: \n" +
                "Placa: " + placa + "\n"+
                "Modelo: " + modelo + "\n" +
                "Capacidad de Carga: " + capacidadCarga + "Kg\n";

        if (conductor != null){
            info += "Conductor Asignado:\n"+
                    " Nombre: " + conductor.getNombre() + "\n" +
                    "Identificacion: " + conductor.getIdentificacion() + "\n" +
                    " Licencia: " + conductor.getLicencia() + "\n";
        }else {
            info+= "No hay conductor asignado. \n";
        }
        JOptionPane.showMessageDialog(null, info);
    }

    //Metodo ingresarVehiculo
    public static Vehiculo ingresarVehiculo() {
        String placa = JOptionPane.showInputDialog("Ingresa la placa del vehiculo: ");
        String modelo = JOptionPane.showInputDialog("Ingresa el modelo del vehiculo: ");
        double capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la capacidad de carga del vehiculo (kg): "));

        return new Vehiculo(placa,modelo,capacidadCarga);
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
