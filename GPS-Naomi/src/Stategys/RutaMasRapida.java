package Stategys;

public class RutaMasRapida implements RutaStrategy{

    @Override
    public String calcularRuta(String puntoA, String puntoB){

        System.out.println("Calculando la ruta mas rápida   ");
        System.out.println("La ruta más rápida encontrada");
        return"Ruta más rápida entre el punto a "+puntoA+ "y el punto B "+ puntoB;
    }
}
