package Stategys;

public class RutaMasEconomica implements RutaStrategy{

    @Override
    public String calcularRuta(String puntoA, String puntoB){

        System.out.println("Calculando la ruta mas enonómica   ");
        System.out.println("La ruta más económica encontrada");
        return"Ruta más económico entre el punto a "+puntoA+ "y el punto B "+ puntoB;
    }
}
