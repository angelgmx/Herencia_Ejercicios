package astros;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaAstros {

    public static void main(String[] args) {

        // Crear una lista de objetos de Astro, insertar planetas y satélites
        ArrayList<Astro> astrosCercanos = new ArrayList<>();
        // Mostrar menu que permita al usuario imprimir la información del astro que elija

        // Creamos los astros
        Planeta tierra = new Planeta("Tierra", 5.972e24, 12742, 24, 365.25, 15, 9.81, 149.6e6, 365.25, false);
        // 2. Crear el Satélite (Luna) y asociarlo a la Tierra
        Satelite luna = new Satelite("Luna", 7.342e22, 3474, 655.2, 27.3, -20, 1.62, 384400, 27.3, tierra);
        // 3. Añadir la Luna a la lista de satélites de la Tierra
        tierra.incluirSatelite(luna);

        // Añadimos a la lista de astros los astros para usar la función de buscarAstro
        astrosCercanos.add(tierra);
        astrosCercanos.add(luna);

        // Para buscar un astro le pasamos como parámetro la lista con astros, anteriormente añadimos dos
        buscarAstro(astrosCercanos);

    }

    public static void buscarAstro(ArrayList<Astro> Listastros) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que astro estás buscando?: ");
        String nombreBuscado = scanner.nextLine();

        for (Astro astro : Listastros) {
            if (astro.getNombre().equalsIgnoreCase(nombreBuscado)) {
                astro.muestra();
                return;
            } else {
                System.out.println("NO se encontró");
            }

        }
    }
}
