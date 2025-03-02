
public class Spartan {
//Encapsular
        private String nombre;
    private int escudo, salud;
        private String armaPrincipal;

    public Spartan(String nombre, int escudo, int salud, String armaPrincipal) {
        this.nombre = nombre;
        this.escudo = escudo;
        this.salud = salud;
        this.armaPrincipal = armaPrincipal;
    }

    public void mostrarInfo(){
            System.out.println("------- Informacion del Spartan -------");
            System.out.println("Spartan: "+ nombre);
            System.out.println("% de Salud: "+ salud);
            System.out.println("% de Escudo: "+ escudo);
            System.out.println("Arma disponible: "+ armaPrincipal);
            System.out.println("---------------------------------------");
        }//llave mostrar Info

        public void atacar (String enemigo){
            System.out.println(nombre +" ataca a "+ enemigo + " con "+ armaPrincipal);
        }// llave atacar


        public void recargarArma(int municiones){
            int restantes = 10;
            int total = restantes + municiones;
            System.out.println(armaPrincipal+" ahora tiene disponible " + total + " balas");
        }// llave recargarArma


        public void correr(boolean status){

            if (status){
                System.out.println(nombre+" esta corriendo");
            } else{
                System.out.println(nombre+ " se detuvo");
            }
        }// correr

    private void consultarCortana(){
        System.out.println("Conversacion Privada.....");
    }


//GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public int getEscudo() {
        return escudo;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

} //llave de la clase
