package empresa;

public class ProgramaEmpleadosEmpresa {

    public static void main(String[] args) {

        // Creamos varias empresas
        Empresa empresa1 = new Empresa("Mercadelice, S.L.", "B-123456789", "655.698.992", "Ctra. Nacional 332, s/n");
        Empresa empresa2 = new Empresa("OREMAPE, S.L.", "B-987654321", "964.66.58.99", "AV Ausias March, nº 5");

        // Creamos varios empleados

        Empleado e1 = new Empleado("Jacinto Serrano", "20.222.444-L", 900);
        Empleado e2 = new Empleado("Marga Giménez", "12.122.221-R", 1500, 35, "666.999.999" , "CL San José, nº 12" );
        Empleado e3 = new Empleado("José Márquez", "22.544.365-N", 2000, 44, "658.134.254", "CL Segorbe, 33");
        Empleado e4 = new Empleado("Maria Sánchez", "53.422.543-P", 1200);
        Empleado e5 = new Empleado("Julián Pérez", "57.455.210-N", 2500, 25, "699.366.333", "AV Suroeste, 133 bajo");

        // Añadimos empleados a las empresas

        empresa1.añadirEmpleado(e1);
        empresa1.añadirEmpleado(e2);
        empresa2.añadirEmpleado(e3);
        empresa2.añadirEmpleado(e4);
        empresa2.añadirEmpleado(e5);

        //Eliminamos un empleado

        empresa1.eliminarEmpleado(e1);

        // Imprime la información de todos los empleados de las dos emmpresas
        empresa1.imprimirEmpleadoIterator();
        empresa2.mostrarEmpleadosForEach();
        // Imprime los sueldos de todos los empleados de las dos emmpresas
        empresa1.imprimeSueldoEmpleados();
        empresa2.imprimeSueldoEmpleados();

    }



}
