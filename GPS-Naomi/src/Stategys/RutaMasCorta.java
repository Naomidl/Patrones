package Stategys;

public class RutaMasCorta implements RutaStrategy {
    @Override
    public String calcularRuta(String puntoA, String puntoB){

        System.out.println("Calculando la ruta mas corta   ");
        System.out.println("La ruta más corta encontrada");
        return"Ruta más corta entre el punto a "+puntoA+ "y el punto B "+ puntoB;
    }
}
