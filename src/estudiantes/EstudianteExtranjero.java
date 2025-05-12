package estudiantes;

public class EstudianteExtranjero  extends  Estudiante{
    private String nacionalidad;



    public EstudianteExtranjero(String dni, String nombre, String apellidos, int edad, int numMatricula, String nacionalidad) {
        super(dni, nombre, apellidos, edad, numMatricula);
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "nacionalidad='" + nacionalidad + '\'' +
                '}';
    }


    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}
