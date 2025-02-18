
public class Main {
    public static void main(String[] args) {
        //Crear el primer objeto
        Spartan MasterChief = new Spartan();
        // usar atributos
        MasterChief.nombre= "John";
        MasterChief.salud= 100;
        MasterChief.escudo= 70;
        MasterChief.armaPrincipal= "Rifle de asalto";

        //usamos los métodos
        MasterChief.mostrarInfo();
        MasterChief.atacar("Grunt");
        MasterChief.recargarArma(75);
        MasterChief.correr(true);

        //Crear segundo objeto
        Spartan jefeMaestro = new Spartan();

        jefeMaestro.nombre = "ElMamamatrix";
        jefeMaestro.salud= 1000;
        jefeMaestro.escudo= 500;
        jefeMaestro.armaPrincipal= "Trompeta del juicio";

        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Shadow");
        jefeMaestro.recargarArma(100);
        jefeMaestro.correr(true);

    }
}
