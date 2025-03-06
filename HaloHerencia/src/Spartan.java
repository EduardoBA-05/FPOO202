public class Spartan extends Soldado {
    private int escudo;

    //Constructor
    public Spartan(String nombre, int salud, String arma, int escudo){
        super(nombre, salud, arma); //Referencia a las variables de la clase Padre
        this.escudo = escudo;  //Referencia a la variable utilizada dentro del método, anteriormente definida
    }
@Override  //Sobreescritura del método alternando entre el uso de la clasePadre(Soldado) y la clase utilizada (Spartan)
    public void recibirDano(int dano){
        if(escudo>0){
            escudo -= dano;
            if(escudo <0){
                salud += escudo;
                escudo = 0;
            }//escudo <0

            System.out.println(nombre + " Recibió daño: " + escudo + " Salud: "+salud);

        }//escudo>0
        else {
            super.recibirDano(dano);
        }
    }

    public void recargarEscudo(){
        this.escudo = 100;
        System.out.println(nombre + " ha recargado su escudo al máximo ");

    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escudo: "+ this.escudo);
    }

}
