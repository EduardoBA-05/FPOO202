public class Main {

    public static void main(String[] args){

        System.out.println("\n");

        SpartanII jefemaestro  = new SpartanII("John", 90, "Rifle de asalto",0);

        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("Covenant");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        System.out.println("\n");

        SpartanIII ElMamamatrix = new SpartanIII("Eduardo ",130,"Francotirador",50);
        ElMamamatrix.mostrarInfo();
        ElMamamatrix.camuflajeActivo();
        ElMamamatrix.atacar("Jackals");
        ElMamamatrix.recibirDano(60);
        ElMamamatrix.recargarEscudo();

        System.out.println("\n");

        SpartanIV MasterChief = new SpartanIV("Tyrone ", 120, "Pistola", 80);
        MasterChief.mostrarInfo();
        MasterChief.usarPropulsores();
        MasterChief.atacar("Hunter");
        MasterChief.recibirDano(80);
        MasterChief.recargarEscudo();
    }
}
