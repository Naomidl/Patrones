package Stategys;

public class RutaMasSegura implements RutaStrategy{
    @Override
    public String calcularRuta(String puntoA, String puntoB){

        System.out.println("Calculando la ruta mas segura   ");
        System.out.println("La ruta más segura encontrada");
        return"Ruta más segura entre el punto a "+puntoA+ "y el punto B "+ puntoB;
    }
}
