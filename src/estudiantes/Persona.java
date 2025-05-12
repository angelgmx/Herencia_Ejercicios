package estudiantes;

import java.util.Objects;

public class Persona {

    private static final int MAYOR_EDAD = 18;

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {

    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void imprime(){
        if (esMayorEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }


    public boolean esMayorEdad(){
        boolean esMayor = false;

        if (this.edad >= MAYOR_EDAD) {
            esMayor = true;
        }
        return esMayor;
    }

    public int diferenciaEdad(Persona persona){
         return  Math.abs(this.edad - persona.getEdad());
    }

    public int getMayorEdad() {
        return MAYOR_EDAD;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "La info de la Persona: " +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(dni, persona.dni) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellidos, edad);
    }
}
