import Stategys.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NavegadorGPS gps = new NavegadorGPS(new RutaMasRapida());
        gps.calcularRuta("punto A", "punto B");
        System.out.println();

        gps.setRutaStrategy(new RutaMasCorta());
        gps.calcularRuta("punto A","punto B");
        System.out.println();

        gps.setRutaStrategy(new RutaMasEconomica());
        gps.calcularRuta("punto A","punto B");
        System.out.println();

        gps.setRutaStrategy(new RutaMasRapida());
        gps.calcularRuta("punto A","punto B");
        System.out.println();

        gps.setRutaStrategy(new RutaMasTuristica());
        gps.calcularRuta("punto A","punto B");
        System.out.println();

        gps.setRutaStrategy(new RutaMasSegura());
        gps.calcularRuta("punto A","punto B");
        System.out.println();


    }
}