package astros;

public class Satelite extends Astro {
    private double distanciaPlaneta;
    private double orbitaPlanetaria;
    private Planeta planetaPerteneciente;


    public Satelite(String nombre, double masa, double diametro, double rotacion, double translacion, double temperatura, double gravedad, double distanciaPlaneta, double orbitaPlanetaria, Planeta planetaPerteneciente) {
        super(nombre, masa, diametro, rotacion, translacion, temperatura, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPerteneciente = planetaPerteneciente;
    }


    @Override
    protected void muestra() {
        System.out.println("**Satelite**");
        System.out.println("Distancia del planeta: " + this.distanciaPlaneta);
        System.out.println("OrbitaPlanetaria: " + this.orbitaPlanetaria);
        System.out.println("Pertenece al planeta: " + this.planetaPerteneciente.getNombre());
    }

    // Getters y Setters
    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planeta getPlanetaPerteneciente() {
        return planetaPerteneciente;
    }

    public void setPlanetaPerteneciente(Planeta planetaPerteneciente) {
        this.planetaPerteneciente = planetaPerteneciente;
    }






}
