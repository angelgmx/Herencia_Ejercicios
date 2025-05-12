package astros;

public abstract class Astro {
    private String nombre;
    private double masa;
    private double diametro;
    private double radio;
    private double translacion;
    private double temperatura;
    private double gravedad;

    public Astro(String nombre, double masa, double diametro, double rotacion, double translacion, double temperatura, double gravedad) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.radio = rotacion;
        this.translacion = translacion;
        this.temperatura = temperatura;
        this.gravedad = gravedad;
    }

    protected abstract void muestra();

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTranslacion() {
        return translacion;
    }

    public void setTranslacion(double translacion) {
        this.translacion = translacion;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}

