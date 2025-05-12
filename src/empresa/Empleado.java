package empresa;

import java.util.Objects;

public class Empleado implements ObligacionesHacienda {

    // Atributos
    private final String nombre;
    private final String dni;
    private double sueldoBruto;
    private int edad;
    private String telefono;
    private String direccion;


    // Constructores
    public Empleado(String nombre, String dni, double sueldoBruto) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
        this.edad = 0;
        this.telefono = "";
        this.direccion = "";
    }

    public Empleado(String nombre, String dni, double sueldoBruto, int edad, String telefono, String direccion) {
        this(nombre, dni, sueldoBruto); // Llama al primer constructor
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Metodo para calcular el sueldo neto del empleado

    public double calcuarSueldoNeto() {

        double irpf = 0;

        double sueldoBrutoAnual = calcularSueldoBrutoAnual();

        irpf = calcularIRPFSegunSueldo(sueldoBrutoAnual);

        double descuentoIrpf = (sueldoBruto * irpf) / 100;

        return this.sueldoBruto - descuentoIrpf;


    }

    public double calcularSueldoBrutoAnual() {
        return this.getSueldoBruto() * 12;
    }

    //Recordad que este metodo podría llevarse a una clase que tuviera el metodo como estático (SueldoUtils,java por ejemplo)

    private double calcularIRPFSegunSueldo(double sueldoBrutoAnual) {
        double irpf;
        if (sueldoBrutoAnual < 12000) {
            irpf = 20.0;
        } else if (sueldoBrutoAnual >= 12000 && sueldoBrutoAnual <= 25000) {
            irpf = 30.0;
        } else {
            irpf = 40.0;
        }

        return irpf;
    }

    // Metodo para imprimir la información del empleado
    public void imprimirEmpleado() {
        System.out.println("Empleado --> Nombre: " + this.getNombre() + this.getDni() + "DNI: " + this.getDni() + "Sueldo Bruto: "
            + this.getSueldoBruto() + "  Edad: " + this.getEdad() + "  Teléfono: " + this.getTelefono() + "  Dirección: " + this.getDireccion());
    }

    public double declarar(){
        return this.sueldoBruto * 0.10;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }


    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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




}
