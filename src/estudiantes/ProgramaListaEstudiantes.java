package estudiantes;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * CRear la clase Estudiante, que hereda de alguna de las clases de Persona que tengais (que tenga nombre, apellidos, dni). La clase Estudiante deberá incluir además el nº de matricula.
 * Crear un arraylist de clase Estudiante, e incluir 3 alumnos con toda su información.
 * <p>
 * Queremos tener una lista de alumnos e impedir que se incluyan alumnos repetidos:
 * Para ello, pedir la informacion de un estudiante al usuario -> nombre, apellidos, dni y nº matricula
 * Comprobar usando contains o indexOf si ese estudiante se puede incluir en la lista. No queremos estudiantes repetidos.
 * Hacer esto en bucle para probar distintos casos
 * <p>
 * Variacion del programa: tras insertar estudiantes, pedir al usuario qué alumno quiere buscar. Utilizar los mismos campos para localizarlo (nombre, apellidos, dni) utilizando indexOf
 * Repetir en bucle hasta que escriba SALIR en alguno de los campos
 * Variacion del programa (2): Introducir una clase EstudianteExtranjero, que hereda de Estudiante. Se añadirá un campo nuevo llamado "paisNacionalidad" de tipo String. A la hora de introducir estudiantes, preguntar la nacionalidad del estudiante. Si esta es distinta de "Española", se trata de un estudiante extranjero, por lo que habrá que crear un objeto de EstudianteExtranjero, añadirle la nacionalidad y meterlo a la lista de estudiantes.
 * <p>
 * Al salir, mostrar sólo las nacionalidades de los estudiantes extranjeros, iterando sobre la lista y usando instanceof
 */
public class ProgramaListaEstudiantes {

    private static Scanner scanner = new Scanner(System.in);

    public static final String NAC_ESPAÑOLA = "Española";
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        estudiantes.add(new Estudiante("1111111A", "Carlos", "Perez", 30, 1234));
        estudiantes.add(new Estudiante("2222222B", "Luisa", "Gomez", 30, 5678));
        estudiantes.add(new Estudiante("3333333C", "John", "Doe", 30, 00001));

        imprimirListaAlumnos(estudiantes);
        menuAlumnos(estudiantes);



    }



    private static void imprimirListaAlumnos(ArrayList<Estudiante> estudiantes) {
        System.out.println(" ESTUDIANTES ACTUALES **");

        for (Estudiante est : estudiantes) {
            System.out.println(est); // La clase Persona tiene un ToString
        }
    }

    private static void menuAlumnos(ArrayList<Estudiante> estudiantes) {
        int opcion;
        do {

            System.out.println("Dime qué quieres hacer: ");
            System.out.println("1 -> insertar");
            System.out.println("2 -> buscar");
            System.out.println("0 -> salir");
            System.out.print("--->  ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Dime los datos del alumno que quieres incluir: ");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellido = scanner.nextLine();
                    System.out.print("DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nacionalidad: ");
                    String nacionalidad = scanner.nextLine();

                    int numMatricula = matricula();

                    Estudiante nuevo;
                    if (nacionalidad.equalsIgnoreCase(NAC_ESPAÑOLA)) {
                        nuevo = new Estudiante(dni, nombre, apellido, edad, numMatricula);
                    } else {
                        nuevo = new EstudianteExtranjero(dni, nombre, apellido, edad, numMatricula, nacionalidad);
                    }


                    if (!estudiantes.contains(nuevo)) {
                        estudiantes.add(nuevo);
                    } else {
                        System.out.println("Este estudiante ya existe!");
                    }

                    System.out.println();

                    imprimirListaAlumnos(estudiantes);
                    break;

                case 2:
                    System.out.println("¿Que estudiante quieres buscar?: ");
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    System.out.print("Apellidos: ");
                    apellido = scanner.nextLine();
                    System.out.print("DNI: ");
                    dni = scanner.nextLine();
                    System.out.print("Edad: ");
                    edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Numero de Matrícula: ");
                    numMatricula = scanner.nextInt();

                    Estudiante esBuscar = new Estudiante(dni, nombre, apellido, edad, numMatricula);
                    int posicion = estudiantes.indexOf(esBuscar);
                    if (posicion != -1) {
                        System.out.println("Este alumno se encontró en la posición: " + posicion);
                    } else {
                        System.out.println("Este alumno no se encontró");
                    }
                    break;
            }
        } while (opcion != 0);
    }


    public static int matricula(){
        return (int) (Math.random() * 9000) +1000;
    }
}
