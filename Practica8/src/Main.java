
public class Main {
    public static void main(String[] args) {
        //Crear el primer objeto
        Spartan MasterChief = new Spartan("John",100,70,"Rifle de asalto");

        //usamos los métodos
        MasterChief.mostrarInfo();
        MasterChief.atacar("Grunt");
        MasterChief.recargarArma(75);
        MasterChief.correr(true);
        //Intento de uso de un método privado
       // MasterChief.consultarCortana(); //No se puede consultar debido a que es privado el método

        //usamos get y set para cambiar atributo nombre
        MasterChief.setNombre("Eduardo Badillo");
        MasterChief.mostrarInfo();
        System.out.println(MasterChief.getNombre());


        //Crear segundo objeto
        Spartan jefeMaestro = new Spartan("ElMamamatrix",1000,500,"Trompeta del juicio");

        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Shadow");
        jefeMaestro.recargarArma(100);
        jefeMaestro.correr(true);

    }
}
