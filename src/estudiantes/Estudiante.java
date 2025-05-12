package estudiantes;

public class Estudiante extends Persona{
    private int numMatricula;

    public Estudiante(String dni, String nombre, String apellidos, int edad, int numMatricula) {
        super(dni, nombre, apellidos, edad);
        this.numMatricula = numMatricula;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }



    @Override
    public String toString() {
        return super.toString() +
                "Matricula =" + numMatricula +
                '}';
    }
}


