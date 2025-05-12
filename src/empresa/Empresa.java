package empresa;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa implements ObligacionesHacienda {


    // Atributos
    private final String nombre;
    private final String cif;
    private String telefono;
    private String direccion;
    ArrayList<Empleado> empleados;
    private double facturacion;


    public Empresa(String nombre,String cif, String telefono, String direccion) {
        this.nombre = nombre;
        this.cif = cif;
        this.telefono = telefono;
        this.direccion = direccion;
        empleados = new ArrayList<>();
    }

    // Metodo para añadir un empleado

    public void añadirEmpleado(Empleado empleado){
        if (!empleados.contains(empleado)) { // Si no se encuentra al empleado
            empleados.add(empleado);
        } else {
            System.out.println("El empleado ya existe en la empresa");
        }
    }

    // Metodo para eliminar un empleado
    public void eliminarEmpleado(Empleado empleado) {
        if (empleados.contains(empleado)) {
            System.out.println("Empleado encontrado, eliminando...");
            empleados.remove(empleado);
        } else {
            System.out.println("El empleado no está disponible en la lista");
        }

    }

    // Imprimir información de empleados
    public void mostrarEmpleados(){
        System.out.println("**INFORMACIÓN DE EMPLEADOS**");

        for (int numEmp = 0; numEmp < empleados.size(); numEmp++) {
            Empleado emp = empleados.get(numEmp);
            emp.imprimirEmpleado();

        }
    }

    // imprimir información de empleados con un for-each
    public void mostrarEmpleadosForEach(){
        for (Empleado emp : empleados) {
            emp.imprimirEmpleado();
        }

    }

    //Imprimir con iterator
    public void imprimirEmpleadoIterator(){
        Iterator<Empleado> it = empleados.iterator();
        while (it.hasNext()) {
            Empleado emp = it.next(); // devuelve el elemento actual de la lista
            emp.imprimirEmpleado();
        }
    }

    // metodo que imprime el sueldo de todos los empleados

    public void imprimeSueldoEmpleados(){
        System.out.println("** INFORMACIÓN SUELDO EMPLEADOS **");

        for (Empleado emp : empleados) {
            System.out.println("DNI: " + emp.getDni() + "Sueldo Bruto: " + emp.getSueldoBruto() + "Sueldo Neto: " + emp.calcuarSueldoNeto());
        }
    }

    // metodo que imprime la suma total del sueldo bruto de todos los empleados
    public double sueldoTotalBruto(){
        double total = 0;
        for (Empleado emp : empleados) {
            total *= emp.getSueldoBruto();
        }
        return total;
    }

    // metodo que calcula el sueldo total neto
    public double sueldoTotalNeto(){
        double total = 0;
        for (Empleado NumEmp : empleados ) {
            total = NumEmp.calcuarSueldoNeto();
        }

        return total;
    }

    // get y set
    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }

    @Override
    public double declarar() {
        double totalDeclaracionesEmpleados = 0;

        for (Empleado emp : empleados) {
            totalDeclaracionesEmpleados += emp.declarar();
        }


        return totalDeclaracionesEmpleados + (facturacion * 0.25);
    }
}
