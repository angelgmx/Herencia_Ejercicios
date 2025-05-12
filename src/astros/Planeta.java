package astros;

import java.util.ArrayList;

public class Planeta extends Astro {
    private double distanciaSol;
    private double orbita;
    private boolean tieneSatelite;
    private ArrayList<Satelite> satelites;


    public Planeta(String nombre, double masa, double diametro, double rotacion, double translacion, double temperatura, double gravedad, double distanciaSol, double orbita, boolean tieneSatelite) {
        super(nombre, masa, diametro, rotacion, translacion, temperatura, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbita = orbita;
        this.tieneSatelite = tieneSatelite;

        // por cada objeto de planeta se crea una lista de satélites
        this.satelites = new ArrayList<>();
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void incluirSatelite(Satelite sat) {

        if (!this.satelites.contains(sat)) {
            this.satelites.add(sat); // Agrega el satélite si no existe
            this.tieneSatelite = true;
        } else {
            int posicionSatelite = this.satelites.indexOf(sat);
            System.out.println("El satélite ya existe en la posición: " + posicionSatelite);
        }

    }


    @Override
    protected void muestra() {
        System.out.println("**PLANETA**");
        System.out.println();
        System.out.println("Distancia del sol: " + this.distanciaSol);
        System.out.println("Orbita: " + this.orbita);
        System.out.println("¿Tiene satélite?: " + (this.satelites.isEmpty() ? "no" : "si") );


        // Si es distinto de que esté vacío (muestra los satélites)
        if (!this.satelites.isEmpty()) {
            System.out.println("-- Lista de satélites --");
            for (Satelite sat: this.satelites) {
                System.out.println("- satelite: " + sat.getNombre());
            }
        }
    }

}
