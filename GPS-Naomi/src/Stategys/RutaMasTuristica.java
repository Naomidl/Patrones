package Stategys;

public class RutaMasTuristica implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB){

        System.out.println("Calculando la ruta mas turistica   ");
        System.out.println("La ruta más turistica encontrada");
        return"Ruta más turistica entre el punto a "+puntoA+ "y el punto B "+ puntoB;
    }
}
